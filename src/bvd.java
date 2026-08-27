import com.google.common.collect.ImmutableMap;

public class bvd extends brh<chy> {
   private static final int c = 25;
   private static final int d = 20;

   public bvd() {
      super(ImmutableMap.of(bys.ay, byt.a, bys.o, byt.b, bys.aF, byt.c, bys.aD, byt.c), chz.b);
   }

   protected void a(apf $$0, chy $$1, long $$2) {
      bqq<chy> $$3 = $$1.dP();
      $$3.a(bys.aD, axy.a, 25L);
      $$3.b(bys.m);
      bpp $$4 = $$1.dP().c(bys.ay).get();
      brj.a($$1, $$4);
      $$1.b(bqa.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(apf $$0, chy $$1, long $$2) {
      return true;
   }

   protected void c(apf $$0, chy $$1, long $$2) {
      if (!$$1.dP().a(bys.aD) && !$$1.dP().a(bys.aF)) {
         $$1.dP().a(bys.aF, axy.a, (long)(chz.b - 25));
         $$1.a(aty.Bu, 3.0F, 1.0F);
      }
   }

   protected void d(apf $$0, chy $$1, long $$2) {
      if ($$1.c(bqa.l)) {
         $$1.b(bqa.a);
      }

      $$1.dP().c(bys.ay).ifPresent($$1::j);
      $$1.dP().b(bys.ay);
   }
}
