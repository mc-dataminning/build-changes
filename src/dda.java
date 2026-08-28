import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dda {
   public static final Codec<dda> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ave.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dda::new)
   );
   private final jj<ave> b;
   private final double c;

   public dda(jj<ave> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jj<ave> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
