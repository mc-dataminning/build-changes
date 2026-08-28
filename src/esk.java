import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class esk implements esm {
   private static final esk b = new esk();
   public static final MapCodec<esk> a = MapCodec.unit(b);

   @Override
   public ux a(bam $$0, @Nullable ux $$1) {
      return new ux();
   }

   @Override
   public esn<?> a() {
      return esn.a;
   }
}
