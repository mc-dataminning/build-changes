import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eml implements emn {
   private static final eml b = new eml();
   public static final MapCodec<eml> a = MapCodec.unit(b);

   @Override
   public ur a(azc $$0, @Nullable ur $$1) {
      return new ur();
   }

   @Override
   public emo<?> a() {
      return emo.a;
   }
}
