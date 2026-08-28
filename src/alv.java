import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alv implements aut {
   private static final Logger b = LogUtils.getLogger();
   public static final alg<kc<ij<ev>>> a = alg.a(alh.b("function"));
   private static final ala c = new ala(ly.c(a), ".mcfunction");
   private volatile Map<alh, ij<ev>> d = ImmutableMap.of();
   private final axq<ij<ev>> e = new axq<>(this::a, ly.d(a));
   private volatile Map<alh, List<ij<ev>>> f = Map.of();
   private final int g;
   private final CommandDispatcher<ev> h;

   public Optional<ij<ev>> a(alh $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Map<alh, ij<ev>> a() {
      return this.d;
   }

   public List<ij<ev>> b(alh $$0) {
      return this.f.getOrDefault($$0, List.of());
   }

   public Iterable<alh> b() {
      return this.f.keySet();
   }

   public alv(int $$0, CommandDispatcher<ev> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public CompletableFuture<Void> a(aut.a $$0, ava $$1, bok $$2, bok $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<alh, List<axq.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.e.a($$1), $$4);
      CompletableFuture<Map<alh, CompletableFuture<ij<ev>>>> $$7 = CompletableFuture.<Map<alh, auy>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         Map<alh, CompletableFuture<ij<ev>>> $$2x = Maps.newHashMap();
         ev $$3x = new ev(eu.a, ezh.c, ezg.a, null, this.g, "", xg.a, null, null);

         for (Entry<alh, auy> $$4x : $$1x.entrySet()) {
            alh $$5x = $$4x.getKey();
            alh $$6x = c.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ij.a($$6x, this.h, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<alh, CompletableFuture<ij<ev>>> $$1x = (Map<alh, CompletableFuture<ij<ev>>>)$$0x.getSecond();
         Builder<alh, ij<ev>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  b.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.d = $$2x.build();
         this.f = this.e.a((Map<alh, List<axq.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(auy $$0) {
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
