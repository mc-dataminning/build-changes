import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czt {
   public static final Codec<czt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aul.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, czt::new)
   );
   private final il<aul> b;
   private final double c;

   public czt(il<aul> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public il<aul> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
