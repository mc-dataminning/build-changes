import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzc extends dzh {
   private final jm<deu> e;
   public static final MapCodec<dzc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dzc::new)
   );

   public dzc(kd $$0, jm<deu> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(drx $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dyx<?> a() {
      return dyx.a;
   }
}
