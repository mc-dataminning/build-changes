import com.google.common.collect.ImmutableMap;

public class bxo extends bts<ckl> {
   private static final int c = 25;
   private static final int d = 20;

   public bxo() {
      super(ImmutableMap.of(cbd.ay, cbe.a, cbd.o, cbe.b, cbd.aF, cbe.c, cbd.aD, cbe.c), ckm.b);
   }

   protected void a(aqh $$0, ckl $$1, long $$2) {
      btb<ckl> $$3 = $$1.dQ();
      $$3.a(cbd.aD, azb.a, 25L);
      $$3.b(cbd.m);
      bsa $$4 = $$1.dQ().c(cbd.ay).get();
      btu.a($$1, $$4);
      $$1.b(bsl.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqh $$0, ckl $$1, long $$2) {
      return true;
   }

   protected void c(aqh $$0, ckl $$1, long $$2) {
      if (!$$1.dQ().a(cbd.aD) && !$$1.dQ().a(cbd.aF)) {
         $$1.dQ().a(cbd.aF, azb.a, (long)(ckm.b - 25));
         $$1.a(avc.BF, 3.0F, 1.0F);
      }
   }

   protected void d(aqh $$0, ckl $$1, long $$2) {
      if ($$1.c(bsl.l)) {
         $$1.b(bsl.a);
      }

      $$1.dQ().c(cbd.ay).ifPresent($$1::j);
      $$1.dQ().b(cbd.ay);
   }
}
