import com.mojang.serialization.MapCodec;

public class dlc extends dnu implements dlb {
   public static final MapCodec<dlc> c = b(dlc::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dlc> a() {
      return c;
   }

   public dlc(dxm.d $$0) {
      super($$0, jm.a, s_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(bam $$0) {
      return 1;
   }

   @Override
   protected boolean h(dxn $$0) {
      return $$0.l();
   }

   @Override
   protected dke b() {
      return dkg.sR;
   }

   @Override
   protected dxn a(dxn $$0, dxn $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dxn a(dxn $$0, bam $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk(cxo.xm);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      return dlb.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
