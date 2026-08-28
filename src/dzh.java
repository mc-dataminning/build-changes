import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzh extends dzm {
   private final jm<dez> e;
   public static final MapCodec<dzh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dzh::new)
   );

   public dzh(kd $$0, jm<dez> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsc $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dzc<?> a() {
      return dzc.a;
   }
}
