import com.mojang.serialization.MapCodec;

public class dgf extends dar {
   public static final MapCodec<dgf> d = b(dgf::new);

   @Override
   public MapCodec<dgf> a() {
      return d;
   }

   public dgf(doy.d $$0) {
      super($$0, ji.e);
   }

   @Override
   protected double b(doz $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(doz $$0) {
      return true;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return 3;
   }
}
