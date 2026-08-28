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

public class als implements aup {
   private static final Logger b = LogUtils.getLogger();
   public static final ald<kb<ii<eu>>> a = ald.a(ale.b("function"));
   private static final akx c = new akx(lw.c(a), ".mcfunction");
   private volatile Map<ale, ii<eu>> d = ImmutableMap.of();
   private final axm<ii<eu>> e = new axm<>(this::a, lw.d(a));
   private volatile Map<ale, List<ii<eu>>> f = Map.of();
   private final int g;
   private final CommandDispatcher<eu> h;

   public Optional<ii<eu>> a(ale $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Map<ale, ii<eu>> a() {
      return this.d;
   }

   public List<ii<eu>> b(ale $$0) {
      return this.f.getOrDefault($$0, List.of());
   }

   public Iterable<ale> b() {
      return this.f.keySet();
   }

   public als(int $$0, CommandDispatcher<eu> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public CompletableFuture<Void> a(aup.a $$0, auv $$1, bog $$2, bog $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<ale, List<axm.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.e.a($$1), $$4);
      CompletableFuture<Map<ale, CompletableFuture<ii<eu>>>> $$7 = CompletableFuture.<Map<ale, aut>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         Map<ale, CompletableFuture<ii<eu>>> $$2x = Maps.newHashMap();
         eu $$3x = new eu(et.a, eyw.c, eyv.a, null, this.g, "", xd.a, null, null);

         for (Entry<ale, aut> $$4x : $$1x.entrySet()) {
            ale $$5x = $$4x.getKey();
            ale $$6x = c.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ii.a($$6x, this.h, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<ale, CompletableFuture<ii<eu>>> $$1x = (Map<ale, CompletableFuture<ii<eu>>>)$$0x.getSecond();
         Builder<ale, ii<eu>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  b.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.d = $$2x.build();
         this.f = this.e.a((Map<ale, List<axm.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(aut $$0) {
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
