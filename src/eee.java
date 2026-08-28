import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eee {
   private static boolean a(edb $$0) {
      return $$0.n().a(eec.l) && $$0.x();
   }

   static CompletableFuture<edb> a(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edb> b(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      ars $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.J_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edb> c(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edb> d(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      ars $$4 = $$0.a();
      asa $$5 = new asa($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edb> e(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      ars $$4 = $$0.a();
      asa $$5 = new asa($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), eif.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<edb> f(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      ars $$4 = $$0.a();
      asa $$5 = new asa($$4, $$2, $$1, $$3);
      return $$0.b().a(eif.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof edv $$1x) {
            egr $$2x = $$1x.z();
            if ($$2x != null) {
               egr.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<edb> g(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      ars $$4 = $$0.a();
      asa $$5 = new asa($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edb> h(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      ars $$4 = $$0.a();
      asa $$5 = new asa($$4, $$2, $$1, $$3);
      if ($$3 instanceof edv $$6) {
         eif.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.H_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edb> i(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      ars $$4 = $$0.a();
      ehd.a($$3, EnumSet.of(ehd.a.e, ehd.a.f, ehd.a.d, ehd.a.b));
      asa $$5 = new asa($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      eif.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edb> j(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      arw $$4 = $$0.d();
      $$3.C();
      ((edv)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<edb> k(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<edb> l(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      if (!$$3.A()) {
         $$0.b().a(new asa($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<edb> m(eeh $$0, eef $$1, bak<ari> $$2, edb $$3) {
      djc $$4 = $$3.f();
      ari $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         edv $$3x = (edv)$$3;
         ars $$4x = $$0.a();
         edl $$6;
         if ($$3x instanceof edk $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new edl($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new edk($$6, false));
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

   private static void a(ars $$0, List<tz> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bxc.a($$1, $$0, bxb.r));
      }
   }
}
