import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewc extends evt {
   public static final MapCodec<ewc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kr.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, ewc::new)
   );
   private final kr b;

   private ewc(List<exr> $$0, kr $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evv<ewc> b() {
      return evw.k;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> evt.a<?> a(kt<T> $$0, T $$1) {
      return a($$2 -> new ewc($$2, kr.a().a($$0, $$1).a()));
   }
}
