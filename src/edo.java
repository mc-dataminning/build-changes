import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class edo {
   private static boolean a(ecl $$0) {
      return $$0.n().a(edm.l) && $$0.x();
   }

   static CompletableFuture<ecl> a(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecl> b(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      arq $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.F_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecl> c(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecl> d(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecl> e(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), ehp.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<ecl> f(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a(ehp.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof edf $$1x) {
            egb $$2x = $$1x.z();
            if ($$2x != null) {
               egb.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<ecl> g(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecl> h(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      if ($$3 instanceof edf $$6) {
         ehp.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.D_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecl> i(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      arq $$4 = $$0.a();
      egn.a($$3, EnumSet.of(egn.a.e, egn.a.f, egn.a.d, egn.a.b));
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      ehp.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecl> j(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      aru $$4 = $$0.d();
      $$3.C();
      ((edf)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<ecl> k(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<ecl> l(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      if (!$$3.A()) {
         $$0.b().a(new ary($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecl> m(edr $$0, edp $$1, bai<arg> $$2, ecl $$3) {
      dio $$4 = $$3.f();
      arg $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         edf $$3x = (edf)$$3;
         arq $$4x = $$0.a();
         ecv $$6;
         if ($$3x instanceof ecu $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new ecv($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new ecu($$6, false));
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

   private static void a(arq $$0, List<tz> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bwr.a($$1, $$0, bwq.r));
      }
   }
}
