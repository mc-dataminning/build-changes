import com.mojang.serialization.MapCodec;

public class dcv extends cxh {
   public static final MapCodec<dcv> d = b(dcv::new);

   @Override
   public MapCodec<dcv> a() {
      return d;
   }

   public dcv(dle.d $$0) {
      super($$0, jf.e);
   }

   @Override
   protected double b(dlf $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dlf $$0) {
      return true;
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return 3;
   }
}
