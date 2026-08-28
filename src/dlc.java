import com.mojang.serialization.MapCodec;

public class dlc extends dnv implements dlb {
   public static final MapCodec<dlc> c = b(dlc::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dlc> a() {
      return c;
   }

   public dlc(dxp.d $$0) {
      super($$0, jn.a, s_, false, 0.1);
      this.l(this.B.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Override
   protected boolean h(dxq $$0) {
      return $$0.l();
   }

   @Override
   protected dke b() {
      return dkg.sY;
   }

   @Override
   protected dxq a(dxq $$0, dxq $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected dxq a(dxq $$0, azh $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(cxl.xy);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      return dlb.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
