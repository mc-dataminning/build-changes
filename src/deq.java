import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deq {
   public static final Codec<deq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awc.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, deq::new)
   );
   private final jn<awc> b;
   private final double c;

   public deq(jn<awc> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jn<awc> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
