import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqq {
   public static final Codec<cqq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(apc.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cqq::new)
   );
   private final he<apc> b;
   private final double c;

   public cqq(he<apc> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public he<apc> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
