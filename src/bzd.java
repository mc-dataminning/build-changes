import com.google.common.collect.ImmutableMap;

public class bzd extends bvh<cma> {
   private static final int c = 25;
   private static final int d = 20;

   public bzd() {
      super(ImmutableMap.of(ccs.ay, cct.a, ccs.o, cct.b, ccs.aF, cct.c, ccs.aD, cct.c), cmb.b);
   }

   protected void a(are $$0, cma $$1, long $$2) {
      buq<cma> $$3 = $$1.dS();
      $$3.a(ccs.aD, bab.a, 25L);
      $$3.b(ccs.m);
      bto $$4 = $$1.dS().c(ccs.ay).get();
      bvj.a($$1, $$4);
      $$1.b(bua.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(are $$0, cma $$1, long $$2) {
      return true;
   }

   protected void c(are $$0, cma $$1, long $$2) {
      if (!$$1.dS().a(ccs.aD) && !$$1.dS().a(ccs.aF)) {
         $$1.dS().a(ccs.aF, bab.a, (long)(cmb.b - 25));
         $$1.a(avz.BQ, 3.0F, 1.0F);
      }
   }

   protected void d(are $$0, cma $$1, long $$2) {
      if ($$1.c(bua.l)) {
         $$1.b(bua.a);
      }

      $$1.dS().c(ccs.ay).ifPresent($$1::j);
      $$1.dS().b(ccs.ay);
   }
}
