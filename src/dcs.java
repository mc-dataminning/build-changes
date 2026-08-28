import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcs {
   public static final Codec<dcs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avy.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dcs::new)
   );
   private final ji<avy> b;
   private final double c;

   public dcs(ji<avy> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ji<avy> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
