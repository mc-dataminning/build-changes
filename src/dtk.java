import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtk implements dtg {
   public static final Codec<dtk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dly.c).fieldOf("height").forGetter($$0x -> $$0x.b), dip.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, dtk::new)
   );
   public final int b;
   public final dip c;

   public dtk(int $$0, dip $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
