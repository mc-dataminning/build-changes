import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzf extends dzl {
   final axe<dey> a;
   public static final MapCodec<dzf> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axe.a(lq.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dzf::new)
   );

   protected dzf(kd $$0, axe<dey> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dsb $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dzb<?> a() {
      return dzb.b;
   }
}
