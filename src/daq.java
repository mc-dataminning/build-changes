import com.mojang.serialization.MapCodec;

public class daq extends cvc {
   public static final MapCodec<daq> d = b(daq::new);

   @Override
   public MapCodec<daq> a() {
      return d;
   }

   public daq(diz.d $$0) {
      super($$0, jd.e);
   }

   @Override
   protected double b(dja $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dja $$0) {
      return true;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return 3;
   }
}
