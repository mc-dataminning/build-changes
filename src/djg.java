import com.mojang.serialization.MapCodec;

public class djg extends dlx implements djf {
   public static final MapCodec<djg> c = b(djg::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<djg> a() {
      return c;
   }

   public djg(dvn.d $$0) {
      super($$0, jm.a, u_, false, 0.1);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(v_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azv $$0) {
      return 1;
   }

   @Override
   protected boolean h(dvo $$0) {
      return $$0.l();
   }

   @Override
   protected dij b() {
      return dil.sw;
   }

   @Override
   protected dvo a(dvo $$0, dvo $$1) {
      return $$1.b(v_, $$0.c(v_));
   }

   @Override
   protected dvo a(dvo $$0, azv $$1) {
      return super.a($$0, $$1).b(v_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
