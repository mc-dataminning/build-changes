import com.google.common.collect.ImmutableMap;

public class bzc extends bvg<clz> {
   private static final int c = 25;
   private static final int d = 20;

   public bzc() {
      super(ImmutableMap.of(ccr.ay, ccs.a, ccr.o, ccs.b, ccr.aF, ccs.c, ccr.aD, ccs.c), cma.b);
   }

   protected void a(are $$0, clz $$1, long $$2) {
      bup<clz> $$3 = $$1.dS();
      $$3.a(ccr.aD, baa.a, 25L);
      $$3.b(ccr.m);
      btn $$4 = $$1.dS().c(ccr.ay).get();
      bvi.a($$1, $$4);
      $$1.b(btz.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(are $$0, clz $$1, long $$2) {
      return true;
   }

   protected void c(are $$0, clz $$1, long $$2) {
      if (!$$1.dS().a(ccr.aD) && !$$1.dS().a(ccr.aF)) {
         $$1.dS().a(ccr.aF, baa.a, (long)(cma.b - 25));
         $$1.a(avz.BQ, 3.0F, 1.0F);
      }
   }

   protected void d(are $$0, clz $$1, long $$2) {
      if ($$1.c(btz.l)) {
         $$1.b(btz.a);
      }

      $$1.dS().c(ccr.ay).ifPresent($$1::j);
      $$1.dS().b(ccr.ay);
   }
}
