import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekt extends ekm {
   public static final MapCodec<ekt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ekt::new)
   );
   private final int c;

   private ekt(int $$0) {
      this.c = $$0;
   }

   public static ekt a(int $$0) {
      return new ekt($$0);
   }

   @Override
   protected boolean a(ekl $$0, azn $$1, jf $$2) {
      int $$3 = $$0.a(eao.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(eao.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eko<?> b() {
      return eko.d;
   }
}
