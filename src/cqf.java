import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqf {
   public static final Codec<cqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aot.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cqf::new)
   );
   private final hf<aot> b;
   private final double c;

   public cqf(hf<aot> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public hf<aot> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
