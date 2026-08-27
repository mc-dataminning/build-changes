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

public class aks implements ati {
   private static final Logger a = LogUtils.getLogger();
   private static final ajy b = new ajy("functions", ".mcfunction");
   private volatile Map<akf, ho<ec>> c = ImmutableMap.of();
   private final awe<ho<ec>> d = new awe<>(this::a, "tags/functions");
   private volatile Map<akf, Collection<ho<ec>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<ec> g;

   public Optional<ho<ec>> a(akf $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<akf, ho<ec>> a() {
      return this.c;
   }

   public Collection<ho<ec>> b(akf $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<akf> b() {
      return this.e.keySet();
   }

   public aks(int $$0, CommandDispatcher<ec> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(ati.a $$0, ato $$1, ble $$2, ble $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<akf, List<awe.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<akf, CompletableFuture<ho<ec>>>> $$7 = CompletableFuture.<Map<akf, atm>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<akf, CompletableFuture<ho<ec>>> $$2x = Maps.newHashMap();
         ec $$3x = new ec(eb.a, etf.b, ete.a, null, this.f, "", wr.a, null, null);

         for (Entry<akf, atm> $$4x : $$1x.entrySet()) {
            akf $$5x = $$4x.getKey();
            akf $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ho.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<akf, CompletableFuture<ho<ec>>> $$1x = (Map<akf, CompletableFuture<ho<ec>>>)$$0x.getSecond();
         Builder<akf, ho<ec>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<akf, List<awe.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(atm $$0) {
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
