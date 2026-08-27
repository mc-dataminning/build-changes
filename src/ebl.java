import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebl implements ebh {
   public static final Codec<ebl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dtz.c).fieldOf("height").forGetter($$0x -> $$0x.b), dqh.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ebl::new)
   );
   public final int b;
   public final dqh c;

   public ebl(int $$0, dqh $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
