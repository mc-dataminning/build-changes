import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcp {
   public static final Codec<dcp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avv.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dcp::new)
   );
   private final ji<avv> b;
   private final double c;

   public dcp(ji<avv> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ji<avv> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
