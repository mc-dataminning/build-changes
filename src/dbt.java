import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbt {
   public static final Codec<dbt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avg.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dbt::new)
   );
   private final ix<avg> b;
   private final double c;

   public dbt(ix<avg> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ix<avg> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
