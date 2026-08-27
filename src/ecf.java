import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecf implements ecb {
   public static final Codec<ecf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dut.c).fieldOf("height").forGetter($$0x -> $$0x.b), drb.b.fieldOf("state").forGetter($$0x -> $$0x.c))
            .apply($$0, ecf::new)
   );
   public final int b;
   public final drb c;

   public ecf(int $$0, drb $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
