import com.mojang.serialization.MapCodec;

public class dlk extends doc implements dlj {
   public static final MapCodec<dlk> c = b(dlk::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dlk> a() {
      return c;
   }

   public dlk(dxu.d $$0) {
      super($$0, jm.a, s_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(bam $$0) {
      return 1;
   }

   @Override
   protected boolean h(dxv $$0) {
      return $$0.l();
   }

   @Override
   protected dkm b() {
      return dko.sR;
   }

   @Override
   protected dxv a(dxv $$0, dxv $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dxv a(dxv $$0, bam $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(cxt.xm);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      return dlj.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
