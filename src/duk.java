import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duk implements dug {
   public static final Codec<duk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dmy.c).fieldOf("height").forGetter($$0x -> $$0x.b), djp.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, duk::new)
   );
   public final int b;
   public final djp c;

   public duk(int $$0, djp $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
