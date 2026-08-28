import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eco {
   private static boolean a(ebl $$0) {
      return $$0.n().a(ecm.l) && $$0.x();
   }

   static CompletableFuture<ebl> a(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebl> b(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      aro $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.F_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebl> c(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebl> d(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      aro $$4 = $$0.a();
      arw $$5 = new arw($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebl> e(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      aro $$4 = $$0.a();
      arw $$5 = new arw($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), egp.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<ebl> f(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      aro $$4 = $$0.a();
      arw $$5 = new arw($$4, $$2, $$1, $$3);
      return $$0.b().a(egp.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof ecf $$1x) {
            efb $$2x = $$1x.z();
            if ($$2x != null) {
               efb.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<ebl> g(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      aro $$4 = $$0.a();
      arw $$5 = new arw($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebl> h(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      aro $$4 = $$0.a();
      arw $$5 = new arw($$4, $$2, $$1, $$3);
      if ($$3 instanceof ecf $$6) {
         egp.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.D_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebl> i(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      aro $$4 = $$0.a();
      efn.a($$3, EnumSet.of(efn.a.e, efn.a.f, efn.a.d, efn.a.b));
      arw $$5 = new arw($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      egp.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebl> j(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      ars $$4 = $$0.d();
      $$3.C();
      ((ecf)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<ebl> k(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<ebl> l(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      if (!$$3.A()) {
         $$0.b().a(new arw($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<ebl> m(ecr $$0, ecp $$1, bag<are> $$2, ebl $$3) {
      dhw $$4 = $$3.f();
      are $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         ecf $$3x = (ecf)$$3;
         aro $$4x = $$0.a();
         ebv $$6;
         if ($$3x instanceof ebu $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new ebv($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new ebu($$6, false));
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

   private static void a(aro $$0, List<tx> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bwj.a($$1, $$0, bwi.r));
      }
   }
}
