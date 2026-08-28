import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dvj {
   private static boolean a(dug $$0) {
      return $$0.j().a(dvh.l) && $$0.v();
   }

   static CompletableFuture<dug> a(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dug> b(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      aqm $$4 = $$0.a();
      if ($$4.o().bc().y().c()) {
         $$0.b().a($$4.H_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dug> c(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dug> d(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dug> e(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), dzh.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<dug> f(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      return $$0.b().a(dzh.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dva $$1x) {
            dxt $$2x = $$1x.x();
            if ($$2x != null) {
               dxt.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<dug> g(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dug> h(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      if ($$3 instanceof dva $$6) {
         dzh.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.F_(), $$4.a().a($$5), $$3, dyb.a.a);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dug> i(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      aqm $$4 = $$0.a();
      dyf.a($$3, EnumSet.of(dyf.a.e, dyf.a.f, dyf.a.d, dyf.a.b));
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      dzh.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dug> j(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      aqp $$4 = $$0.d();
      $$3.A();
      ((dva)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<dug> k(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<dug> l(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      if (!$$3.y()) {
         $$0.b().a(new aqt($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<dug> m(dvm $$0, dvk $$1, aza<aqf> $$2, dug $$3) {
      dbm $$4 = $$3.f();
      aqf $$5 = $$2.a($$4.e, $$4.f);
      return CompletableFuture.supplyAsync(() -> {
         dva $$3x = (dva)$$3;
         aqm $$4x = $$0.a();
         duq $$5x;
         if ($$3x instanceof dup) {
            $$5x = ((dup)$$3x).C();
         } else {
            $$5x = new duq($$4x, $$3x, $$2xx -> a($$4x, $$3x.E()));
            $$5.a(new dup($$5x, false));
         }

         $$5x.b($$5::s);
         $$5x.E();
         $$5x.c(true);
         $$5x.J();
         $$5x.a($$4x);
         return $$5x;
      }, $$3x -> $$0.e().a(apw.a($$3x, $$4.a(), $$5::i)));
   }

   private static void a(aqm $$0, List<tx> $$1) {
      if (!$$1.isEmpty()) {
         $$0.b(bsm.a($$1, $$0));
      }
   }
}
