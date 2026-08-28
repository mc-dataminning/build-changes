import com.mojang.serialization.MapCodec;

public class djh extends dlw implements djf {
   public static final MapCodec<djh> c = b(djh::new);

   @Override
   public MapCodec<djh> a() {
      return c;
   }

   public djh(dvn.d $$0) {
      super($$0, jm.a, u_, false);
      this.l(this.F.b().b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected dlx c() {
      return (dlx)dil.sv;
   }

   @Override
   protected dvo a(dvo $$0, dvo $$1) {
      return $$1.b(v_, $$0.c(v_));
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf(cwj.wO);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      return djf.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(v_);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return !$$2.c(v_);
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      $$0.a($$2, $$3.b(v_, Boolean.valueOf(true)), 2);
   }
}
