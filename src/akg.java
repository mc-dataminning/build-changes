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

public class akg implements asw {
   private static final Logger a = LogUtils.getLogger();
   private static final ajm b = new ajm("functions", ".mcfunction");
   private volatile Map<ajt, hf<du>> c = ImmutableMap.of();
   private final avs<hf<du>> d = new avs<>(this::a, "tags/functions");
   private volatile Map<ajt, Collection<hf<du>>> e = Map.of();
   private final int f;
   private final CommandDispatcher<du> g;

   public Optional<hf<du>> a(ajt $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   public Map<ajt, hf<du>> a() {
      return this.c;
   }

   public Collection<hf<du>> b(ajt $$0) {
      return this.e.getOrDefault($$0, List.of());
   }

   public Iterable<ajt> b() {
      return this.e.keySet();
   }

   public akg(int $$0, CommandDispatcher<du> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   @Override
   public CompletableFuture<Void> a(asw.a $$0, atc $$1, bko $$2, bko $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<ajt, List<avs.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.d.a($$1), $$4);
      CompletableFuture<Map<ajt, CompletableFuture<hf<du>>>> $$7 = CompletableFuture.<Map<ajt, ata>>supplyAsync(() -> b.a($$1), $$4).thenCompose($$1x -> {
         Map<ajt, CompletableFuture<hf<du>>> $$2x = Maps.newHashMap();
         du $$3x = new du(dt.a, esa.b, erz.a, null, this.f, "", wf.a, null, null);

         for (Entry<ajt, ata> $$4x : $$1x.entrySet()) {
            ajt $$5x = $$4x.getKey();
            ajt $$6x = b.b($$5x);
            $$2x.put($$6x, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return hf.a($$6x, this.g, $$3x, $$3xx);
            }, $$4));
         }

         CompletableFuture<?>[] $$7x = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7x).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<ajt, CompletableFuture<hf<du>>> $$1x = (Map<ajt, CompletableFuture<hf<du>>>)$$0x.getSecond();
         Builder<ajt, hf<du>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.c = $$2x.build();
         this.e = this.d.a((Map<ajt, List<avs.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(ata $$0) {
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
