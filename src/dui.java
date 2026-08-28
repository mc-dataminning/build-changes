import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dui extends dtp {
   public static final MapCodec<dui> b = b(dui::new);

   @Override
   public MapCodec<dui> a() {
      return b;
   }

   protected dui(dxt.d $$0) {
      super(drq.b.d, $$0);
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, @Nullable bwf $$3, cxo $$4) {
      duh.a($$0, $$1);
   }
}
