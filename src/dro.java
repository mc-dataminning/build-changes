import com.mojang.serialization.MapCodec;

public class dro extends djk {
   public static final MapCodec<dro> a = b(dro::new);
   private static final double b = 5.0;
   private static final fbs c = djk.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   protected dro(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected dpv a_(dwv $$0) {
      return dpv.a;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }

   @Override
   protected float c(dwv $$0, dfl $$1, ji $$2) {
      return 1.0F;
   }
}
