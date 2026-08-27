import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cnh {
   public static final Codec<cnh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(amg.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cnh::new)
   );
   private final he<amg> b;
   private final double c;

   public cnh(he<amg> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public he<amg> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
