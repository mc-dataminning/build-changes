import com.mojang.serialization.MapCodec;

public class dld extends dnt implements dlb {
   public static final MapCodec<dld> c = b(dld::new);

   @Override
   public MapCodec<dld> a() {
      return c;
   }

   public dld(dxm.d $$0) {
      super($$0, jm.a, s_, false);
      this.l(this.F.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dnu c() {
      return (dnu)dkg.sQ;
   }

   @Override
   protected dxn a(dxn $$0, dxn $$1) {
      return $$1.b(t_, $$0.c(t_));
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
