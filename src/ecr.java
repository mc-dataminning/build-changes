import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecr extends ect {
   public static final Codec<ecr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dja.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ecr::new)
   );
   private final dja b;
   private final float d;

   public ecr(dja $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dja $$0, aup $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ecu<?> a() {
      return ecu.f;
   }
}
