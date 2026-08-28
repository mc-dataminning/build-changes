import com.mojang.serialization.MapCodec;

public class dol extends djo {
   public static final MapCodec<dol> b = b(dol::new);

   protected dol(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dol> a() {
      return b;
   }

   @Override
   protected ext c(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return exq.a();
   }

   @Override
   protected float d(dtc $$0, dcc $$1, jd $$2) {
      return 1.0F;
   }

   @Override
   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return true;
   }
}
