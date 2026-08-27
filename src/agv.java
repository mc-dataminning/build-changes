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

public class agv implements apb {
   private static final Logger a = LogUtils.getLogger();
   private static final agb b = new agb("functions", ".mcfunction");
   private volatile Map<agi, gx<du>> c = ImmutableMap.of();
   private final arw<gx<du>> d = new arw<>(this::a, "tags/functions");
   private volatile Map<agi, Collection<gx<du>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<du> g;

   public Optional<gx<du>> a(agi $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<agi, gx<du>> a() {
      return this.c;
   }

   public Collection<gx<du>> b(agi $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<agi> b() {
      return this.e.keySet();
   }

   public agv(int $$0, CommandDispatcher<du> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(apb.a $$0, aph $$1, bfo $$2, bfo $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<agi, List<arw.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<agi, CompletableFuture<gx<du>>>> $$7 = CompletableFuture.<Map<agi, apf>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<agi, CompletableFuture<gx<du>>> $$2x = Maps.newHashMap();
         du $$3x = new du(dt.a, eju.b, ejt.a, null, this.f, "", uq.a, null, null);

         for (Entry<agi, apf> $$4x : $$1x.entrySet()) {
            agi $$5x = $$4x.getKey();
            agi $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return gx.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<agi, CompletableFuture<gx<du>>> $$1x = (Map<agi, CompletableFuture<gx<du>>>)$$0x.getSecond();
         Builder<agi, gx<du>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<agi, List<arw.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(apf $$0) {
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
