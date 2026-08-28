import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dzu {
   private static boolean a(dyr $$0) {
      return $$0.n().a(dzs.l) && $$0.x();
   }

   static CompletableFuture<dyr> a(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyr> b(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      ard $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.K_(), $$4.m().h(), $$4.b(), $$3, $$0.c(), $$4.ai());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyr> c(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyr> d(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyr> e(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), edt.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dyr> f(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      return $$0.b().a(edt.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dzl $$1x) {
            ecf $$2x = $$1x.z();
            if ($$2x != null) {
               ecf.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dyr> g(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyr> h(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      ard $$4 = $$0.a();
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      if ($$3 instanceof dzl $$6) {
         edt.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.E(), $$4.m().i(), $$4.I_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyr> i(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      ard $$4 = $$0.a();
      ecr.a($$3, EnumSet.of(ecr.a.e, ecr.a.f, ecr.a.d, ecr.a.b));
      arl $$5 = new arl($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      edt.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyr> j(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      arg $$4 = $$0.d();
      $$3.C();
      ((dzl)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dyr> k(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dyr> l(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      if (!$$3.A()) {
         $$0.b().a(new arl($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dyr> m(dzx $$0, dzv $$1, azt<aqu> $$2, dyr $$3) {
      dfn $$4 = $$3.f();
      aqu $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         dzl $$3x = (dzl)$$3;
         ard $$4x = $$0.a();
         dzb $$6;
         if ($$3x instanceof dza $$5x) {
            $$6 = $$5x.G();
         } else {
            $$6 = new dzb($$4x, $$3x, $$2xx -> a($$4x, $$3x.I()));
            $$5.a(new dza($$6, false));
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
         $$0.b(bur.a($$1, $$0, buq.r));
      }
   }
}
