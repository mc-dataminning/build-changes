import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzi extends dzo {
   final axf<dfb> a;
   public static final MapCodec<dzi> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.a(lq.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dzi::new)
   );

   protected dzi(kd $$0, axf<dfb> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dse $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dze<?> a() {
      return dze.b;
   }
}
