import com.mojang.serialization.MapCodec;

public class dcz extends cxl {
   public static final MapCodec<dcz> d = b(dcz::new);

   @Override
   public MapCodec<dcz> a() {
      return d;
   }

   public dcz(dli.d $$0) {
      super($$0, jf.e);
   }

   @Override
   protected double b(dlj $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dlj $$0) {
      return true;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return 3;
   }
}
