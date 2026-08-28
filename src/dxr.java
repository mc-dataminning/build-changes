import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dxr {
   private static boolean a(dwo $$0) {
      return $$0.j().a(dxp.l) && $$0.u();
   }

   static CompletableFuture<dwo> a(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwo> b(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      arj $$4 = $$0.a();
      if ($$4.o().ba().y().c()) {
         $$0.b().a($$4.G_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwo> c(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwo> d(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      arj $$4 = $$0.a();
      arq $$5 = new arq($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwo> e(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      arj $$4 = $$0.a();
      arq $$5 = new arq($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), ebq.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<dwo> f(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      arj $$4 = $$0.a();
      arq $$5 = new arq($$4, $$2, $$1, $$3);
      return $$0.b().a(ebq.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dxi $$1x) {
            eac $$2x = $$1x.w();
            if ($$2x != null) {
               eac.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dwo> g(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      arj $$4 = $$0.a();
      arq $$5 = new arq($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwo> h(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      arj $$4 = $$0.a();
      arq $$5 = new arq($$4, $$2, $$1, $$3);
      if ($$3 instanceof dxi $$6) {
         ebq.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.E_(), $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwo> i(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      arj $$4 = $$0.a();
      eao.a($$3, EnumSet.of(eao.a.e, eao.a.f, eao.a.d, eao.a.b));
      arq $$5 = new arq($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      ebq.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwo> j(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      arm $$4 = $$0.d();
      $$3.z();
      ((dxi)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dwo> k(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dwo> l(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      if (!$$3.x()) {
         $$0.b().a(new arq($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dwo> m(dxu $$0, dxs $$1, azz<arb> $$2, dwo $$3) {
      ddp $$4 = $$3.f();
      arb $$5 = $$2.a($$4.e, $$4.f);
      return CompletableFuture.supplyAsync(() -> {
         dxi $$3x = (dxi)$$3;
         arj $$4x = $$0.a();
         dwy $$6;
         if ($$3x instanceof dwx $$5x) {
            $$6 = $$5x.D();
         } else {
            $$6 = new dwy($$4x, $$3x, $$2xx -> a($$4x, $$3x.F()));
            $$5.a(new dwx($$6, false));
         }

         $$6.b($$5::s);
         $$6.D();
         $$6.c(true);
         $$6.I();
         $$6.a($$4x);
         return $$6;
      }, $$0.e());
   }

   private static void a(arj $$0, List<ug> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bty.a($$1, $$0, btx.r));
      }
   }
}
