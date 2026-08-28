import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddr {
   public static final Codec<ddr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avn.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, ddr::new)
   );
   private final jm<avn> b;
   private final double c;

   public ddr(jm<avn> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jm<avn> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
