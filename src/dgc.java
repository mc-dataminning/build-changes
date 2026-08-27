import com.mojang.serialization.MapCodec;

public class dgc extends dad {
   public static final MapCodec<dgc> c = b(dgc::new);
   public static final eml e = cwp.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dgc> a() {
      return c;
   }

   public dgc(djf.d $$0) {
      super($$0, ic.a, e, false);
   }

   @Override
   protected dae c() {
      return (dae)cwr.oz;
   }
}
