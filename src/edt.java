import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class edt {
   private static boolean a(ecq $$0) {
      return $$0.n().a(edr.l) && $$0.x();
   }

   static CompletableFuture<ecq> a(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecq> b(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      arq $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.F_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecq> c(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecq> d(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecq> e(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), ehu.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<ecq> f(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a(ehu.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof edk $$1x) {
            egg $$2x = $$1x.z();
            if ($$2x != null) {
               egg.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<ecq> g(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecq> h(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      if ($$3 instanceof edk $$6) {
         ehu.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.D_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecq> i(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      arq $$4 = $$0.a();
      egs.a($$3, EnumSet.of(egs.a.e, egs.a.f, egs.a.d, egs.a.b));
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      ehu.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecq> j(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      aru $$4 = $$0.d();
      $$3.C();
      ((edk)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<ecq> k(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<ecq> l(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      if (!$$3.A()) {
         $$0.b().a(new ary($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ecq> m(edw $$0, edu $$1, bai<arg> $$2, ecq $$3) {
      dir $$4 = $$3.f();
      arg $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         edk $$3x = (edk)$$3;
         arq $$4x = $$0.a();
         eda $$6;
         if ($$3x instanceof ecz $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new eda($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new ecz($$6, false));
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
