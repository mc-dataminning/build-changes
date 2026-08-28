import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dwb {
   private static boolean a(duy $$0) {
      return $$0.j().a(dvz.l) && $$0.v();
   }

   static CompletableFuture<duy> a(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> b(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      aqu $$4 = $$0.a();
      if ($$4.o().bb().y().c()) {
         $$0.b().a($$4.H_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> c(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> d(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      aqu $$4 = $$0.a();
      arb $$5 = new arb($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> e(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      aqu $$4 = $$0.a();
      arb $$5 = new arb($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), eaa.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<duy> f(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      aqu $$4 = $$0.a();
      arb $$5 = new arb($$4, $$2, $$1, $$3);
      return $$0.b().a(eaa.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dvs $$1x) {
            dym $$2x = $$1x.x();
            if ($$2x != null) {
               dym.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<duy> g(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      aqu $$4 = $$0.a();
      arb $$5 = new arb($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> h(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      aqu $$4 = $$0.a();
      arb $$5 = new arb($$4, $$2, $$1, $$3);
      if ($$3 instanceof dvs $$6) {
         eaa.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.F_(), $$4.a().a($$5), $$3, dyu.a.a);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> i(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      aqu $$4 = $$0.a();
      dyy.a($$3, EnumSet.of(dyy.a.e, dyy.a.f, dyy.a.d, dyy.a.b));
      arb $$5 = new arb($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      eaa.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> j(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      aqx $$4 = $$0.d();
      $$3.A();
      ((dvs)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<duy> k(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<duy> l(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      if (!$$3.y()) {
         $$0.b().a(new arb($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duy> m(dwe $$0, dwc $$1, azi<aqn> $$2, duy $$3) {
      dcd $$4 = $$3.f();
      aqn $$5 = $$2.a($$4.e, $$4.f);
      return CompletableFuture.supplyAsync(() -> {
         dvs $$3x = (dvs)$$3;
         aqu $$4x = $$0.a();
         dvi $$5x;
         if ($$3x instanceof dvh) {
            $$5x = ((dvh)$$3x).C();
         } else {
            $$5x = new dvi($$4x, $$3x, $$2xx -> a($$4x, $$3x.E()));
            $$5.a(new dvh($$5x, false));
         }

         $$5x.b($$5::s);
         $$5x.E();
         $$5x.c(true);
         $$5x.J();
         $$5x.a($$4x);
         return $$5x;
      }, $$3x -> $$0.e().a(aqe.a($$3x, $$4.a(), $$5::i)));
   }

   private static void a(aqu $$0, List<ub> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bsx.a($$1, $$0));
      }
   }
}
