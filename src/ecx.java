import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecx extends ecz {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(djg.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ecx::new)
   );
   private final djg b;
   private final float d;

   public ecx(djg $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(djg $$0, auu $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eda<?> a() {
      return eda.f;
   }
}
