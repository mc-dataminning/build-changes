import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddd {
   public static final Codec<ddd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avg.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, ddd::new)
   );
   private final jj<avg> b;
   private final double c;

   public ddd(jj<avg> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jj<avg> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
