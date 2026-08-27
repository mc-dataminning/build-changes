import com.google.common.collect.ImmutableMap;

public class byf extends buj<clc> {
   private static final int c = 25;
   private static final int d = 20;

   public byf() {
      super(ImmutableMap.of(cbu.ay, cbv.a, cbu.o, cbv.b, cbu.aF, cbv.c, cbu.aD, cbv.c), cld.b);
   }

   protected void a(aqn $$0, clc $$1, long $$2) {
      bts<clc> $$3 = $$1.dS();
      $$3.a(cbu.aD, azh.a, 25L);
      $$3.b(cbu.m);
      bsq $$4 = $$1.dS().c(cbu.ay).get();
      bul.a($$1, $$4);
      $$1.b(btc.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqn $$0, clc $$1, long $$2) {
      return true;
   }

   protected void c(aqn $$0, clc $$1, long $$2) {
      if (!$$1.dS().a(cbu.aD) && !$$1.dS().a(cbu.aF)) {
         $$1.dS().a(cbu.aF, azh.a, (long)(cld.b - 25));
         $$1.a(avi.BQ, 3.0F, 1.0F);
      }
   }

   protected void d(aqn $$0, clc $$1, long $$2) {
      if ($$1.c(btc.l)) {
         $$1.b(btc.a);
      }

      $$1.dS().c(cbu.ay).ifPresent($$1::j);
      $$1.dS().b(cbu.ay);
   }
}
