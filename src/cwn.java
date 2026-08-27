import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwn {
   public static final Codec<cwn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atk.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cwn::new)
   );
   private final ij<atk> b;
   private final double c;

   public cwn(ij<atk> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ij<atk> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
