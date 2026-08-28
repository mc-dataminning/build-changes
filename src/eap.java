import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eap {
   private static boolean a(dzm $$0) {
      return $$0.n().a(ean.l) && $$0.x();
   }

   static CompletableFuture<dzm> a(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzm> b(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      ard $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.F_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzm> c(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzm> d(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzm> e(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), eeq.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dzm> f(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      return $$0.b().a(eeq.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof eag $$1x) {
            edc $$2x = $$1x.z();
            if ($$2x != null) {
               edc.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dzm> g(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzm> h(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      if ($$3 instanceof eag $$6) {
         eeq.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.D_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzm> i(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      ard $$4 = $$0.a();
      edo.a($$3, EnumSet.of(edo.a.e, edo.a.f, edo.a.d, edo.a.b));
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      eeq.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzm> j(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      arh $$4 = $$0.d();
      $$3.C();
      ((eag)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dzm> k(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dzm> l(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      if (!$$3.A()) {
         $$0.b().a(new arl($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzm> m(eas $$0, eaq $$1, azt<aqt> $$2, dzm $$3) {
      dgg $$4 = $$3.f();
      aqt $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         eag $$3x = (eag)$$3;
         ard $$4x = $$0.a();
         dzw $$6;
         if ($$3x instanceof dzv $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new dzw($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new dzv($$6, false));
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

   private static void a(ard $$0, List<tq> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bvi.a($$1, $$0, bvh.r));
      }
   }
}
