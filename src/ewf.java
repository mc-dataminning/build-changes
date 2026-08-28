import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewf extends evt {
   public static final MapCodec<ewf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vl.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ewf::new));
   private final un b;

   private ewf(List<exr> $$0, un $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evv<ewf> b() {
      return evw.j;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      cyo.a(ku.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static evt.a<?> a(un $$0) {
      return a($$1 -> new ewf($$1, $$0));
   }
}
