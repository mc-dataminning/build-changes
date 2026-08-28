import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfz {
   public static final Codec<dfz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awk.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dfz::new)
   );
   private final jq<awk> b;
   private final double c;

   public dfz(jq<awk> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jq<awk> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
