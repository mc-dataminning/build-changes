import com.mojang.serialization.MapCodec;

public abstract class dni extends dkl implements dnh {
   public dni(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dni> a();

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         clz $$4 = clz.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(clz $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dxu $$0) {
      return $$0.l() || $$0.a(axu.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            bai.a($$1, $$2, $$3, new lk(ls.C, $$0));
         }
      }
   }

   public int b(dxu $$0, dgm $$1, jh $$2) {
      return -16777216;
   }
}
