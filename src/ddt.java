import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddt {
   public static final Codec<ddt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avo.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, ddt::new)
   );
   private final jm<avo> b;
   private final double c;

   public ddt(jm<avo> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jm<avo> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
