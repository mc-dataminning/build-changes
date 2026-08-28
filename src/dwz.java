import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dwz {
   private static boolean a(dvw $$0) {
      return $$0.j().a(dwx.l) && $$0.u();
   }

   static CompletableFuture<dvw> a(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dvw> b(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      arg $$4 = $$0.a();
      if ($$4.o().ba().y().c()) {
         $$0.b().a($$4.F_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dvw> c(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dvw> d(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      arg $$4 = $$0.a();
      arn $$5 = new arn($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dvw> e(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      arg $$4 = $$0.a();
      arn $$5 = new arn($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), eay.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<dvw> f(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      arg $$4 = $$0.a();
      arn $$5 = new arn($$4, $$2, $$1, $$3);
      return $$0.b().a(eay.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dwq $$1x) {
            dzk $$2x = $$1x.w();
            if ($$2x != null) {
               dzk.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dvw> g(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      arg $$4 = $$0.a();
      arn $$5 = new arn($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dvw> h(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      arg $$4 = $$0.a();
      arn $$5 = new arn($$4, $$2, $$1, $$3);
      if ($$3 instanceof dwq $$6) {
         eay.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.D_(), $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dvw> i(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      arg $$4 = $$0.a();
      dzw.a($$3, EnumSet.of(dzw.a.e, dzw.a.f, dzw.a.d, dzw.a.b));
      arn $$5 = new arn($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      eay.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dvw> j(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      arj $$4 = $$0.d();
      $$3.z();
      ((dwq)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dvw> k(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dvw> l(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      if (!$$3.x()) {
         $$0.b().a(new arn($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dvw> m(dxc $$0, dxa $$1, azw<aqy> $$2, dvw $$3) {
      dcy $$4 = $$3.f();
      aqy $$5 = $$2.a($$4.e, $$4.f);
      return CompletableFuture.supplyAsync(() -> {
         dwq $$3x = (dwq)$$3;
         arg $$4x = $$0.a();
         dwg $$6;
         if ($$3x instanceof dwf $$5x) {
            $$6 = $$5x.D();
         } else {
            $$6 = new dwg($$4x, $$3x, $$2xx -> a($$4x, $$3x.F()));
            $$5.a(new dwf($$6, false));
         }

         $$6.b($$5::s);
         $$6.D();
         $$6.c(true);
         $$6.I();
         $$6.a($$4x);
         return $$6;
      }, $$0.e());
   }

   private static void a(arg $$0, List<uf> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(btq.a($$1, $$0, btp.r));
      }
   }
}
