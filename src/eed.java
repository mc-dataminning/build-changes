import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eed extends eej {
   final axf<djl> a;
   public static final MapCodec<eed> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.a(mc.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eed::new)
   );

   protected eed(km $$0, axf<djl> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dww $$0) {
      return $$0.a(this.a);
   }

   @Override
   public edz<?> a() {
      return edz.b;
   }
}
