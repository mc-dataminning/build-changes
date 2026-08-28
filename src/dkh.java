import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkh {
   public static final Codec<dkh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awm.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dkh::new)
   );
   private final jf<awm> b;
   private final double c;

   public dkh(jf<awm> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jf<awm> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
