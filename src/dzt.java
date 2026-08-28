import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dzt {
   private static boolean a(dyq $$0) {
      return $$0.n().a(dzr.l) && $$0.x();
   }

   static CompletableFuture<dyq> a(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyq> b(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      arc $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.K_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.ai());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyq> c(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyq> d(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      arc $$4 = $$0.a();
      ark $$5 = new ark($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyq> e(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      arc $$4 = $$0.a();
      ark $$5 = new ark($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), eds.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dyq> f(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      arc $$4 = $$0.a();
      ark $$5 = new ark($$4, $$2, $$1, $$3);
      return $$0.b().a(eds.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dzk $$1x) {
            ece $$2x = $$1x.z();
            if ($$2x != null) {
               ece.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dyq> g(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      arc $$4 = $$0.a();
      ark $$5 = new ark($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyq> h(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      arc $$4 = $$0.a();
      ark $$5 = new ark($$4, $$2, $$1, $$3);
      if ($$3 instanceof dzk $$6) {
         eds.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.I_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyq> i(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      arc $$4 = $$0.a();
      ecq.a($$3, EnumSet.of(ecq.a.e, ecq.a.f, ecq.a.d, ecq.a.b));
      ark $$5 = new ark($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      eds.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyq> j(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      arf $$4 = $$0.d();
      $$3.C();
      ((dzk)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dyq> k(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dyq> l(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      if (!$$3.A()) {
         $$0.b().a(new ark($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyq> m(dzw $$0, dzu $$1, azs<aqt> $$2, dyq $$3) {
      dfm $$4 = $$3.f();
      aqt $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         dzk $$3x = (dzk)$$3;
         arc $$4x = $$0.a();
         dza $$6;
         if ($$3x instanceof dyz $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new dza($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new dyz($$6, false));
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

   private static void a(arc $$0, List<tq> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(buq.a($$1, $$0, bup.r));
      }
   }
}
