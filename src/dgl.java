import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgl {
   public static final Codec<dgl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awm.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dgl::new)
   );
   private final jq<awm> b;
   private final double c;

   public dgl(jq<awm> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jq<awm> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
