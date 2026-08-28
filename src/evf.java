import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evf extends evm {
   public final axr<dmr> a;
   public static final MapCodec<evf> b = axr.b(mh.i).xmap(evf::new, $$0 -> $$0.a).fieldOf("value");

   public evf(axr<dmr> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public evp.d a(djp $$0, iv $$1, iv $$2, evp.d $$3, evp.d $$4, evl $$5) {
      return ejy.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected evo<?> a() {
      return evo.n;
   }
}
