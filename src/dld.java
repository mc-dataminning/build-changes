import com.mojang.serialization.MapCodec;

public class dld extends dnu implements dlb {
   public static final MapCodec<dld> c = b(dld::new);

   @Override
   public MapCodec<dld> a() {
      return c;
   }

   public dld(dxp.d $$0) {
      super($$0, jn.a, s_, false);
      this.l(this.B.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dnv c() {
      return (dnv)dkg.sX;
   }

   @Override
   protected dxq a(dxq $$0, dxq $$1) {
      return $$1.b(t_, $$0.c(t_));
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
