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

public class ali implements auj {
   private static final Logger b = LogUtils.getLogger();
   public static final akt<ke<il<ex>>> a = akt.a(aku.b("function"));
   private static final akn c = new akn(mc.c(a), ".mcfunction");
   private volatile Map<aku, il<ex>> d = ImmutableMap.of();
   private final axg<il<ex>> e = new axg<>(($$0x, $$1x) -> this.a($$0x), mc.d(a));
   private volatile Map<aku, List<il<ex>>> f = Map.of();
   private final int g;
   private final CommandDispatcher<ex> h;

   public Optional<il<ex>> a(aku $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Map<aku, il<ex>> a() {
      return this.d;
   }

   public List<il<ex>> b(aku $$0) {
      return this.f.getOrDefault($$0, List.of());
   }

   public Iterable<aku> b() {
      return this.f.keySet();
   }

   public ali(int $$0, CommandDispatcher<ex> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      CompletableFuture<Map<aku, List<axg.b>>> $$4 = CompletableFuture.supplyAsync(() -> this.e.a($$1), $$2);
      CompletableFuture<Map<aku, CompletableFuture<il<ex>>>> $$5 = CompletableFuture.<Map<aku, aun>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         Map<aku, CompletableFuture<il<ex>>> $$2x = Maps.newHashMap();
         ex $$3x = new ex(ew.a, fbx.c, fbw.a, null, this.g, "", wo.a, null, null);

         for (Entry<aku, aun> $$4x : $$1x.entrySet()) {
            aku $$5x = $$4x.getKey();
            aku $$6 = c.b($$5x);
            $$2x.put($$6, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return il.a($$6, this.h, $$3x, $$3xx);
            }, $$2));
         }

         CompletableFuture<?>[] $$7 = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$4.thenCombine($$5, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<aku, CompletableFuture<il<ex>>> $$1x = (Map<aku, CompletableFuture<il<ex>>>)$$0x.getSecond();
         Builder<aku, il<ex>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  b.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.d = $$2x.build();
         this.f = this.e.a((Map<aku, List<axg.b>>)$$0x.getFirst());
      }, $$3);
   }

   private static List<String> a(aun $$0) {
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
