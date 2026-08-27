import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alb implements atr {
   private static final Logger a = LogUtils.getLogger();
   private static final akg b = new akg("functions", ".mcfunction");
   private volatile Map<akn, hq<ee>> c = ImmutableMap.of();
   private final awn<hq<ee>> d = new awn<>(this::a, "tags/functions");
   private volatile Map<akn, Collection<hq<ee>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<ee> g;

   public Optional<hq<ee>> a(akn $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<akn, hq<ee>> a() {
      return this.c;
   }

   public Collection<hq<ee>> b(akn $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<akn> b() {
      return this.e.keySet();
   }

   public alb(int $$0, CommandDispatcher<ee> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(atr.a $$0, atx $$1, bmk $$2, bmk $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<akn, List<awn.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<akn, CompletableFuture<hq<ee>>>> $$7 = CompletableFuture.<Map<akn, atv>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<akn, CompletableFuture<hq<ee>>> $$2x = Maps.newHashMap();
         ee $$3x = new ee(ed.a, eum.b, eul.a, null, this.f, "", ww.a, null, null);

         for (Entry<akn, atv> $$4x : $$1x.entrySet()) {
            akn $$5x = $$4x.getKey();
            akn $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return hq.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<akn, CompletableFuture<hq<ee>>> $$1x = (Map<akn, CompletableFuture<hq<ee>>>)$$0x.getSecond();
         Builder<akn, hq<ee>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<akn, List<awn.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(atv $$0) {
      try {
         List var2;
         try (BufferedReader $$1 = $$0.e()) {
            var2 = $$1.lines().toList();
         }

         return var2;
      } catch (IOException var6) {
         throw new CompletionException(var6);
      }
   }
}
