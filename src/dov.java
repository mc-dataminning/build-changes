import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dov extends doc {
   public static final MapCodec<dov> b = b(dov::new);

   @Override
   public MapCodec<dov> a() {
      return b;
   }

   protected dov(dsd.d $$0) {
      super(dmd.b.d, $$0);
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, @Nullable btr $$3, cur $$4) {
      dou.a($$0, $$1);
   }
}
