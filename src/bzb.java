import com.google.common.collect.ImmutableMap;

public class bzb extends bvf<clz> {
   private static final int c = 25;
   private static final int d = 20;

   public bzb() {
      super(ImmutableMap.of(ccq.ay, ccr.a, ccq.o, ccr.b, ccq.aF, ccr.c, ccq.aD, ccr.c), cma.b);
   }

   protected void a(aqt $$0, clz $$1, long $$2) {
      buo<clz> $$3 = $$1.dU();
      $$3.a(ccq.aD, azr.a, 25L);
      $$3.b(ccq.m);
      btl $$4 = $$1.dU().c(ccq.ay).get();
      bvh.a($$1, $$4);
      $$1.b(bty.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqt $$0, clz $$1, long $$2) {
      return true;
   }

   protected void c(aqt $$0, clz $$1, long $$2) {
      if (!$$1.dU().a(ccq.aD) && !$$1.dU().a(ccq.aF)) {
         $$1.dU().a(ccq.aF, azr.a, (long)(cma.b - 25));
         $$1.a(avo.BU, 3.0F, 1.0F);
      }
   }

   protected void d(aqt $$0, clz $$1, long $$2) {
      if ($$1.c(bty.l)) {
         $$1.b(bty.a);
      }

      $$1.dU().c(ccq.ay).ifPresent($$1::j);
      $$1.dU().b(ccq.ay);
   }
}
