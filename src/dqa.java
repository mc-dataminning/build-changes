import com.mojang.serialization.MapCodec;

public class dqa extends dju {
   public static final MapCodec<dqa> a = b(dqa::new);
   protected static final float b = 6.0F;
   protected static final fbs c = djk.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqa> a() {
      return a;
   }

   protected dqa(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(awo.aO) || $$0.a(djm.ek) || super.b($$0, $$1, $$2);
   }
}
