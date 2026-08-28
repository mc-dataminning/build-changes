import com.mojang.serialization.MapCodec;

public class dkx extends dfy {
   public static final MapCodec<dkx> a = b(dkx::new);
   protected static final ext b = dfy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   protected ext b_(dtc $$0, dcc $$1, jd $$2) {
      return exq.b();
   }

   @Override
   protected ext c(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return exq.b();
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   @Override
   protected float d(dtc $$0, dcc $$1, jd $$2) {
      return 0.2F;
   }
}
