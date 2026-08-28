import com.google.common.collect.ImmutableMap;

public class ccr extends byv<cqf> {
   private static final int c = 25;
   private static final int d = 20;

   public ccr() {
      super(ImmutableMap.of(cgg.az, cgh.a, cgg.p, cgh.b, cgg.aG, cgh.c, cgg.aE, cgh.c), cqg.b);
   }

   protected void a(arq $$0, cqf $$1, long $$2) {
      bye<cqf> $$3 = $$1.ec();
      $$3.a(cgg.aE, bau.a, 25L);
      $$3.b(cgg.n);
      bxe $$4 = $$1.ec().c(cgg.az).get();
      byx.a($$1, $$4);
      $$1.b(bxq.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arq $$0, cqf $$1, long $$2) {
      return true;
   }

   protected void c(arq $$0, cqf $$1, long $$2) {
      if (!$$1.ec().a(cgg.aE) && !$$1.ec().a(cgg.aG)) {
         $$1.ec().a(cgg.aG, bau.a, (long)(cqg.b - 25));
         $$1.a(awn.CY, 3.0F, 1.0F);
      }
   }

   protected void d(arq $$0, cqf $$1, long $$2) {
      if ($$1.c(bxq.l)) {
         $$1.b(bxq.a);
      }

      $$1.ec().c(cgg.az).ifPresent($$1::i);
      $$1.ec().b(cgg.az);
   }
}
