import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evr extends evt {
   public static final MapCodec<evr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(euf.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, evr::new));
   private final euf b;

   private evr(List<exr> $$0, euf $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evv<evr> b() {
      return evw.w;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.a();
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.e($$2);
      return $$0;
   }

   public static evt.a<?> a(euf $$0) {
      return a($$1 -> new evr($$1, $$0));
   }
}
