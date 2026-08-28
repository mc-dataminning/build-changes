import com.mojang.serialization.MapCodec;

public class eml extends enh {
   public static final MapCodec<eml> a = MapCodec.unit(() -> eml.b);
   public static final eml b = new eml();

   private eml() {
   }

   @Override
   public boolean a(dta $$0, ayv $$1) {
      return true;
   }

   @Override
   protected eni<?> a() {
      return eni.a;
   }
}
