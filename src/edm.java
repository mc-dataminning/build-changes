import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edm implements edi {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvz.c).fieldOf("height").forGetter($$0x -> $$0x.b), dsh.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, edm::new)
   );
   public final int b;
   public final dsh c;

   public edm(int $$0, dsh $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
