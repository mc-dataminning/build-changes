import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcm extends dby {
   public static final MapCodec<dcm> b = b(dcm::new);

   @Override
   public MapCodec<dcm> a() {
      return b;
   }

   protected dcm(dfc.d $$0) {
      super(dac.b.d, $$0);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      cte.gG.a($$0, $$1, $$2, $$3, $$4);
   }
}
