import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ctu {
   public static final Codec<ctu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arb.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, ctu::new)
   );
   private final ie<arb> b;
   private final double c;

   public ctu(ie<arb> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ie<arb> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
