import com.mojang.serialization.MapCodec;

public class cxi extends cru {
   public static final MapCodec<cxi> d = b(cxi::new);

   @Override
   public MapCodec<cxi> a() {
      return d;
   }

   public cxi(dfc.d $$0) {
      super($$0, ia.e);
   }

   @Override
   protected double b(dfd $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dfd $$0) {
      return true;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aw();
      }
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return 3;
   }
}
