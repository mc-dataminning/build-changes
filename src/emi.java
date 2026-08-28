import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emi extends emk {
   public static final MapCodec<emi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsh.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, emi::new)
   );
   private final dsh b;
   private final float d;

   public emi(dsh $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsh $$0, aym $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eml<?> a() {
      return eml.f;
   }
}
