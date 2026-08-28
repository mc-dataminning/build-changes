import com.google.common.collect.ImmutableMap;

public class cbu extends bxy<coz> {
   private static final int c = 25;
   private static final int d = 20;

   public cbu() {
      super(ImmutableMap.of(cfj.ay, cfk.a, cfj.o, cfk.b, cfj.aF, cfk.c, cfj.aD, cfk.c), cpa.b);
   }

   protected void a(ash $$0, coz $$1, long $$2) {
      bxh<coz> $$3 = $$1.ec();
      $$3.a(cfj.aD, bbk.a, 25L);
      $$3.b(cfj.m);
      bwf $$4 = $$1.ec().c(cfj.ay).get();
      bya.a($$1, $$4);
      $$1.b(bwr.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ash $$0, coz $$1, long $$2) {
      return true;
   }

   protected void c(ash $$0, coz $$1, long $$2) {
      if (!$$1.ec().a(cfj.aD) && !$$1.ec().a(cfj.aF)) {
         $$1.ec().a(cfj.aF, bbk.a, (long)(cpa.b - 25));
         $$1.a(axf.Ct, 3.0F, 1.0F);
      }
   }

   protected void d(ash $$0, coz $$1, long $$2) {
      if ($$1.c(bwr.l)) {
         $$1.b(bwr.a);
      }

      $$1.ec().c(cfj.ay).ifPresent($$1::j);
      $$1.ec().b(cfj.ay);
   }
}
