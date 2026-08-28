import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class dvk {
   private static boolean a(duh $$0) {
      return $$0.j().a(dvi.l) && $$0.v();
   }

   static CompletableFuture<duh> a(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duh> b(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      aqm $$4 = $$0.a();
      if ($$4.o().bc().y().c()) {
         $$0.b().a($$4.H_(), $$4.l().h(), $$4.a(), $$3, $$0.c());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duh> c(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duh> d(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duh> e(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.l().i(), dzi.a($$5), $$4.a().a($$5), $$3);
   }

   static CompletableFuture<duh> f(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      return $$0.b().a(dzi.a($$5), $$4.l().i(), $$4.a().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof dvb $$1x) {
            dxu $$2x = $$1x.x();
            if ($$2x != null) {
               dxu.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<duh> g(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.a().a($$5), $$4.l().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duh> h(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      aqm $$4 = $$0.a();
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      if ($$3 instanceof dvb $$6) {
         dzi.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.C(), $$4.l().i(), $$4.F_(), $$4.a().a($$5), $$3, dyc.a.a);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duh> i(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      aqm $$4 = $$0.a();
      dyg.a($$3, EnumSet.of(dyg.a.e, dyg.a.f, dyg.a.d, dyg.a.b));
      aqt $$5 = new aqt($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.a().a($$5));
      dzi.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duh> j(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      aqp $$4 = $$0.d();
      $$3.A();
      ((dvb)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<duh> k(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<duh> l(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      if (!$$3.y()) {
         $$0.b().a(new aqt($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<duh> m(dvn $$0, dvl $$1, aza<aqf> $$2, duh $$3) {
      dbn $$4 = $$3.f();
      aqf $$5 = $$2.a($$4.e, $$4.f);
      return CompletableFuture.supplyAsync(() -> {
         dvb $$3x = (dvb)$$3;
         aqm $$4x = $$0.a();
         dur $$5x;
         if ($$3x instanceof duq) {
            $$5x = ((duq)$$3x).C();
         } else {
            $$5x = new dur($$4x, $$3x, $$2xx -> a($$4x, $$3x.E()));
            $$5.a(new duq($$5x, false));
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
         $$0.b(bsn.a($$1, $$0));
      }
   }
}
