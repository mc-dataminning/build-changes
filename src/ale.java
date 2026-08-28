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

public class ale {
   private static final Logger a = LogUtils.getLogger();
   private static final kd b = new kd(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<ale.b> a(jy<ald> $$0, List<ke.a<?>> $$1, auo $$2, Executor $$3) {
      List<jt.b<?>> $$4 = axf.a($$0.b(ald.d), $$1);
      jt.a $$5 = jt.a.a($$4.stream());
      aks<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kn<?>>> $$7 = evr.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kn<?>>> $$8 = af.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kn<?>> a(evr<T> $$0, aks<JsonElement> $$1, auo $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kn<T> $$3x = new jz<>($$0.b(), Lifecycle.experimental());
         Map<aku, T> $$4 = new HashMap<>();
         aus.a($$2, $$0.b(), $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(akt.a($$0.b(), $$2xx), (T)$$3xx, b));
         axf.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static ale.b a(jy<ald> $$0, jt.a $$1, List<kn<?>> $$2) {
      jy<ald> $$3 = a($$0, $$2);
      jt.a $$4 = a($$1, $$3.a(ald.d));
      a($$4);
      return new ale.b($$3, $$4);
   }

   private static jt.a a(jt.a $$0, jt.a $$1) {
      return jt.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(jt.a $$0) {
      aze.a $$1 = new aze.a();
      evv $$2 = new evv($$1, eyi.q, $$0);
      evr.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a().forEach(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x));
   }

   private static jy<ald> a(jy<ald> $$0, List<kn<?>> $$1) {
      return $$0.a(ald.d, new kf.c($$1).e());
   }

   private static <T> void a(evv $$0, evr<T> $$1, jt.a $$2) {
      jt<T> $$3 = $$2.d($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final jt.a a;

      public a(jt.a $$0) {
         this.a = $$0;
      }

      public js.a a() {
         return this.a;
      }

      public Collection<aku> a(akt<? extends ke<?>> $$0) {
         return this.a.d($$0).c_().map(akt::a).toList();
      }

      public evu b(akt<evu> $$0) {
         return this.a.a(mc.bg).flatMap($$1 -> $$1.a($$0)).map(jr::a).orElse(evu.a);
      }
   }

   public static record b(jy<ald> a, jt.a b) {
   }
}
