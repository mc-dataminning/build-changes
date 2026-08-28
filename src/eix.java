import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eix implements eit {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ebj.c).fieldOf("height").forGetter($$0x -> $$0x.b), dxo.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eix::new)
   );
   public final int b;
   public final dxo c;

   public eix(int $$0, dxo $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
