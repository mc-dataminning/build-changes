import com.mojang.serialization.MapCodec;

public class ddf extends dfv implements dck, ddd {
   public static final MapCodec<ddf> c = b(ddf::new);

   @Override
   public MapCodec<ddf> a() {
      return c;
   }

   public ddf(dph.d $$0) {
      super($$0, ij.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dfw c() {
      return (dfw)dcj.sv;
   }

   @Override
   protected dpi a(dpi $$0, dpi $$1) {
      return $$1.a(r_, $$0.c(r_));
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
