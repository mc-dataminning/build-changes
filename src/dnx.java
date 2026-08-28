import com.mojang.serialization.MapCodec;

public class dnx extends dig {
   public static final MapCodec<dnx> d = b(dnx::new);

   @Override
   public MapCodec<dnx> a() {
      return d;
   }

   public dnx(dwx.d $$0) {
      super($$0, ko.e);
   }

   @Override
   protected double b(dwy $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dwy $$0) {
      return true;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return 3;
   }
}
