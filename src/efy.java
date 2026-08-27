import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efy extends ega {
   public static final Codec<efy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dme.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, efy::new)
   );
   private final dme b;
   private final float d;

   public efy(dme $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dme $$0, awt $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected egb<?> a() {
      return egb.f;
   }
}
