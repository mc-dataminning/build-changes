import com.mojang.serialization.MapCodec;

public class dlj extends dob implements dli {
   public static final MapCodec<dlj> c = b(dlj::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dlj> a() {
      return c;
   }

   public dlj(dxt.d $$0) {
      super($$0, jm.a, s_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(bam $$0) {
      return 1;
   }

   @Override
   protected boolean h(dxu $$0) {
      return $$0.l();
   }

   @Override
   protected dkl b() {
      return dkn.sR;
   }

   @Override
   protected dxu a(dxu $$0, dxu $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dxu a(dxu $$0, bam $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo(cxs.xm);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      return dli.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
