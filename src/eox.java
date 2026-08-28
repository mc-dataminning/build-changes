import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eox implements eoy {
   public static final eox a = new eox();
   public static final MapCodec<eox> b = MapCodec.unit(a);

   @Nullable
   @Override
   public uf a(azk $$0, @Nullable uf $$1) {
      return $$1;
   }

   @Override
   public eoz<?> a() {
      return eoz.b;
   }
}
