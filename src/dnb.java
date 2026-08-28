import com.mojang.serialization.MapCodec;

public abstract class dnb extends dke implements dna {
   public dnb(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnb> a();

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         clv $$4 = clv.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(clv $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dxn $$0) {
      return $$0.l() || $$0.a(axu.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            bai.a($$1, $$2, $$3, new lk(ls.C, $$0));
         }
      }
   }

   public int b(dxn $$0, dgf $$1, jh $$2) {
      return -16777216;
   }
}
