import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqg {
   public static final Codec<cqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aov.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cqg::new)
   );
   private final he<aov> b;
   private final double c;

   public cqg(he<aov> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public he<aov> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
