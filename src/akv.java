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

public class akv implements atl {
   private static final Logger a = LogUtils.getLogger();
   private static final aka b = new aka("functions", ".mcfunction");
   private volatile Map<akh, hp<ed>> c = ImmutableMap.of();
   private final awh<hp<ed>> d = new awh<>(this::a, "tags/functions");
   private volatile Map<akh, Collection<hp<ed>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<ed> g;

   public Optional<hp<ed>> a(akh $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<akh, hp<ed>> a() {
      return this.c;
   }

   public Collection<hp<ed>> b(akh $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<akh> b() {
      return this.e.keySet();
   }

   public akv(int $$0, CommandDispatcher<ed> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(atl.a $$0, atr $$1, bma $$2, bma $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<akh, List<awh.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<akh, CompletableFuture<hp<ed>>>> $$7 = CompletableFuture.<Map<akh, atp>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<akh, CompletableFuture<hp<ed>>> $$2x = Maps.newHashMap();
         ed $$3x = new ed(ec.a, etp.b, eto.a, null, this.f, "", wt.a, null, null);

         for (Entry<akh, atp> $$4x : $$1x.entrySet()) {
            akh $$5x = $$4x.getKey();
            akh $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return hp.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<akh, CompletableFuture<hp<ed>>> $$1x = (Map<akh, CompletableFuture<hp<ed>>>)$$0x.getSecond();
         Builder<akh, hp<ed>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<akh, List<awh.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(atp $$0) {
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
