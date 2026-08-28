import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esl implements esm {
   public static final esl a = new esl();
   public static final MapCodec<esl> b = MapCodec.unit(a);

   @Nullable
   @Override
   public ux a(bam $$0, @Nullable ux $$1) {
      return $$1;
   }

   @Override
   public esn<?> a() {
      return esn.b;
   }
}
