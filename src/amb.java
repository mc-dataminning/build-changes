import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class amb {
   private static final Logger a = LogUtils.getLogger();
   private static final js b = new js(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<amb.b> a(jn<ama> $$0, List<jt.a<?>> $$1, avo $$2, Executor $$3) {
      List<ji.b<?>> $$4 = ayd.a($$0.b(ama.d), $$1);
      ji.a $$5 = ji.a.a($$4.stream());
      alp<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kc<?>>> $$7 = fav.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kc<?>>> $$8 = ag.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kc<?>> a(fav<T> $$0, alp<JsonElement> $$1, avo $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kc<T> $$3x = new jo<>($$0.b(), Lifecycle.experimental());
         Map<alr, T> $$4 = new HashMap<>();
         avs.a($$2, $$0.b(), $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(alq.a($$0.b(), $$2xx), (T)$$3xx, b));
         ayd.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static amb.b a(jn<ama> $$0, ji.a $$1, List<kc<?>> $$2) {
      jn<ama> $$3 = a($$0, $$2);
      ji.a $$4 = a($$1, $$3.a(ama.d));
      a($$4);
      return new amb.b($$3, $$4);
   }

   private static ji.a a(ji.a $$0, ji.a $$1) {
      return ji.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(ji.a $$0) {
      bag.a $$1 = new bag.a();
      faz $$2 = new faz($$1, fdm.q, $$0);
      fav.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jn<ama> a(jn<ama> $$0, List<kc<?>> $$1) {
      return $$0.a(ama.d, new ju.c($$1).e());
   }

   private static <T> void a(faz $$0, fav<T> $$1, ji.a $$2) {
      ji<T> $$3 = $$2.e($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final ji.a a;

      public a(ji.a $$0) {
         this.a = $$0;
      }

      public jh.a a() {
         return this.a;
      }

      public Collection<alr> a(alq<? extends jt<?>> $$0) {
         return this.a.e($$0).c_().map(alq::a).toList();
      }

      public fay b(alq<fay> $$0) {
         return this.a.a(mi.br).flatMap($$1 -> $$1.a($$0)).map(jg::a).orElse(fay.f);
      }
   }

   public static record b(jn<ama> a, ji.a b) {
   }
}
