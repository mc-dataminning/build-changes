import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzh extends dzn {
   final axf<dfa> a;
   public static final MapCodec<dzh> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.a(lq.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dzh::new)
   );

   protected dzh(kd $$0, axf<dfa> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dsd $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dzd<?> a() {
      return dzd.b;
   }
}
