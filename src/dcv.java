import com.mojang.serialization.MapCodec;

public class dcv extends dfn implements dcb, dcu {
   public static final MapCodec<dcv> c = b(dcv::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dcv> a() {
      return c;
   }

   public dcv(doy.d $$0) {
      super($$0, ih.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(axr $$0) {
      return 1;
   }

   @Override
   protected boolean g(doz $$0) {
      return $$0.i();
   }

   @Override
   protected dby b() {
      return dca.sw;
   }

   @Override
   protected doz a(doz $$0, doz $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected doz a(doz $$0, axr $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj(crm.wo);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      return dcu.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
