import com.google.common.collect.ImmutableMap;

public class cau extends bwy<cnx> {
   private static final int c = 25;
   private static final int d = 20;

   public cau() {
      super(ImmutableMap.of(cej.ay, cek.a, cej.o, cek.b, cej.aF, cek.c, cej.aD, cek.c), cny.b);
   }

   protected void a(arc $$0, cnx $$1, long $$2) {
      bwh<cnx> $$3 = $$1.ec();
      $$3.a(cej.aD, bae.a, 25L);
      $$3.b(cej.m);
      bvf $$4 = $$1.ec().c(cej.ay).get();
      bxa.a($$1, $$4);
      $$1.b(bvr.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arc $$0, cnx $$1, long $$2) {
      return true;
   }

   protected void c(arc $$0, cnx $$1, long $$2) {
      if (!$$1.ec().a(cej.aD) && !$$1.ec().a(cej.aF)) {
         $$1.ec().a(cej.aF, bae.a, (long)(cny.b - 25));
         $$1.a(avz.CI, 3.0F, 1.0F);
      }
   }

   protected void d(arc $$0, cnx $$1, long $$2) {
      if ($$1.c(bvr.l)) {
         $$1.b(bvr.a);
      }

      $$1.ec().c(cej.ay).ifPresent($$1::j);
      $$1.ec().b(cej.ay);
   }
}
