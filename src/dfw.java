import com.mojang.serialization.MapCodec;

public class dfw extends dio implements dfc, dfv {
   public static final MapCodec<dfw> c = b(dfw::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dfw> a() {
      return c;
   }

   public dfw(dsb.d $$0) {
      super($$0, je.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Override
   protected boolean g(dsc $$0) {
      return $$0.i();
   }

   @Override
   protected dez b() {
      return dfb.sw;
   }

   @Override
   protected dsc a(dsc $$0, dsc $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dsc a(dsc $$0, azh $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(cus.ws);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      return dfv.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
