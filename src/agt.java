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

public class agt implements aox {
   private static final Logger a = LogUtils.getLogger();
   private static final afz b = new afz("functions", ".mcfunction");
   private volatile Map<agg, gx<du>> c = ImmutableMap.of();
   private final ars<gx<du>> d = new ars<>(this::a, "tags/functions");
   private volatile Map<agg, Collection<gx<du>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<du> g;

   public Optional<gx<du>> a(agg $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<agg, gx<du>> a() {
      return this.c;
   }

   public Collection<gx<du>> b(agg $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<agg> b() {
      return this.e.keySet();
   }

   public agt(int $$0, CommandDispatcher<du> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(aox.a $$0, apd $$1, bfh $$2, bfh $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<agg, List<ars.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<agg, CompletableFuture<gx<du>>>> $$7 = CompletableFuture.<Map<agg, apb>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<agg, CompletableFuture<gx<du>>> $$2x = Maps.newHashMap();
         du $$3x = new du(dt.a, eji.b, ejh.a, null, this.f, "", uq.a, null, null);

         for (Entry<agg, apb> $$4x : $$1x.entrySet()) {
            agg $$5x = $$4x.getKey();
            agg $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return gx.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<agg, CompletableFuture<gx<du>>> $$1x = (Map<agg, CompletableFuture<gx<du>>>)$$0x.getSecond();
         Builder<agg, gx<du>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<agg, List<ars.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(apb $$0) {
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
