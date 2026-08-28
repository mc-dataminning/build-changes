import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eas {
   private static boolean a(dzp $$0) {
      return $$0.n().a(eaq.l) && $$0.x();
   }

   static CompletableFuture<dzp> a(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzp> b(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      ash $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.K_(), $$4.m().h(), $$4.b(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzp> c(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzp> d(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzp> e(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), eer.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dzp> f(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      return $$0.b().a(eer.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof eaj $$1x) {
            edd $$2x = $$1x.z();
            if ($$2x != null) {
               edd.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dzp> g(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzp> h(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      if ($$3 instanceof eaj $$6) {
         eer.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.D(), $$4.m().i(), $$4.I_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzp> i(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      ash $$4 = $$0.a();
      edp.a($$3, EnumSet.of(edp.a.e, edp.a.f, edp.a.d, edp.a.b));
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      eer.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzp> j(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      ask $$4 = $$0.d();
      $$3.C();
      ((eaj)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dzp> k(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dzp> l(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      if (!$$3.A()) {
         $$0.b().a(new asp($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzp> m(eav $$0, eat $$1, bay<ary> $$2, dzp $$3) {
      dgn $$4 = $$3.f();
      ary $$5 = $$2.a($$4.g, $$4.h);
      return CompletableFuture.supplyAsync(() -> {
         eaj $$3x = (eaj)$$3;
         ash $$4x = $$0.a();
         dzz $$6;
         if ($$3x instanceof dzy $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new dzz($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new dzy($$6, false));
         }

         $$6.b($$5::r);
         $$6.G();
         $$6.b(true);
         $$6.K();
         $$6.b($$4x);
         $$6.a($$0.f());
         return $$6;
      }, $$0.e());
   }

   private static void a(ash $$0, List<ux> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bvq.a($$1, $$0, bvp.r));
      }
   }
}
