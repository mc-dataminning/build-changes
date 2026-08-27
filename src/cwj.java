import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwj {
   public static final Codec<cwj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atj.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cwj::new)
   );
   private final ij<atj> b;
   private final double c;

   public cwj(ij<atj> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ij<atj> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
