import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eje implements eja {
   public static final Codec<eje> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ebq.c).fieldOf("height").forGetter($$0x -> $$0x.b), dxv.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eje::new)
   );
   public final int b;
   public final dxv c;

   public eje(int $$0, dxv $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
