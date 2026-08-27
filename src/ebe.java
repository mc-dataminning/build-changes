import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebe extends ebg {
   public static final Codec<ebe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhn.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ebe::new)
   );
   private final dhn b;
   private final float d;

   public ebe(dhn $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dhn $$0, atw $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ebh<?> a() {
      return ebh.f;
   }
}
