import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eca extends ecg {
   final axl<dhm> a;
   public static final MapCodec<eca> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axl.a(lw.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eca::new)
   );

   protected eca(kj $$0, axl<dhm> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dus $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ebw<?> a() {
      return ebw.b;
   }
}
