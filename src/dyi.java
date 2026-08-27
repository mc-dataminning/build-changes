import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyi extends dyk {
   public static final Codec<dyi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dey.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, dyi::new)
   );
   private final dey b;
   private final float d;

   public dyi(dey $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dey $$0, art $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected dyl<?> a() {
      return dyl.f;
   }
}
