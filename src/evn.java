import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evn extends evt {
   public static final MapCodec<evn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eug.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, evn::new)
   );
   private final eug.b b;

   public evn(List<exr> $$0, eug.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evv<evn> b() {
      return evw.B;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      if ($$0.a(cwj.uF) && $$1.c(this.b.a()) instanceof cor $$2) {
         $$0.b(ku.ag, new cze($$2.gk()));
      }

      return $$0;
   }

   public static evt.a<?> a(eug.b $$0) {
      return a($$1 -> new evn($$1, $$0));
   }
}
