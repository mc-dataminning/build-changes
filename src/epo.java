import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class epo implements epq {
   private static final epo b = new epo();
   public static final MapCodec<epo> a = MapCodec.unit(b);

   @Override
   public ug a(azn $$0, @Nullable ug $$1) {
      return new ug();
   }

   @Override
   public epr<?> a() {
      return epr.a;
   }
}
