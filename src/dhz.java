import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhz {
   public static final Codec<dhz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dhz::new)
   );
   private final jq<axe> b;
   private final double c;

   public dhz(jq<axe> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jq<axe> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
