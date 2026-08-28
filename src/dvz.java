import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dvz {
   private static boolean a(duw $$0) {
      return $$0.j().a(dvx.l) && $$0.v();
   }

   static CompletableFuture<duw> a(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duw> b(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      aqt $$4 = $$0.a();
      if ($$4.o().bb().y().c()) {
         $$0.b().a($$4.H_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duw> c(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duw> d(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      aqt $$4 = $$0.a();
      ara $$5 = new ara($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duw> e(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      aqt $$4 = $$0.a();
      ara $$5 = new ara($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), dzx.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<duw> f(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      aqt $$4 = $$0.a();
      ara $$5 = new ara($$4, $$2, $$1, $$3);
      return $$0.b().a(dzx.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dvq $$1x) {
            dyj $$2x = $$1x.x();
            if ($$2x != null) {
               dyj.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<duw> g(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      aqt $$4 = $$0.a();
      ara $$5 = new ara($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duw> h(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      aqt $$4 = $$0.a();
      ara $$5 = new ara($$4, $$2, $$1, $$3);
      if ($$3 instanceof dvq $$6) {
         dzx.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.F_(), $$4.a().a($$5), $$3, dyr.a.a);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duw> i(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      aqt $$4 = $$0.a();
      dyv.a($$3, EnumSet.of(dyv.a.e, dyv.a.f, dyv.a.d, dyv.a.b));
      ara $$5 = new ara($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      dzx.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duw> j(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      aqw $$4 = $$0.d();
      $$3.A();
      ((dvq)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<duw> k(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<duw> l(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      if (!$$3.y()) {
         $$0.b().a(new ara($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duw> m(dwc $$0, dwa $$1, azh<aqm> $$2, duw $$3) {
      dcb $$4 = $$3.f();
      aqm $$5 = $$2.a($$4.e, $$4.f);
      return CompletableFuture.supplyAsync(() -> {
         dvq $$3x = (dvq)$$3;
         aqt $$4x = $$0.a();
         dvg $$5x;
         if ($$3x instanceof dvf) {
            $$5x = ((dvf)$$3x).C();
         } else {
            $$5x = new dvg($$4x, $$3x, $$2xx -> a($$4x, $$3x.E()));
            $$5.a(new dvf($$5x, false));
         }

         $$5x.b($$5::s);
         $$5x.E();
         $$5x.c(true);
         $$5x.J();
         $$5x.a($$4x);
         return $$5x;
      }, $$3x -> $$0.e().a(aqd.a($$3x, $$4.a(), $$5::i)));
   }

   private static void a(aqt $$0, List<ua> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bsw.a($$1, $$0));
      }
   }
}
