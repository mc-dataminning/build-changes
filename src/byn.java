import com.google.common.collect.ImmutableMap;

public class byn extends bur<cll> {
   private static final int c = 25;
   private static final int d = 20;

   public byn() {
      super(ImmutableMap.of(ccc.ay, ccd.a, ccc.o, ccd.b, ccc.aF, ccd.c, ccc.aD, ccd.c), clm.b);
   }

   protected void a(aqk $$0, cll $$1, long $$2) {
      bua<cll> $$3 = $$1.dT();
      $$3.a(ccc.aD, azh.a, 25L);
      $$3.b(ccc.m);
      bsy $$4 = $$1.dT().c(ccc.ay).get();
      but.a($$1, $$4);
      $$1.b(btk.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqk $$0, cll $$1, long $$2) {
      return true;
   }

   protected void c(aqk $$0, cll $$1, long $$2) {
      if (!$$1.dT().a(ccc.aD) && !$$1.dT().a(ccc.aF)) {
         $$1.dT().a(ccc.aF, azh.a, (long)(clm.b - 25));
         $$1.a(avf.BT, 3.0F, 1.0F);
      }
   }

   protected void d(aqk $$0, cll $$1, long $$2) {
      if ($$1.c(btk.l)) {
         $$1.b(btk.a);
      }

      $$1.dT().c(ccc.ay).ifPresent($$1::j);
      $$1.dT().b(ccc.ay);
   }
}
