import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dge {
   public static final Codec<dge> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awn.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dge::new)
   );
   private final jq<awn> b;
   private final double c;

   public dge(jq<awn> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jq<awn> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
