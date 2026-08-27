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

public class alh implements atx {
   private static final Logger a = LogUtils.getLogger();
   private static final akm b = new akm("functions", ".mcfunction");
   private volatile Map<akt, ht<eh>> c = ImmutableMap.of();
   private final awu<ht<eh>> d = new awu<>(this::a, "tags/functions");
   private volatile Map<akt, Collection<ht<eh>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<eh> g;

   public Optional<ht<eh>> a(akt $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<akt, ht<eh>> a() {
      return this.c;
   }

   public Collection<ht<eh>> b(akt $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<akt> b() {
      return this.e.keySet();
   }

   public alh(int $$0, CommandDispatcher<eh> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(atx.a $$0, aud $$1, bmo $$2, bmo $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<akt, List<awu.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<akt, CompletableFuture<ht<eh>>>> $$7 = CompletableFuture.<Map<akt, aub>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<akt, CompletableFuture<ht<eh>>> $$2x = Maps.newHashMap();
         eh $$3x = new eh(eg.a, ewu.b, ewt.a, null, this.f, "", xd.a, null, null);

         for (Entry<akt, aub> $$4x : $$1x.entrySet()) {
            akt $$5x = $$4x.getKey();
            akt $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ht.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<akt, CompletableFuture<ht<eh>>> $$1x = (Map<akt, CompletableFuture<ht<eh>>>)$$0x.getSecond();
         Builder<akt, ht<eh>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<akt, List<awu.a>>)$$0x.getFirst());
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
