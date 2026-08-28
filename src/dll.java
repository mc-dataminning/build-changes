import com.mojang.serialization.MapCodec;

public class dll extends dob implements dlj {
   public static final MapCodec<dll> c = b(dll::new);

   @Override
   public MapCodec<dll> a() {
      return c;
   }

   public dll(dxu.d $$0) {
      super($$0, jm.a, s_, false);
      this.l(this.F.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected doc c() {
      return (doc)dko.sQ;
   }

   @Override
   protected dxv a(dxv $$0, dxv $$1) {
      return $$1.b(t_, $$0.c(t_));
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
