import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dzv {
   private static boolean a(dys $$0) {
      return $$0.n().a(dzt.l) && $$0.x();
   }

   static CompletableFuture<dys> a(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dys> b(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      ard $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.K_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.ai());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dys> c(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dys> d(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dys> e(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), edu.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dys> f(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      return $$0.b().a(edu.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dzm $$1x) {
            ecg $$2x = $$1x.z();
            if ($$2x != null) {
               ecg.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dys> g(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dys> h(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      if ($$3 instanceof dzm $$6) {
         edu.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.I_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dys> i(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      ard $$4 = $$0.a();
      ecs.a($$3, EnumSet.of(ecs.a.e, ecs.a.f, ecs.a.d, ecs.a.b));
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      edu.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dys> j(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      arg $$4 = $$0.d();
      $$3.C();
      ((dzm)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dys> k(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dys> l(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      if (!$$3.A()) {
         $$0.b().a(new arl($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dys> m(dzy $$0, dzw $$1, azt<aqu> $$2, dys $$3) {
      dfo $$4 = $$3.f();
      aqu $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         dzm $$3x = (dzm)$$3;
         ard $$4x = $$0.a();
         dzc $$6;
         if ($$3x instanceof dzb $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new dzc($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new dzb($$6, false));
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
         $$0.b(bus.a($$1, $$0, bur.r));
      }
   }
}
