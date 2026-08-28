import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtk extends dsr {
   public static final MapCodec<dtk> b = b(dtk::new);

   @Override
   public MapCodec<dtk> a() {
      return b;
   }

   protected dtk(dwv.d $$0) {
      super(dqs.b.d, $$0);
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, @Nullable bvg $$3, cwo $$4) {
      dtj.a($$0, $$1);
   }
}
