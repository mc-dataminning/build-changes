import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ech implements ecd {
   public static final Codec<ech> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, duv.c).fieldOf("height").forGetter($$0x -> $$0x.b), drd.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ech::new)
   );
   public final int b;
   public final drd c;

   public ech(int $$0, drd $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
