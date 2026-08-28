import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkz {
   public static final Codec<dkz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awq.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dkz::new)
   );
   private final jg<awq> b;
   private final double c;

   public dkz(jg<awq> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jg<awq> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
