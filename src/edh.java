import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class edh {
   private static boolean a(ece $$0) {
      return $$0.n().a(edf.l) && $$0.x();
   }

   static CompletableFuture<ece> a(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ece> b(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      arq $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.F_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ece> c(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ece> d(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ece> e(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), ehi.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<ece> f(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a(ehi.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof ecy $$1x) {
            efu $$2x = $$1x.z();
            if ($$2x != null) {
               efu.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<ece> g(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ece> h(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      if ($$3 instanceof ecy $$6) {
         ehi.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.D_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ece> i(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      arq $$4 = $$0.a();
      egg.a($$3, EnumSet.of(egg.a.e, egg.a.f, egg.a.d, egg.a.b));
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      ehi.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ece> j(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      aru $$4 = $$0.d();
      $$3.C();
      ((ecy)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<ece> k(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<ece> l(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      if (!$$3.A()) {
         $$0.b().a(new ary($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ece> m(edk $$0, edi $$1, bai<arg> $$2, ece $$3) {
      dih $$4 = $$3.f();
      arg $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         ecy $$3x = (ecy)$$3;
         arq $$4x = $$0.a();
         eco $$6;
         if ($$3x instanceof ecn $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new eco($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new ecn($$6, false));
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
         $$0.b(bwo.a($$1, $$0, bwn.r));
      }
   }
}
