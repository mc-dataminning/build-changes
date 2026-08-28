import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dxn {
   private static boolean a(dwk $$0) {
      return $$0.j().a(dxl.l) && $$0.u();
   }

   static CompletableFuture<dwk> a(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwk> b(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      arh $$4 = $$0.a();
      if ($$4.o().ba().y().c()) {
         $$0.b().a($$4.F_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwk> c(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwk> d(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      arh $$4 = $$0.a();
      aro $$5 = new aro($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwk> e(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      arh $$4 = $$0.a();
      aro $$5 = new aro($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), ebm.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<dwk> f(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      arh $$4 = $$0.a();
      aro $$5 = new aro($$4, $$2, $$1, $$3);
      return $$0.b().a(ebm.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dxe $$1x) {
            dzy $$2x = $$1x.w();
            if ($$2x != null) {
               dzy.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dwk> g(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      arh $$4 = $$0.a();
      aro $$5 = new aro($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwk> h(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      arh $$4 = $$0.a();
      aro $$5 = new aro($$4, $$2, $$1, $$3);
      if ($$3 instanceof dxe $$6) {
         ebm.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.D_(), $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwk> i(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      arh $$4 = $$0.a();
      eak.a($$3, EnumSet.of(eak.a.e, eak.a.f, eak.a.d, eak.a.b));
      aro $$5 = new aro($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      ebm.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwk> j(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      ark $$4 = $$0.d();
      $$3.z();
      ((dxe)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dwk> k(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dwk> l(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      if (!$$3.x()) {
         $$0.b().a(new aro($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwk> m(dxq $$0, dxo $$1, azx<aqz> $$2, dwk $$3) {
      ddm $$4 = $$3.f();
      aqz $$5 = $$2.a($$4.e, $$4.f);
      return CompletableFuture.supplyAsync(() -> {
         dxe $$3x = (dxe)$$3;
         arh $$4x = $$0.a();
         dwu $$6;
         if ($$3x instanceof dwt $$5x) {
            $$6 = $$5x.D();
         } else {
            $$6 = new dwu($$4x, $$3x, $$2xx -> a($$4x, $$3x.F()));
            $$5.a(new dwt($$6, false));
         }

         $$6.b($$5::s);
         $$6.D();
         $$6.c(true);
         $$6.I();
         $$6.a($$4x);
         return $$6;
      }, $$0.e());
   }

   private static void a(arh $$0, List<uf> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(btv.a($$1, $$0, btu.r));
      }
   }
}
