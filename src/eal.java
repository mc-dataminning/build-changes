import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eal {
   private static boolean a(dzi $$0) {
      return $$0.j().a(eaj.l) && $$0.u();
   }

   static CompletableFuture<dzi> a(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzi> b(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      ash $$4 = $$0.a();
      if ($$4.p().aZ().y().d()) {
         $$0.b().a($$4.K_(), $$4.m().h(), $$4.b(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzi> c(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzi> d(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzi> e(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.m().i(), eek.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<dzi> f(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      return $$0.b().a(eek.a($$5), $$4.m().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof eac $$1x) {
            ecw $$2x = $$1x.w();
            if ($$2x != null) {
               ecw.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dzi> g(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.m().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzi> h(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      ash $$4 = $$0.a();
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      if ($$3 instanceof eac $$6) {
         eek.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.D(), $$4.m().i(), $$4.I_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzi> i(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      ash $$4 = $$0.a();
      edi.a($$3, EnumSet.of(edi.a.e, edi.a.f, edi.a.d, edi.a.b));
      asp $$5 = new asp($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      eek.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzi> j(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      ask $$4 = $$0.d();
      $$3.z();
      ((eac)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dzi> k(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dzi> l(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      if (!$$3.x()) {
         $$0.b().a(new asp($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dzi> m(eao $$0, eam $$1, bay<ary> $$2, dzi $$3) {
      dgg $$4 = $$3.f();
      ary $$5 = $$2.a($$4.g, $$4.h);
      return CompletableFuture.supplyAsync(() -> {
         eac $$3x = (eac)$$3;
         ash $$4x = $$0.a();
         dzs $$6;
         if ($$3x instanceof dzr $$5x) {
            $$6 = $$5x.D();
         } else {
            $$6 = new dzs($$4x, $$3x, $$2xx -> a($$4x, $$3x.F()));
            $$5.a(new dzr($$6, false));
         }

         $$6.b($$5::r);
         $$6.D();
         $$6.c(true);
         $$6.H();
         $$6.b($$4x);
         return $$6;
      }, $$0.e());
   }

   private static void a(ash $$0, List<ux> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bvm.a($$1, $$0, bvl.r));
      }
   }
}
