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

public class aky implements ato {
   private static final Logger a = LogUtils.getLogger();
   private static final akd b = new akd("functions", ".mcfunction");
   private volatile Map<akk, ic<eq>> c = ImmutableMap.of();
   private final awl<ic<eq>> d = new awl<>(this::a, "tags/functions");
   private volatile Map<akk, Collection<ic<eq>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<eq> g;

   public Optional<ic<eq>> a(akk $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<akk, ic<eq>> a() {
      return this.c;
   }

   public Collection<ic<eq>> b(akk $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<akk> b() {
      return this.e.keySet();
   }

   public aky(int $$0, CommandDispatcher<eq> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(ato.a $$0, atu $$1, bmr $$2, bmr $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<akk, List<awl.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<akk, CompletableFuture<ic<eq>>>> $$7 = CompletableFuture.<Map<akk, ats>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<akk, CompletableFuture<ic<eq>>> $$2x = Maps.newHashMap();
         eq $$3x = new eq(ep.a, evz.b, evy.a, null, this.f, "", wt.a, null, null);

         for (Entry<akk, ats> $$4x : $$1x.entrySet()) {
            akk $$5x = $$4x.getKey();
            akk $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ic.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<akk, CompletableFuture<ic<eq>>> $$1x = (Map<akk, CompletableFuture<ic<eq>>>)$$0x.getSecond();
         Builder<akk, ic<eq>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<akk, List<awl.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(ats $$0) {
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
