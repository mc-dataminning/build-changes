import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efk implements efg {
   public static final Codec<efk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dxw.c).fieldOf("height").forGetter($$0x -> $$0x.b), dua.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, efk::new)
   );
   public final int b;
   public final dua c;

   public efk(int $$0, dua $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
