import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewg extends evt {
   static final MapCodec<ewg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eyo.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, ewg::new));
   private final eyn b;

   private ewg(List<exr> $$0, eyn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.a();
   }

   @Override
   public evv<ewg> b() {
      return evw.R;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      $$0.b(ku.p, new cyp(this.b.a($$1)));
      return $$0;
   }
}
