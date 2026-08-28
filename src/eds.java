import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eds implements edo {
   public static final Codec<eds> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwf.c).fieldOf("height").forGetter($$0x -> $$0x.b), dsk.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, eds::new)
   );
   public final int b;
   public final dsk c;

   public eds(int $$0, dsk $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
