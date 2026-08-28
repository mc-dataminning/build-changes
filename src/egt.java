import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egt implements egp {
   public static final Codec<egt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dzf.c).fieldOf("height").forGetter($$0x -> $$0x.b), dvj.a.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, egt::new)
   );
   public final int b;
   public final dvj c;

   public egt(int $$0, dvj $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
