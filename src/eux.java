import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eux extends evm {
   public static final MapCodec<eux> a = MapCodec.unit(() -> eux.b);
   public static final eux b = new eux();

   @Nullable
   @Override
   public evp.d a(djp $$0, iv $$1, iv $$2, evp.d $$3, evp.d $$4, evl $$5) {
      iv $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dmt.K);
      return $$7 && !dmr.a($$4.b().f($$0, $$6)) ? new evp.d($$6, dmt.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected evo<?> a() {
      return evo.m;
   }
}
