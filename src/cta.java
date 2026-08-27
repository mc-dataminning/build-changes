import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cta {
   public static final Codec<cta> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqu.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cta::new)
   );
   private final ig<aqu> b;
   private final double c;

   public cta(ig<aqu> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ig<aqu> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
