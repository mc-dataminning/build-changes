import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dya implements dxw {
   public static final Codec<dya> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dqo.c).fieldOf("height").forGetter($$0x -> $$0x.b), dnb.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dya::new)
   );
   public final int b;
   public final dnb c;

   public dya(int $$0, dnb $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
