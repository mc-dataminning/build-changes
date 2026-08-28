import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edi implements ede {
   public static final Codec<edi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvw.c).fieldOf("height").forGetter($$0x -> $$0x.b), dse.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, edi::new)
   );
   public final int b;
   public final dse c;

   public edi(int $$0, dse $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
