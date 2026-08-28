import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evv extends ewc {
   public final axv<dne> a;
   public static final MapCodec<evv> b = axv.b(mi.i).xmap(evv::new, $$0 -> $$0.a).fieldOf("value");

   public evv(axv<dne> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ewf.d a(dkc $$0, iw $$1, iw $$2, ewf.d $$3, ewf.d $$4, ewb $$5) {
      return ekm.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ewe<?> a() {
      return ewe.n;
   }
}
