import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dac {
   public static final Codec<dac> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aun.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dac::new)
   );
   private final in<aun> b;
   private final double c;

   public dac(in<aun> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public in<aun> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
