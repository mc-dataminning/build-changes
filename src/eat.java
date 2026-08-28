import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eat {
   private static boolean a(dzq $$0) {
      return $$0.n().a(ear.l) && $$0.x();
   }

   static CompletableFuture<dzq> a(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzq> b(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      ash $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.K_(), $$4.m().h(), $$4.b(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzq> c(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzq> d(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzq> e(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), ees.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dzq> f(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      return $$0.b().a(ees.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof eak $$1x) {
            ede $$2x = $$1x.z();
            if ($$2x != null) {
               ede.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dzq> g(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzq> h(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      if ($$3 instanceof eak $$6) {
         ees.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.D(), $$4.m().i(), $$4.I_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzq> i(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      ash $$4 = $$0.a();
      edq.a($$3, EnumSet.of(edq.a.e, edq.a.f, edq.a.d, edq.a.b));
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      ees.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzq> j(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      ask $$4 = $$0.d();
      $$3.C();
      ((eak)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dzq> k(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dzq> l(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      if (!$$3.A()) {
         $$0.b().a(new asp($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzq> m(eaw $$0, eau $$1, bay<ary> $$2, dzq $$3) {
      dgo $$4 = $$3.f();
      ary $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         eak $$3x = (eak)$$3;
         ash $$4x = $$0.a();
         eaa $$6;
         if ($$3x instanceof dzz $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new eaa($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new dzz($$6, false));
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

   private static void a(ash $$0, List<ux> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bvr.a($$1, $$0, bvq.r));
      }
   }
}
