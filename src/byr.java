import com.google.common.collect.ImmutableMap;

public class byr extends buv<clp> {
   private static final int c = 25;
   private static final int d = 20;

   public byr() {
      super(ImmutableMap.of(ccg.ay, cch.a, ccg.o, cch.b, ccg.aF, cch.c, ccg.aD, cch.c), clq.b);
   }

   protected void a(aqm $$0, clp $$1, long $$2) {
      bue<clp> $$3 = $$1.dV();
      $$3.a(ccg.aD, azk.a, 25L);
      $$3.b(ccg.m);
      btc $$4 = $$1.dV().c(ccg.ay).get();
      bux.a($$1, $$4);
      $$1.b(bto.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqm $$0, clp $$1, long $$2) {
      return true;
   }

   protected void c(aqm $$0, clp $$1, long $$2) {
      if (!$$1.dV().a(ccg.aD) && !$$1.dV().a(ccg.aF)) {
         $$1.dV().a(ccg.aF, azk.a, (long)(clq.b - 25));
         $$1.a(avh.BT, 3.0F, 1.0F);
      }
   }

   protected void d(aqm $$0, clp $$1, long $$2) {
      if ($$1.c(bto.l)) {
         $$1.b(bto.a);
      }

      $$1.dV().c(ccg.ay).ifPresent($$1::j);
      $$1.dV().b(ccg.ay);
   }
}
