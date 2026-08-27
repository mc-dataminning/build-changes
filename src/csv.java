import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class csv {
   public static final Codec<csv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqq.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, csv::new)
   );
   private final ib<aqq> b;
   private final double c;

   public csv(ib<aqq> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ib<aqq> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
