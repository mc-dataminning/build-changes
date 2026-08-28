import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcu {
   public static final Codec<dcu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avz.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dcu::new)
   );
   private final ji<avz> b;
   private final double c;

   public dcu(ji<avz> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ji<avz> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
