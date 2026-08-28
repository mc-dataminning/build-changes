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

public class als implements auu {
   private static final Logger b = LogUtils.getLogger();
   public static final ald<jr<hw<ei>>> a = ald.a(ale.b("function"));
   private static final akx c = new akx(mg.c(a), ".mcfunction");
   private volatile Map<ale, hw<ei>> d = ImmutableMap.of();
   private final axq<hw<ei>> e = new axq<>(($$0x, $$1x) -> this.a($$0x), mg.d(a));
   private volatile Map<ale, List<hw<ei>>> f = Map.of();
   private final int g;
   private final CommandDispatcher<ei> h;

   public Optional<hw<ei>> a(ale $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Map<ale, hw<ei>> a() {
      return this.d;
   }

   public List<hw<ei>> b(ale $$0) {
      return this.f.getOrDefault($$0, List.of());
   }

   public Iterable<ale> b() {
      return this.f.keySet();
   }

   public als(int $$0, CommandDispatcher<ei> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      CompletableFuture<Map<ale, List<axq.b>>> $$4 = CompletableFuture.supplyAsync(() -> this.e.a($$1), $$2);
      CompletableFuture<Map<ale, CompletableFuture<hw<ei>>>> $$5 = CompletableFuture.<Map<ale, auz>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         Map<ale, CompletableFuture<hw<ei>>> $$2x = Maps.newHashMap();
         ei $$3x = new ei(eh.a, fdw.c, fdv.a, null, this.g, "", wv.a, null, null);

         for (Entry<ale, auz> $$4x : $$1x.entrySet()) {
            ale $$5x = $$4x.getKey();
            ale $$6 = c.b($$5x);
            $$2x.put($$6, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return hw.a($$6, this.h, $$3x, $$3xx);
            }, $$2));
         }

         CompletableFuture<?>[] $$7 = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$4.thenCombine($$5, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<ale, CompletableFuture<hw<ei>>> $$1x = (Map<ale, CompletableFuture<hw<ei>>>)$$0x.getSecond();
         Builder<ale, hw<ei>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  b.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.d = $$2x.build();
         this.f = this.e.a((Map<ale, List<axq.b>>)$$0x.getFirst());
      }, $$3);
   }

   private static List<String> a(auz $$0) {
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
