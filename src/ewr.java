import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewr extends evt {
   public static final MapCodec<ewr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cyc.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ewr::new));
   private final jq<cyc> b;

   private ewr(List<exr> $$0, jq<cyc> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evv<ewr> b() {
      return evw.F;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      $$0.a(ku.Q, cye.a, this.b, cye::b);
      return $$0;
   }

   public static evt.a<?> a(jq<cyc> $$0) {
      return a($$1 -> new ewr($$1, $$0));
   }
}
