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

public class afh implements anj {
   private static final Logger a = LogUtils.getLogger();
   private static final aen b = new aen("functions", ".mcfunction");
   private volatile Map<aeu, dp> c = ImmutableMap.of();
   private final aqe<dp> d = new aqe<>(this::a, "tags/functions");
   private volatile Map<aeu, Collection<dp>> e = Map.of();
   private final int f;
   private final CommandDispatcher<dt> g;

   public Optional<dp> a(aeu $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<aeu, dp> a() {
      return this.c;
   }

   public Collection<dp> b(aeu $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<aeu> b() {
      return this.e.keySet();
   }

   public afh(int $$0, CommandDispatcher<dt> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(anj.a $$0, anp $$1, bdk $$2, bdk $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<aeu, List<aqe.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<aeu, CompletableFuture<dp>>> $$7 = CompletableFuture.<Map<aeu, ann>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<aeu, CompletableFuture<dp>> $$2x = Maps.newHashMap();
         dt $$3x = new dt(ds.a, ehi.b, ehh.a, null, this.f, "", th.a, null, null);

         for (Entry<aeu, ann> $$4x : $$1x.entrySet()) {
            aeu $$5x = $$4x.getKey();
            aeu $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return dp.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<aeu, CompletableFuture<dp>> $$1x = (Map<aeu, CompletableFuture<dp>>)$$0x.getSecond();
         Builder<aeu, dp> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<aeu, List<aqe.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(ann $$0) {
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
