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

public class alx implements auw {
   private static final Logger b = LogUtils.getLogger();
   public static final ali<kd<ik<ew>>> a = ali.a(alj.b("function"));
   private static final alc c = new alc(ma.c(a), ".mcfunction");
   private volatile Map<alj, ik<ew>> d = ImmutableMap.of();
   private final axt<ik<ew>> e = new axt<>(this::a, ma.d(a));
   private volatile Map<alj, List<ik<ew>>> f = Map.of();
   private final int g;
   private final CommandDispatcher<ew> h;

   public Optional<ik<ew>> a(alj $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Map<alj, ik<ew>> a() {
      return this.d;
   }

   public List<ik<ew>> b(alj $$0) {
      return this.f.getOrDefault($$0, List.of());
   }

   public Iterable<alj> b() {
      return this.f.keySet();
   }

   public alx(int $$0, CommandDispatcher<ew> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      CompletableFuture<Map<alj, List<axt.a>>> $$4 = CompletableFuture.supplyAsync(() -> this.e.a($$1), $$2);
      CompletableFuture<Map<alj, CompletableFuture<ik<ew>>>> $$5 = CompletableFuture.<Map<alj, avb>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         Map<alj, CompletableFuture<ik<ew>>> $$2x = Maps.newHashMap();
         ew $$3x = new ew(ev.a, ezy.c, ezx.a, null, this.g, "", xi.a, null, null);

         for (Entry<alj, avb> $$4x : $$1x.entrySet()) {
            alj $$5x = $$4x.getKey();
            alj $$6 = c.b($$5x);
            $$2x.put($$6, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ik.a($$6, this.h, $$3x, $$3xx);
            }, $$2));
         }

         CompletableFuture<?>[] $$7 = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$4.thenCombine($$5, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<alj, CompletableFuture<ik<ew>>> $$1x = (Map<alj, CompletableFuture<ik<ew>>>)$$0x.getSecond();
         Builder<alj, ik<ew>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  b.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.d = $$2x.build();
         this.f = this.e.a((Map<alj, List<axt.a>>)$$0x.getFirst());
      }, $$3);
   }

   private static List<String> a(avb $$0) {
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
