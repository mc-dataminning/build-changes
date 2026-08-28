import com.mojang.serialization.MapCodec;

public abstract class dnj extends dkm implements dni {
   public dnj(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnj> a();

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         cma $$4 = cma.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cma $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dxv $$0) {
      return $$0.l() || $$0.a(axu.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            bai.a($$1, $$2, $$3, new lk(ls.C, $$0));
         }
      }
   }

   public int b(dxv $$0, dgn $$1, jh $$2) {
      return -16777216;
   }
}
