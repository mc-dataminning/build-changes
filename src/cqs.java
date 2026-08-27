import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqs {
   public static final Codec<cqs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ape.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cqs::new)
   );
   private final hg<ape> b;
   private final double c;

   public cqs(hg<ape> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public hg<ape> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
