import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzm extends dzr {
   private final jn<dff> e;
   public static final MapCodec<dzm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jy.a(lr.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dzm::new)
   );

   public dzm(ke $$0, jn<dff> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsh $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dzh<?> a() {
      return dzh.a;
   }
}
