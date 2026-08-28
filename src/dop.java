import com.mojang.serialization.MapCodec;

public class dop extends dix {
   public static final MapCodec<dop> c = b(dop::new);

   @Override
   public MapCodec<dop> a() {
      return c;
   }

   public dop(dxp.d $$0) {
      super($$0, ko.e);
   }

   @Override
   protected double b(dxq $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dxq $$0) {
      return true;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return 3;
   }
}
