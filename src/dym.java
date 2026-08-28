import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dym {
   private static boolean a(dxj $$0) {
      return $$0.j().a(dyk.l) && $$0.u();
   }

   static CompletableFuture<dxj> a(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxj> b(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      arq $$4 = $$0.a();
      if ($$4.o().aZ().y().d()) {
         $$0.b().a($$4.H_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxj> c(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxj> d(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxj> e(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), ecl.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<dxj> f(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      return $$0.b().a(ecl.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dyd $$1x) {
            eax $$2x = $$1x.w();
            if ($$2x != null) {
               eax.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dxj> g(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxj> h(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      arq $$4 = $$0.a();
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      if ($$3 instanceof dyd $$6) {
         ecl.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.F_(), $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxj> i(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      arq $$4 = $$0.a();
      ebj.a($$3, EnumSet.of(ebj.a.e, ebj.a.f, ebj.a.d, ebj.a.b));
      ary $$5 = new ary($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      ecl.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxj> j(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      art $$4 = $$0.d();
      $$3.z();
      ((dyd)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dxj> k(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dxj> l(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      if (!$$3.x()) {
         $$0.b().a(new ary($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxj> m(dyp $$0, dyn $$1, bah<ari> $$2, dxj $$3) {
      del $$4 = $$3.f();
      ari $$5 = $$2.a($$4.g, $$4.h);
      return CompletableFuture.supplyAsync(() -> {
         dyd $$3x = (dyd)$$3;
         arq $$4x = $$0.a();
         dxt $$6;
         if ($$3x instanceof dxs $$5x) {
            $$6 = $$5x.D();
         } else {
            $$6 = new dxt($$4x, $$3x, $$2xx -> a($$4x, $$3x.F()));
            $$5.a(new dxs($$6, false));
         }

         $$6.b($$5::r);
         $$6.D();
         $$6.c(true);
         $$6.I();
         $$6.a($$4x);
         return $$6;
      }, $$0.e());
   }

   private static void a(arq $$0, List<un> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bup.a($$1, $$0, buo.r));
      }
   }
}
