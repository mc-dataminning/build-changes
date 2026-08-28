import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epa extends epc {
   public static final MapCodec<epa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dus.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, epa::new)
   );
   private final dus b;
   private final float d;

   public epa(dus $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dus $$0, azn $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected epd<?> a() {
      return epd.f;
   }
}
