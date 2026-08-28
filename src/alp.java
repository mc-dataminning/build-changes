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

public class alp implements auf {
   private static final Logger a = LogUtils.getLogger();
   private static final aku b = new aku("functions", ".mcfunction");
   private volatile Map<alb, ib<ep>> c = ImmutableMap.of();
   private final axc<ib<ep>> d = new axc<>(this::a, "tags/functions");
   private volatile Map<alb, Collection<ib<ep>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<ep> g;

   public Optional<ib<ep>> a(alb $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<alb, ib<ep>> a() {
      return this.c;
   }

   public Collection<ib<ep>> b(alb $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<alb> b() {
      return this.e.keySet();
   }

   public alp(int $$0, CommandDispatcher<ep> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(auf.a $$0, aul $$1, bnd $$2, bnd $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<alb, List<axc.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<alb, CompletableFuture<ib<ep>>>> $$7 = CompletableFuture.<Map<alb, auj>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<alb, CompletableFuture<ib<ep>>> $$2x = Maps.newHashMap();
         ep $$3x = new ep(eo.a, evm.b, evl.a, null, this.f, "", xk.a, null, null);

         for (Entry<alb, auj> $$4x : $$1x.entrySet()) {
            alb $$5x = $$4x.getKey();
            alb $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ib.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<alb, CompletableFuture<ib<ep>>> $$1x = (Map<alb, CompletableFuture<ib<ep>>>)$$0x.getSecond();
         Builder<alb, ib<ep>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<alb, List<axc.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(auj $$0) {
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
