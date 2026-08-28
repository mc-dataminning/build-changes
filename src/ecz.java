import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ecz {
   private static boolean a(ebw $$0) {
      return $$0.n().a(ecx.l) && $$0.x();
   }

   static CompletableFuture<ebw> a(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebw> b(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      arq $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.F_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebw> c(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebw> d(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebw> e(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), eha.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<ebw> f(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a(eha.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof ecq $$1x) {
            efm $$2x = $$1x.z();
            if ($$2x != null) {
               efm.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<ebw> g(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebw> h(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      if ($$3 instanceof ecq $$6) {
         eha.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.D_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebw> i(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      arq $$4 = $$0.a();
      efy.a($$3, EnumSet.of(efy.a.e, efy.a.f, efy.a.d, efy.a.b));
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      eha.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebw> j(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      aru $$4 = $$0.d();
      $$3.C();
      ((ecq)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<ebw> k(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<ebw> l(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      if (!$$3.A()) {
         $$0.b().a(new ary($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebw> m(edc $$0, eda $$1, bai<arg> $$2, ebw $$3) {
      dic $$4 = $$3.f();
      arg $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         ecq $$3x = (ecq)$$3;
         arq $$4x = $$0.a();
         ecg $$6;
         if ($$3x instanceof ecf $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new ecg($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new ecf($$6, false));
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
         $$0.b(bwm.a($$1, $$0, bwl.r));
      }
   }
}
