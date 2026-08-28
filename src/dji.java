import com.mojang.serialization.MapCodec;

public class dji extends ddt {
   public static final MapCodec<dji> d = b(dji::new);

   @Override
   public MapCodec<dji> a() {
      return d;
   }

   public dji(dsc.d $$0) {
      super($$0, kf.e);
   }

   @Override
   protected double b(dsd $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dsd $$0) {
      return true;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return 3;
   }
}
