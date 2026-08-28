import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dka {
   public static final Codec<dka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awm.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dka::new)
   );
   private final je<awm> b;
   private final double c;

   public dka(je<awm> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public je<awm> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
