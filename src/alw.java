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

public class alw implements auz {
   private static final Logger b = LogUtils.getLogger();
   public static final alh<js<hx<ej>>> a = alh.a(ali.b("function"));
   private static final alb c = new alb(mh.c(a), ".mcfunction");
   private volatile Map<ali, hx<ej>> d = ImmutableMap.of();
   private final axu<hx<ej>> e = new axu<>(($$0x, $$1x) -> this.a($$0x), mh.d(a));
   private volatile Map<ali, List<hx<ej>>> f = Map.of();
   private final int g;
   private final CommandDispatcher<ej> h;

   public Optional<hx<ej>> a(ali $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Map<ali, hx<ej>> a() {
      return this.d;
   }

   public List<hx<ej>> b(ali $$0) {
      return this.f.getOrDefault($$0, List.of());
   }

   public Iterable<ali> b() {
      return this.f.keySet();
   }

   public alw(int $$0, CommandDispatcher<ej> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public CompletableFuture<Void> reload(auz.a $$0, avf $$1, Executor $$2, Executor $$3) {
      CompletableFuture<Map<ali, List<axu.b>>> $$4 = CompletableFuture.supplyAsync(() -> this.e.a($$1), $$2);
      CompletableFuture<Map<ali, CompletableFuture<hx<ej>>>> $$5 = CompletableFuture.<Map<ali, avd>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         Map<ali, CompletableFuture<hx<ej>>> $$2x = Maps.newHashMap();
         ej $$3x = new ej(ei.a, ffq.c, ffp.a, null, this.g, "", wz.a, null, null);

         for (Entry<ali, avd> $$4x : $$1x.entrySet()) {
            ali $$5x = $$4x.getKey();
            ali $$6 = c.b($$5x);
            $$2x.put($$6, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return hx.a($$6, this.h, $$3x, $$3xx);
            }, $$2));
         }

         CompletableFuture<?>[] $$7 = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$4.thenCombine($$5, Pair::of).thenCompose($$0::wait).thenAcceptAsync($$0x -> {
         Map<ali, CompletableFuture<hx<ej>>> $$1x = (Map<ali, CompletableFuture<hx<ej>>>)$$0x.getSecond();
         Builder<ali, hx<ej>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  b.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.d = $$2x.build();
         this.f = this.e.a((Map<ali, List<axu.b>>)$$0x.getFirst());
      }, $$3);
   }

   private static List<String> a(avd $$0) {
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
