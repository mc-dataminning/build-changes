import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evv extends evj {
   public static final MapCodec<evv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vh.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, evv::new));
   private final uj b;

   private evv(List<exh> $$0, uj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evl<evv> b() {
      return evm.j;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      cyg.a(kt.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static evj.a<?> a(uj $$0) {
      return a($$1 -> new evv($$1, $$0));
   }
}
