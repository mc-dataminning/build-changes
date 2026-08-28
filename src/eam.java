import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eam {
   private static boolean a(dzj $$0) {
      return $$0.n().a(eak.l) && $$0.x();
   }

   static CompletableFuture<dzj> a(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzj> b(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      arx $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.K_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.ai());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzj> c(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzj> d(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      arx $$4 = $$0.a();
      asf $$5 = new asf($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzj> e(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      arx $$4 = $$0.a();
      asf $$5 = new asf($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), eel.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dzj> f(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      arx $$4 = $$0.a();
      asf $$5 = new asf($$4, $$2, $$1, $$3);
      return $$0.b().a(eel.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof ead $$1x) {
            ecx $$2x = $$1x.z();
            if ($$2x != null) {
               ecx.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dzj> g(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      arx $$4 = $$0.a();
      asf $$5 = new asf($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzj> h(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      arx $$4 = $$0.a();
      asf $$5 = new asf($$4, $$2, $$1, $$3);
      if ($$3 instanceof ead $$6) {
         eel.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.I_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzj> i(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      arx $$4 = $$0.a();
      edj.a($$3, EnumSet.of(edj.a.e, edj.a.f, edj.a.d, edj.a.b));
      asf $$5 = new asf($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      eel.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzj> j(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      asa $$4 = $$0.d();
      $$3.C();
      ((ead)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dzj> k(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dzj> l(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      if (!$$3.A()) {
         $$0.b().a(new asf($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzj> m(eap $$0, ean $$1, bao<aro> $$2, dzj $$3) {
      dgf $$4 = $$3.f();
      aro $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         ead $$3x = (ead)$$3;
         arx $$4x = $$0.a();
         dzt $$6;
         if ($$3x instanceof dzs $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new dzt($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new dzs($$6, false));
         }

         $$6.b($$5::s);
         $$6.G();
         $$6.b(true);
         $$6.K();
         $$6.b($$4x);
         $$6.a($$0.f());
         return $$6;
      }, $$0.e());
   }

   private static void a(arx $$0, List<um> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bvi.a($$1, $$0, bvh.r));
      }
   }
}
