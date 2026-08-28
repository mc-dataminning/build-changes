import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfe {
   public static final Codec<dfe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awd.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dfe::new)
   );
   private final jn<awd> b;
   private final double c;

   public dfe(jn<awd> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jn<awd> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
