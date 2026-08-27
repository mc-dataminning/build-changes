import com.google.common.collect.ImmutableMap;

public class bws extends bsw<cjp> {
   private static final int c = 25;
   private static final int d = 20;

   public bws() {
      super(ImmutableMap.of(cah.ay, cai.a, cah.o, cai.b, cah.aF, cai.c, cah.aD, cai.c), cjq.b);
   }

   protected void a(aqe $$0, cjp $$1, long $$2) {
      bsf<cjp> $$3 = $$1.dQ();
      $$3.a(cah.aD, ayy.a, 25L);
      $$3.b(cah.m);
      bre $$4 = $$1.dQ().c(cah.ay).get();
      bsy.a($$1, $$4);
      $$1.b(brp.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqe $$0, cjp $$1, long $$2) {
      return true;
   }

   protected void c(aqe $$0, cjp $$1, long $$2) {
      if (!$$1.dQ().a(cah.aD) && !$$1.dQ().a(cah.aF)) {
         $$1.dQ().a(cah.aF, ayy.a, (long)(cjq.b - 25));
         $$1.a(auz.BE, 3.0F, 1.0F);
      }
   }

   protected void d(aqe $$0, cjp $$1, long $$2) {
      if ($$1.c(brp.l)) {
         $$1.b(brp.a);
      }

      $$1.dQ().c(cah.ay).ifPresent($$1::j);
      $$1.dQ().b(cah.ay);
   }
}
