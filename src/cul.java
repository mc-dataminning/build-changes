import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cul {
   public static final Codec<cul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arr.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cul::new)
   );
   private final ih<arr> b;
   private final double c;

   public cul(ih<arr> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ih<arr> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
