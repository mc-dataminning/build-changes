import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ewk extends evt {
   public static final MapCodec<ewk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axt.b(ma.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ewk::new)
   );
   private final axt<cvy> b;

   private ewk(List<exr> $$0, axt<cvy> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evv<ewk> b() {
      return evw.G;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      kd<cvy> $$2 = $$1.d().H_().e(ma.I);
      Optional<jq<cvy>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(ku.Z, $$3.get());
      }

      return $$0;
   }

   public static evt.a<?> a(axt<cvy> $$0) {
      return a($$1 -> new ewk($$1, $$0));
   }
}
