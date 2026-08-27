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

public class aki implements asy {
   private static final Logger a = LogUtils.getLogger();
   private static final ajo b = new ajo("functions", ".mcfunction");
   private volatile Map<ajv, hh<dv>> c = ImmutableMap.of();
   private final avu<hh<dv>> d = new avu<>(this::a, "tags/functions");
   private volatile Map<ajv, Collection<hh<dv>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<dv> g;

   public Optional<hh<dv>> a(ajv $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<ajv, hh<dv>> a() {
      return this.c;
   }

   public Collection<hh<dv>> b(ajv $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<ajv> b() {
      return this.e.keySet();
   }

   public aki(int $$0, CommandDispatcher<dv> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(asy.a $$0, ate $$1, bkt $$2, bkt $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<ajv, List<avu.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<ajv, CompletableFuture<hh<dv>>>> $$7 = CompletableFuture.<Map<ajv, atc>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<ajv, CompletableFuture<hh<dv>>> $$2x = Maps.newHashMap();
         dv $$3x = new dv(du.a, esj.b, esi.a, null, this.f, "", wh.a, null, null);

         for (Entry<ajv, atc> $$4x : $$1x.entrySet()) {
            ajv $$5x = $$4x.getKey();
            ajv $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return hh.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<ajv, CompletableFuture<hh<dv>>> $$1x = (Map<ajv, CompletableFuture<hh<dv>>>)$$0x.getSecond();
         Builder<ajv, hh<dv>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<ajv, List<avu.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(atc $$0) {
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
