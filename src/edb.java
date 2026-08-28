import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edb implements ecx {
   public static final Codec<edb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dvp.c).fieldOf("height").forGetter($$0x -> $$0x.b), drx.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, edb::new)
   );
   public final int b;
   public final drx c;

   public edb(int $$0, drx $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
