import com.mojang.serialization.MapCodec;

public class dde extends dfw implements dck, ddd {
   public static final MapCodec<dde> c = b(dde::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dde> a() {
      return c;
   }

   public dde(dph.d $$0) {
      super($$0, ij.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(axt $$0) {
      return 1;
   }

   @Override
   protected boolean g(dpi $$0) {
      return $$0.i();
   }

   @Override
   protected dch b() {
      return dcj.sw;
   }

   @Override
   protected dpi a(dpi $$0, dpi $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dpi a(dpi $$0, axt $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs(crv.wo);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      return ddd.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
