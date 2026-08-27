import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class daq {
   public static final Codec<daq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(auy.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, daq::new)
   );
   private final iv<auy> b;
   private final double c;

   public daq(iv<auy> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public iv<auy> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
