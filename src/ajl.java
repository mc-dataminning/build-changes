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

public class ajl implements aru {
   private static final Logger a = LogUtils.getLogger();
   private static final air b = new air("functions", ".mcfunction");
   private volatile Map<aiy, hd<du>> c = ImmutableMap.of();
   private final aup<hd<du>> d = new aup<>(this::a, "tags/functions");
   private volatile Map<aiy, Collection<hd<du>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<du> g;

   public Optional<hd<du>> a(aiy $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<aiy, hd<du>> a() {
      return this.c;
   }

   public Collection<hd<du>> b(aiy $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<aiy> b() {
      return this.e.keySet();
   }

   public ajl(int $$0, CommandDispatcher<du> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(aru.a $$0, asa $$1, bil $$2, bil $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<aiy, List<aup.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<aiy, CompletableFuture<hd<du>>>> $$7 = CompletableFuture.<Map<aiy, ary>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<aiy, CompletableFuture<hd<du>>> $$2x = Maps.newHashMap();
         du $$3x = new du(dt.a, ens.b, enr.a, null, this.f, "", vp.a, null, null);

         for (Entry<aiy, ary> $$4x : $$1x.entrySet()) {
            aiy $$5x = $$4x.getKey();
            aiy $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return hd.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<aiy, CompletableFuture<hd<du>>> $$1x = (Map<aiy, CompletableFuture<hd<du>>>)$$0x.getSecond();
         Builder<aiy, hd<du>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<aiy, List<aup.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(ary $$0) {
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
