import com.google.common.collect.ImmutableMap;

public class ccp extends byt<cqb> {
   private static final int c = 25;
   private static final int d = 20;

   public ccp() {
      super(ImmutableMap.of(cge.az, cgf.a, cge.p, cgf.b, cge.aG, cgf.c, cge.aE, cgf.c), cqc.b);
   }

   protected void a(arq $$0, cqb $$1, long $$2) {
      byc<cqb> $$3 = $$1.eb();
      $$3.a(cge.aE, bau.a, 25L);
      $$3.b(cge.n);
      bxc $$4 = $$1.eb().c(cge.az).get();
      byv.a($$1, $$4);
      $$1.b(bxo.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(arq $$0, cqb $$1, long $$2) {
      return true;
   }

   protected void c(arq $$0, cqb $$1, long $$2) {
      if (!$$1.eb().a(cge.aE) && !$$1.eb().a(cge.aG)) {
         $$1.eb().a(cge.aG, bau.a, (long)(cqc.b - 25));
         $$1.a(awn.CV, 3.0F, 1.0F);
      }
   }

   protected void d(arq $$0, cqb $$1, long $$2) {
      if ($$1.c(bxo.l)) {
         $$1.b(bxo.a);
      }

      $$1.eb().c(cge.az).ifPresent($$1::i);
      $$1.eb().b(cge.az);
   }
}
