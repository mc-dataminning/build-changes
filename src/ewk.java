import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewk extends evj {
   public static final Codec<xh> a = xj.a.validate($$0 -> czd.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<ewk> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czd.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), evi.a.forGetter($$0x -> $$0x.d))).apply($$0, ewk::new)
   );
   private final List<ase<xh>> c;
   private final evi d;

   protected ewk(List<exh> $$0, List<ase<xh>> $$1, evi $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cvx a(cvx $$0, etw $$1) {
      $$0.a(kt.S, czd.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public czd a(czd $$0) {
      List<ase<xh>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public evl<ewk> b() {
      return evm.N;
   }
}
