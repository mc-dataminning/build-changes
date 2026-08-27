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

public class afl implements anp {
   private static final Logger a = LogUtils.getLogger();
   private static final aer b = new aer("functions", ".mcfunction");
   private volatile Map<aey, dp> c = ImmutableMap.of();
   private final aqk<dp> d = new aqk<>(this::a, "tags/functions");
   private volatile Map<aey, Collection<dp>> e = Map.of();
   private final int f;
   private final CommandDispatcher<dt> g;

   public Optional<dp> a(aey $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<aey, dp> a() {
      return this.c;
   }

   public Collection<dp> b(aey $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<aey> b() {
      return this.e.keySet();
   }

   public afl(int $$0, CommandDispatcher<dt> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(anp.a $$0, anv $$1, bdr $$2, bdr $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<aey, List<aqk.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<aey, CompletableFuture<dp>>> $$7 = CompletableFuture.<Map<aey, ant>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<aey, CompletableFuture<dp>> $$2x = Maps.newHashMap();
         dt $$3x = new dt(ds.a, ehp.b, eho.a, null, this.f, "", tm.a, null, null);

         for (Entry<aey, ant> $$4x : $$1x.entrySet()) {
            aey $$5x = $$4x.getKey();
            aey $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return dp.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<aey, CompletableFuture<dp>> $$1x = (Map<aey, CompletableFuture<dp>>)$$0x.getSecond();
         Builder<aey, dp> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<aey, List<aqk.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(ant $$0) {
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
