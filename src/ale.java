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

public class ale implements atx {
   private static final Logger b = LogUtils.getLogger();
   public static final akp<jz<ig<et>>> a = akp.a(akq.b("function"));
   private static final akj c = new akj(lu.c(a), ".mcfunction");
   private volatile Map<akq, ig<et>> d = ImmutableMap.of();
   private final awu<ig<et>> e = new awu<>(this::a, lu.d(a));
   private volatile Map<akq, Collection<ig<et>>> f = Map.of();
   private final int g;
   private final CommandDispatcher<et> h;

   public Optional<ig<et>> a(akq $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Map<akq, ig<et>> a() {
      return this.d;
   }

   public Collection<ig<et>> b(akq $$0) {
      return this.f.getOrDefault($$0, List.of());
   }

   public Iterable<akq> b() {
      return this.f.keySet();
   }

   public ale(int $$0, CommandDispatcher<et> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public CompletableFuture<Void> a(atx.a $$0, aud $$1, bne $$2, bne $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<akq, List<awu.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.e.a($$1), $$4);
      CompletableFuture<Map<akq, CompletableFuture<ig<et>>>> $$7 = CompletableFuture.<Map<akq, aub>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         Map<akq, CompletableFuture<ig<et>>> $$2x = Maps.newHashMap();
         et $$3x = new et(es.a, eww.b, ewv.a, null, this.g, "", wx.a, null, null);

         for (Entry<akq, aub> $$4x : $$1x.entrySet()) {
            akq $$5x = $$4x.getKey();
            akq $$6x = c.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ig.a($$6x, this.h, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<akq, CompletableFuture<ig<et>>> $$1x = (Map<akq, CompletableFuture<ig<et>>>)$$0x.getSecond();
         Builder<akq, ig<et>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  b.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.d = $$2x.build();
         this.f = this.e.a((Map<akq, List<awu.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(aub $$0) {
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
