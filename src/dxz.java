import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxz extends dxg {
   public static final MapCodec<dxz> b = b(dxz::new);

   @Override
   public MapCodec<dxz> a() {
      return b;
   }

   protected dxz(ebp.d $$0) {
      super(dva.b.d, $$0);
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, @Nullable byf $$3, dak $$4) {
      dxy.a($$0, $$1);
   }
}
