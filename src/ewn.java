import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewn extends evt {
   public static final MapCodec<ewn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ali.a(ma.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, ewn::new)
   );
   private final jq<cwb> b;

   private ewn(List<exr> $$0, jq<cwb> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evv<ewn> b() {
      return evw.f;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      return $$0.a(this.b.a());
   }
}
