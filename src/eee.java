import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eee extends eek {
   final axf<djm> a;
   public static final MapCodec<eee> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.a(mc.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eee::new)
   );

   protected eee(km $$0, axf<djm> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dwx $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eea<?> a() {
      return eea.b;
   }
}
