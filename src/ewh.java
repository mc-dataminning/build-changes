import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewh extends evj {
   public static final MapCodec<ewh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cxu.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ewh::new));
   private final jp<cxu> b;

   private ewh(List<exh> $$0, jp<cxu> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evl<ewh> b() {
      return evm.F;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      $$0.a(kt.P, cxw.a, this.b, cxw::b);
      return $$0;
   }

   public static evj.a<?> a(jp<cxu> $$0) {
      return a($$1 -> new ewh($$1, $$0));
   }
}
