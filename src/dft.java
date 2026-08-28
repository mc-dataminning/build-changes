import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dft {
   public static final Codec<dft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awj.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dft::new)
   );
   private final jp<awj> b;
   private final double c;

   public dft(jp<awj> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jp<awj> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
