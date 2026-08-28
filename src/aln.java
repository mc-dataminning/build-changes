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

public class aln {
   private static final Logger a = LogUtils.getLogger();
   private static final ke b = new ke(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<aln.b> a(jz<alm> $$0, List<kf.a<?>> $$1, ava $$2, Executor $$3) {
      List<ju.b<?>> $$4 = axq.a($$0.b(alm.d), $$1);
      ju.a $$5 = ju.a.a($$4.stream());
      alb<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<ko<?>>> $$7 = exn.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<ko<?>>> $$8 = af.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<ko<?>> a(exn<T> $$0, alb<JsonElement> $$1, ava $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         ko<T> $$3x = new ka<>($$0.b(), Lifecycle.experimental());
         Map<ald, T> $$4 = new HashMap<>();
         ave.a($$2, $$0.b(), $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(alc.a($$0.b(), $$2xx), (T)$$3xx, b));
         axq.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static aln.b a(jz<alm> $$0, ju.a $$1, List<ko<?>> $$2) {
      jz<alm> $$3 = a($$0, $$2);
      ju.a $$4 = a($$1, $$3.a(alm.d));
      a($$4);
      return new aln.b($$3, $$4);
   }

   private static ju.a a(ju.a $$0, ju.a $$1) {
      return ju.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(ju.a $$0) {
      azq.a $$1 = new azq.a();
      exr $$2 = new exr($$1, fae.q, $$0);
      exn.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jz<alm> a(jz<alm> $$0, List<ko<?>> $$1) {
      return $$0.a(alm.d, new kg.c($$1).e());
   }

   private static <T> void a(exr $$0, exn<T> $$1, ju.a $$2) {
      ju<T> $$3 = $$2.e($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final ju.a a;

      public a(ju.a $$0) {
         this.a = $$0;
      }

      public jt.a a() {
         return this.a;
      }

      public Collection<ald> a(alc<? extends kf<?>> $$0) {
         return this.a.e($$0).c_().map(alc::a).toList();
      }

      public exq b(alc<exq> $$0) {
         return this.a.a(me.bn).flatMap($$1 -> $$1.a($$0)).map(js::a).orElse(exq.a);
      }
   }

   public static record b(jz<alm> a, ju.a b) {
   }
}
