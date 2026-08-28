import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eed extends eei {
   private final jv<djk> e;
   public static final MapCodec<eed> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kg.a(mc.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eed::new)
   );

   public eed(km $$0, jv<djk> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dwv $$0) {
      return $$0.a(this.e);
   }

   @Override
   public edy<?> a() {
      return edy.a;
   }
}
