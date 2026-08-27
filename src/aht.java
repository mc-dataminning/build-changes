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

public class aht implements aqb {
   private static final Logger a = LogUtils.getLogger();
   private static final agz b = new agz("functions", ".mcfunction");
   private volatile Map<ahg, hb<ds>> c = ImmutableMap.of();
   private final asw<hb<ds>> d = new asw<>(this::a, "tags/functions");
   private volatile Map<ahg, Collection<hb<ds>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<ds> g;

   public Optional<hb<ds>> a(ahg $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<ahg, hb<ds>> a() {
      return this.c;
   }

   public Collection<hb<ds>> b(ahg $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<ahg> b() {
      return this.e.keySet();
   }

   public aht(int $$0, CommandDispatcher<ds> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(aqb.a $$0, aqh $$1, bgr $$2, bgr $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<ahg, List<asw.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<ahg, CompletableFuture<hb<ds>>>> $$7 = CompletableFuture.<Map<ahg, aqf>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<ahg, CompletableFuture<hb<ds>>> $$2x = Maps.newHashMap();
         ds $$3x = new ds(dr.a, els.b, elr.a, null, this.f, "", ve.a, null, null);

         for (Entry<ahg, aqf> $$4x : $$1x.entrySet()) {
            ahg $$5x = $$4x.getKey();
            ahg $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return hb.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<ahg, CompletableFuture<hb<ds>>> $$1x = (Map<ahg, CompletableFuture<hb<ds>>>)$$0x.getSecond();
         Builder<ahg, hb<ds>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<ahg, List<asw.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(aqf $$0) {
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
