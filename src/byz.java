import com.google.common.collect.ImmutableMap;

public class byz extends bvd<clw> {
   private static final int c = 25;
   private static final int d = 20;

   public byz() {
      super(ImmutableMap.of(cco.ay, ccp.a, cco.o, ccp.b, cco.aF, ccp.c, cco.aD, ccp.c), clx.b);
   }

   protected void a(arb $$0, clw $$1, long $$2) {
      bum<clw> $$3 = $$1.dS();
      $$3.a(cco.aD, azx.a, 25L);
      $$3.b(cco.m);
      btk $$4 = $$1.dS().c(cco.ay).get();
      bvf.a($$1, $$4);
      $$1.b(btw.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arb $$0, clw $$1, long $$2) {
      return true;
   }

   protected void c(arb $$0, clw $$1, long $$2) {
      if (!$$1.dS().a(cco.aD) && !$$1.dS().a(cco.aF)) {
         $$1.dS().a(cco.aF, azx.a, (long)(clx.b - 25));
         $$1.a(avw.BQ, 3.0F, 1.0F);
      }
   }

   protected void d(arb $$0, clw $$1, long $$2) {
      if ($$1.c(btw.l)) {
         $$1.b(btw.a);
      }

      $$1.dS().c(cco.ay).ifPresent($$1::j);
      $$1.dS().b(cco.ay);
   }
}
