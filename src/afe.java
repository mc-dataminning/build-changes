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

public class afe implements ang {
   private static final Logger a = LogUtils.getLogger();
   private static final aek b = new aek("functions", ".mcfunction");
   private volatile Map<aer, dm> c = ImmutableMap.of();
   private final aqb<dm> d = new aqb<>(this::a, "tags/functions");
   private volatile Map<aer, Collection<dm>> e = Map.of();
   private final int f;
   private final CommandDispatcher<dr> g;

   public Optional<dm> a(aer $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<aer, dm> a() {
      return this.c;
   }

   public Collection<dm> b(aer $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<aer> b() {
      return this.e.keySet();
   }

   public afe(int $$0, CommandDispatcher<dr> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(ang.a $$0, anm $$1, bdh $$2, bdh $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<aer, List<aqb.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<aer, CompletableFuture<dm>>> $$7 = CompletableFuture.<Map<aer, ank>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<aer, CompletableFuture<dm>> $$2x = Maps.newHashMap();
         dr $$3x = new dr(dq.a, ehe.b, ehd.a, null, this.f, "", te.a, null, null);

         for (Entry<aer, ank> $$4x : $$1x.entrySet()) {
            aer $$5x = $$4x.getKey();
            aer $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return dm.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<aer, CompletableFuture<dm>> $$1x = (Map<aer, CompletableFuture<dm>>)$$0x.getSecond();
         Builder<aer, dm> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<aer, List<aqb.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(ank $$0) {
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
