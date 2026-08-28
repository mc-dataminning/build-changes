import com.mojang.serialization.MapCodec;

public class epa extends epx {
   public static final MapCodec<epa> a = MapCodec.unit(() -> epa.b);
   public static final epa b = new epa();

   private epa() {
   }

   @Override
   public boolean a(dvo $$0, azv $$1) {
      return true;
   }

   @Override
   protected epy<?> a() {
      return epy.a;
   }
}
