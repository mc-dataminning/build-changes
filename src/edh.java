import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edh implements edd {
   public static final Codec<edh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvv.c).fieldOf("height").forGetter($$0x -> $$0x.b), dsd.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, edh::new)
   );
   public final int b;
   public final dsd c;

   public edh(int $$0, dsd $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
