import com.google.common.collect.ImmutableMap;

public class bvc extends brg<chw> {
   private static final int c = 25;
   private static final int d = 20;

   public bvc() {
      super(ImmutableMap.of(byr.ay, bys.a, byr.o, bys.b, byr.aF, bys.c, byr.aD, bys.c), chx.b);
   }

   protected void a(apf $$0, chw $$1, long $$2) {
      bqp<chw> $$3 = $$1.dP();
      $$3.a(byr.aD, axy.a, 25L);
      $$3.b(byr.m);
      bpo $$4 = $$1.dP().c(byr.ay).get();
      bri.a($$1, $$4);
      $$1.b(bpz.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(apf $$0, chw $$1, long $$2) {
      return true;
   }

   protected void c(apf $$0, chw $$1, long $$2) {
      if (!$$1.dP().a(byr.aD) && !$$1.dP().a(byr.aF)) {
         $$1.dP().a(byr.aF, axy.a, (long)(chx.b - 25));
         $$1.a(aty.Bp, 3.0F, 1.0F);
      }
   }

   protected void d(apf $$0, chw $$1, long $$2) {
      if ($$1.c(bpz.l)) {
         $$1.b(bpz.a);
      }

      $$1.dP().c(byr.ay).ifPresent($$1::j);
      $$1.dP().b(byr.ay);
   }
}
