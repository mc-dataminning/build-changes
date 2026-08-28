import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxp extends dww {
   public static final MapCodec<dxp> b = b(dxp::new);

   @Override
   public MapCodec<dxp> a() {
      return b;
   }

   protected dxp(ebf.d $$0) {
      super(duq.b.d, $$0);
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, @Nullable bxw $$3, daa $$4) {
      dxo.a($$0, $$1);
   }
}
