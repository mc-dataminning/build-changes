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

public class alp implements aum {
   private static final Logger b = LogUtils.getLogger();
   public static final ala<ka<ih<et>>> a = ala.a(alb.b("function"));
   private static final aku c = new aku(lv.c(a), ".mcfunction");
   private volatile Map<alb, ih<et>> d = ImmutableMap.of();
   private final axj<ih<et>> e = new axj<>(this::a, lv.d(a));
   private volatile Map<alb, List<ih<et>>> f = Map.of();
   private final int g;
   private final CommandDispatcher<et> h;

   public Optional<ih<et>> a(alb $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Map<alb, ih<et>> a() {
      return this.d;
   }

   public List<ih<et>> b(alb $$0) {
      return this.f.getOrDefault($$0, List.of());
   }

   public Iterable<alb> b() {
      return this.f.keySet();
   }

   public alp(int $$0, CommandDispatcher<et> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public CompletableFuture<Void> a(aum.a $$0, aus $$1, bny $$2, bny $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<alb, List<axj.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.e.a($$1), $$4);
      CompletableFuture<Map<alb, CompletableFuture<ih<et>>>> $$7 = CompletableFuture.<Map<alb, auq>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         Map<alb, CompletableFuture<ih<et>>> $$2x = Maps.newHashMap();
         et $$3x = new et(es.a, eye.c, eyd.a, null, this.g, "", xc.a, null, null);

         for (Entry<alb, auq> $$4x : $$1x.entrySet()) {
            alb $$5x = $$4x.getKey();
            alb $$6x = c.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ih.a($$6x, this.h, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<alb, CompletableFuture<ih<et>>> $$1x = (Map<alb, CompletableFuture<ih<et>>>)$$0x.getSecond();
         Builder<alb, ih<et>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  b.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.d = $$2x.build();
         this.f = this.e.a((Map<alb, List<axj.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(auq $$0) {
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
