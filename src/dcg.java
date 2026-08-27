import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dcg extends dfp {
   public static final MapCodec<dcg> b = b(dcg::new);

   @Override
   public MapCodec<dcg> a() {
      return b;
   }

   protected dcg(djg.d $$0) {
      super(ddr.b.e, $$0);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      cws.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cmy> a(djh $$0, ehc.a $$1) {
      return cws.gK.a($$0, $$1);
   }
}
