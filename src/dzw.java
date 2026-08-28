import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dzw {
   private static boolean a(dyt $$0) {
      return $$0.n().a(dzu.l) && $$0.x();
   }

   static CompletableFuture<dyt> a(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyt> b(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      ard $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.K_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.ai());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyt> c(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyt> d(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyt> e(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), edv.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dyt> f(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      return $$0.b().a(edv.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dzn $$1x) {
            ech $$2x = $$1x.z();
            if ($$2x != null) {
               ech.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dyt> g(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyt> h(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      if ($$3 instanceof dzn $$6) {
         edv.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.I_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyt> i(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      ard $$4 = $$0.a();
      ect.a($$3, EnumSet.of(ect.a.e, ect.a.f, ect.a.d, ect.a.b));
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      edv.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyt> j(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      arg $$4 = $$0.d();
      $$3.C();
      ((dzn)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dyt> k(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dyt> l(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      if (!$$3.A()) {
         $$0.b().a(new arl($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyt> m(dzz $$0, dzx $$1, azt<aqu> $$2, dyt $$3) {
      dfp $$4 = $$3.f();
      aqu $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         dzn $$3x = (dzn)$$3;
         ard $$4x = $$0.a();
         dzd $$6;
         if ($$3x instanceof dzc $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new dzd($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new dzc($$6, false));
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

   private static void a(ard $$0, List<tq> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(but.a($$1, $$0, bus.r));
      }
   }
}
