import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eec extends eei {
   final axe<djk> a;
   public static final MapCodec<eec> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axe.a(mc.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eec::new)
   );

   protected eec(km $$0, axe<djk> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dwv $$0) {
      return $$0.a(this.a);
   }

   @Override
   public edy<?> a() {
      return edy.b;
   }
}
