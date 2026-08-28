import com.mojang.serialization.MapCodec;

public abstract class dqm extends dno implements dql {
   public dqm(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqm> a();

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.K_()) {
         com $$4 = com.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(com $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(ebq $$0) {
      return $$0.l() || $$0.a(axn.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$3.a(16) == 0) {
         iw $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            bad.a($$1, $$2, $$3, new lr(lz.C, $$0));
         }
      }
   }

   public abstract int b(ebq var1, djn var2, iw var3);
}
