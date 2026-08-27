import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbv {
   public static final Codec<dbv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avh.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dbv::new)
   );
   private final ix<avh> b;
   private final double c;

   public dbv(ix<avh> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ix<avh> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
