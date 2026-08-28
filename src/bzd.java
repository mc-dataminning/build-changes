import com.google.common.collect.ImmutableMap;

public class bzd extends bvh<cmb> {
   private static final int c = 25;
   private static final int d = 20;

   public bzd() {
      super(ImmutableMap.of(ccs.ay, cct.a, ccs.o, cct.b, ccs.aF, cct.c, ccs.aD, cct.c), cmc.b);
   }

   protected void a(aqu $$0, cmb $$1, long $$2) {
      buq<cmb> $$3 = $$1.dU();
      $$3.a(ccs.aD, azs.a, 25L);
      $$3.b(ccs.m);
      btn $$4 = $$1.dU().c(ccs.ay).get();
      bvj.a($$1, $$4);
      $$1.b(bua.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aqu $$0, cmb $$1, long $$2) {
      return true;
   }

   protected void c(aqu $$0, cmb $$1, long $$2) {
      if (!$$1.dU().a(ccs.aD) && !$$1.dU().a(ccs.aF)) {
         $$1.dU().a(ccs.aF, azs.a, (long)(cmc.b - 25));
         $$1.a(avp.BU, 3.0F, 1.0F);
      }
   }

   protected void d(aqu $$0, cmb $$1, long $$2) {
      if ($$1.c(bua.l)) {
         $$1.b(bua.a);
      }

      $$1.dU().c(ccs.ay).ifPresent($$1::j);
      $$1.dU().b(ccs.ay);
   }
}
