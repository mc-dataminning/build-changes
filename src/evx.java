import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class evx extends evz {
   public static final MapCodec<evx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebg.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, evx::new)
   );
   private final ebg b;
   private final float d;

   public evx(ebg $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(ebg $$0, azz $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ewa<?> a() {
      return ewa.f;
   }
}
