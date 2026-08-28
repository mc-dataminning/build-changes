import com.mojang.serialization.MapCodec;

public class dke extends dep {
   public static final MapCodec<dke> d = b(dke::new);

   @Override
   public MapCodec<dke> a() {
      return d;
   }

   public dke(dsz.d $$0) {
      super($$0, kj.e);
   }

   @Override
   protected double b(dta $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dta $$0) {
      return true;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aB();
      }
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return 3;
   }
}
