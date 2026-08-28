import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eeq {
   private static boolean a(edn $$0) {
      return $$0.n().a(eeo.l) && $$0.x();
   }

   static CompletableFuture<edn> a(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edn> b(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      asb $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.J_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edn> c(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edn> d(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      asb $$4 = $$0.a();
      asj $$5 = new asj($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edn> e(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      asb $$4 = $$0.a();
      asj $$5 = new asj($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), eir.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<edn> f(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      asb $$4 = $$0.a();
      asj $$5 = new asj($$4, $$2, $$1, $$3);
      return $$0.b().a(eir.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof eeh $$1x) {
            ehd $$2x = $$1x.z();
            if ($$2x != null) {
               ehd.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<edn> g(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      asb $$4 = $$0.a();
      asj $$5 = new asj($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edn> h(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      asb $$4 = $$0.a();
      asj $$5 = new asj($$4, $$2, $$1, $$3);
      if ($$3 instanceof eeh $$6) {
         eir.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.H_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edn> i(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      asb $$4 = $$0.a();
      ehp.a($$3, EnumSet.of(ehp.a.e, ehp.a.f, ehp.a.d, ehp.a.b));
      asj $$5 = new asj($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      eir.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edn> j(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      asf $$4 = $$0.d();
      $$3.C();
      ((eeh)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<edn> k(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<edn> l(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      if (!$$3.A()) {
         $$0.b().a(new asj($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edn> m(eet $$0, eer $$1, bav<arr> $$2, edn $$3) {
      djo $$4 = $$3.f();
      arr $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         eeh $$3x = (eeh)$$3;
         asb $$4x = $$0.a();
         edx $$6;
         if ($$3x instanceof edw $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new edx($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new edw($$6, false));
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

   private static void a(asb $$0, List<ua> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bxn.a($$1, $$0, bxm.r));
      }
   }
}
