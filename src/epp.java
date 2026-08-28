import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class epp implements epq {
   public static final epp a = new epp();
   public static final MapCodec<epp> b = MapCodec.unit(a);

   @Nullable
   @Override
   public ug a(azn $$0, @Nullable ug $$1) {
      return $$1;
   }

   @Override
   public epr<?> a() {
      return epr.b;
   }
}
