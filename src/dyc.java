import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dyc {
   private static boolean a(dwz $$0) {
      return $$0.j().a(dya.l) && $$0.u();
   }

   static CompletableFuture<dwz> a(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwz> b(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      arm $$4 = $$0.a();
      if ($$4.o().ba().y().c()) {
         $$0.b().a($$4.H_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwz> c(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwz> d(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      arm $$4 = $$0.a();
      aru $$5 = new aru($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwz> e(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      arm $$4 = $$0.a();
      aru $$5 = new aru($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), ecb.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<dwz> f(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      arm $$4 = $$0.a();
      aru $$5 = new aru($$4, $$2, $$1, $$3);
      return $$0.b().a(ecb.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dxt $$1x) {
            ean $$2x = $$1x.w();
            if ($$2x != null) {
               ean.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dwz> g(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      arm $$4 = $$0.a();
      aru $$5 = new aru($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwz> h(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      arm $$4 = $$0.a();
      aru $$5 = new aru($$4, $$2, $$1, $$3);
      if ($$3 instanceof dxt $$6) {
         ecb.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.F_(), $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwz> i(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      arm $$4 = $$0.a();
      eaz.a($$3, EnumSet.of(eaz.a.e, eaz.a.f, eaz.a.d, eaz.a.b));
      aru $$5 = new aru($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      ecb.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwz> j(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      arp $$4 = $$0.d();
      $$3.z();
      ((dxt)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dwz> k(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dwz> l(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      if (!$$3.x()) {
         $$0.b().a(new aru($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwz> m(dyf $$0, dyd $$1, bad<are> $$2, dwz $$3) {
      deb $$4 = $$3.f();
      are $$5 = $$2.a($$4.e, $$4.f);
      return CompletableFuture.supplyAsync(() -> {
         dxt $$3x = (dxt)$$3;
         arm $$4x = $$0.a();
         dxj $$6;
         if ($$3x instanceof dxi $$5x) {
            $$6 = $$5x.D();
         } else {
            $$6 = new dxj($$4x, $$3x, $$2xx -> a($$4x, $$3x.F()));
            $$5.a(new dxi($$6, false));
         }

         $$6.b($$5::r);
         $$6.D();
         $$6.c(true);
         $$6.I();
         $$6.a($$4x);
         return $$6;
      }, $$0.e());
   }

   private static void a(arm $$0, List<uj> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bug.a($$1, $$0, buf.r));
      }
   }
}
