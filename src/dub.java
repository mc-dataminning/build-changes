import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dub implements dtx {
   public static final Codec<dub> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dmp.c).fieldOf("height").forGetter($$0x -> $$0x.b), djg.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dub::new)
   );
   public final int b;
   public final djg c;

   public dub(int $$0, djg $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
