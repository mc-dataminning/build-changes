import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewq extends evt {
   static final MapCodec<ewq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eyo.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, ewq::new));
   private final eyn b;

   private ewq(List<exr> $$0, eyn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.a();
   }

   @Override
   public evv<ewq> b() {
      return evw.Q;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      int $$2 = azn.a(this.b.a($$1), 0, 4);
      $$0.b(ku.aa, new czd($$2));
      return $$0;
   }

   public eyn c() {
      return this.b;
   }

   public static evt.a<?> a(eyn $$0) {
      return a($$1 -> new ewq($$1, $$0));
   }
}
