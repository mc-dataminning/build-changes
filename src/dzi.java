import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzi extends dzn {
   private final jm<dfa> e;
   public static final MapCodec<dzi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dzi::new)
   );

   public dzi(kd $$0, jm<dfa> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsd $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dzd<?> a() {
      return dzd.a;
   }
}
