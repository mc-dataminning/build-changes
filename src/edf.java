import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edf implements edb {
   public static final Codec<edf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvt.c).fieldOf("height").forGetter($$0x -> $$0x.b), dsb.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, edf::new)
   );
   public final int b;
   public final dsb c;

   public edf(int $$0, dsb $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
