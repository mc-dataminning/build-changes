import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djp {
   public static final Codec<djp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awk.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, djp::new)
   );
   private final je<awk> b;
   private final double c;

   public djp(je<awk> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public je<awk> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
