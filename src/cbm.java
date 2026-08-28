import com.google.common.collect.ImmutableMap;

public class cbm extends bxq<cor> {
   private static final int c = 25;
   private static final int d = 20;

   public cbm() {
      super(ImmutableMap.of(cfb.ay, cfc.a, cfb.o, cfc.b, cfb.aF, cfc.c, cfb.aD, cfc.c), cos.b);
   }

   protected void a(arx $$0, cor $$1, long $$2) {
      bwz<cor> $$3 = $$1.ec();
      $$3.a(cfb.aD, bba.a, 25L);
      $$3.b(cfb.m);
      bvx $$4 = $$1.ec().c(cfb.ay).get();
      bxs.a($$1, $$4);
      $$1.b(bwj.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arx $$0, cor $$1, long $$2) {
      return true;
   }

   protected void c(arx $$0, cor $$1, long $$2) {
      if (!$$1.ec().a(cfb.aD) && !$$1.ec().a(cfb.aF)) {
         $$1.ec().a(cfb.aF, bba.a, (long)(cos.b - 25));
         $$1.a(awv.CJ, 3.0F, 1.0F);
      }
   }

   protected void d(arx $$0, cor $$1, long $$2) {
      if ($$1.c(bwj.l)) {
         $$1.b(bwj.a);
      }

      $$1.ec().c(cfb.ay).ifPresent($$1::j);
      $$1.ec().b(cfb.ay);
   }
}
