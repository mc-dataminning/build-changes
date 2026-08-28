import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvy extends dvf {
   public static final MapCodec<dvy> b = b(dvy::new);

   @Override
   public MapCodec<dvy> a() {
      return b;
   }

   protected dvy(dzn.d $$0) {
      super(dtc.b.d, $$0);
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, @Nullable bwz $$3, cys $$4) {
      dvx.a($$0, $$1);
   }
}
