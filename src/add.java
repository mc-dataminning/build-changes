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

public class add implements akr {
   private static final Logger a = LogUtils.getLogger();
   private static final acj b = new acj("functions", ".mcfunction");
   private volatile Map<acq, dn> c = ImmutableMap.of();
   private final anm<dn> d = new anm<>(this::a, "tags/functions");
   private volatile Map<acq, Collection<dn>> e = Map.of();
   private final int f;
   private final CommandDispatcher<ds> g;

   public Optional<dn> a(acq $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<acq, dn> a() {
      return this.c;
   }

   public Collection<dn> b(acq $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<acq> b() {
      return this.e.keySet();
   }

   public add(int $$0, CommandDispatcher<ds> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(akr.a $$0, akx $$1, ban $$2, ban $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<acq, List<anm.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<acq, CompletableFuture<dn>>> $$7 = CompletableFuture.<Map<acq, akv>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<acq, CompletableFuture<dn>> $$2x = Maps.newHashMap();
         ds $$3x = new ds(dr.a, eei.b, eeh.a, null, this.f, "", sv.a, null, null);

         for (Entry<acq, akv> $$4x : $$1x.entrySet()) {
            acq $$5x = $$4x.getKey();
            acq $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return dn.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<acq, CompletableFuture<dn>> $$1x = (Map<acq, CompletableFuture<dn>>)$$0x.getSecond();
         Builder<acq, dn> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<acq, List<anm.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(akv $$0) {
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
