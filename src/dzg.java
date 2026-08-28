import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzg extends dzm {
   final axf<dez> a;
   public static final MapCodec<dzg> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.a(lq.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dzg::new)
   );

   protected dzg(kd $$0, axf<dez> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dsc $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dzc<?> a() {
      return dzc.b;
   }
}
