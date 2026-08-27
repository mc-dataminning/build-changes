import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxa {
   public static final Codec<cxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ato.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cxa::new)
   );
   private final il<ato> b;
   private final double c;

   public cxa(il<ato> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public il<ato> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
