import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpr extends doy {
   public static final MapCodec<dpr> b = b(dpr::new);

   @Override
   public MapCodec<dpr> a() {
      return b;
   }

   protected dpr(dsz.d $$0) {
      super(dmz.b.d, $$0);
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, @Nullable btl $$3, cuo $$4) {
      dpq.a($$0, $$1);
   }
}
