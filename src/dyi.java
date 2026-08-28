import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dyi {
   private static boolean a(dxf $$0) {
      return $$0.j().a(dyg.l) && $$0.u();
   }

   static CompletableFuture<dxf> a(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxf> b(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      arn $$4 = $$0.a();
      if ($$4.o().aZ().y().d()) {
         $$0.b().a($$4.H_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxf> c(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxf> d(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxf> e(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), ech.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<dxf> f(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      return $$0.b().a(ech.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dxz $$1x) {
            eat $$2x = $$1x.w();
            if ($$2x != null) {
               eat.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dxf> g(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxf> h(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      arn $$4 = $$0.a();
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      if ($$3 instanceof dxz $$6) {
         ech.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.F_(), $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxf> i(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      arn $$4 = $$0.a();
      ebf.a($$3, EnumSet.of(ebf.a.e, ebf.a.f, ebf.a.d, ebf.a.b));
      arv $$5 = new arv($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      ech.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxf> j(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      arq $$4 = $$0.d();
      $$3.z();
      ((dxz)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dxf> k(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dxf> l(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      if (!$$3.x()) {
         $$0.b().a(new arv($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dxf> m(dyl $$0, dyj $$1, bae<arf> $$2, dxf $$3) {
      deh $$4 = $$3.f();
      arf $$5 = $$2.a($$4.g, $$4.h);
      return CompletableFuture.supplyAsync(() -> {
         dxz $$3x = (dxz)$$3;
         arn $$4x = $$0.a();
         dxp $$6;
         if ($$3x instanceof dxo $$5x) {
            $$6 = $$5x.D();
         } else {
            $$6 = new dxp($$4x, $$3x, $$2xx -> a($$4x, $$3x.F()));
            $$5.a(new dxo($$6, false));
         }

         $$6.b($$5::r);
         $$6.D();
         $$6.c(true);
         $$6.I();
         $$6.a($$4x);
         return $$6;
      }, $$0.e());
   }

   private static void a(arn $$0, List<uk> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bul.a($$1, $$0, buk.r));
      }
   }
}
