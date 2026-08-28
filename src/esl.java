import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esl implements esn {
   private static final esl b = new esl();
   public static final MapCodec<esl> a = MapCodec.unit(b);

   @Override
   public um a(bac $$0, @Nullable um $$1) {
      return new um();
   }

   @Override
   public eso<?> a() {
      return eso.a;
   }
}
