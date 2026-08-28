import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkx {
   public static final Codec<dkx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awo.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dkx::new)
   );
   private final jf<awo> b;
   private final double c;

   public dkx(jf<awo> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jf<awo> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
