import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlj {
   public static final Codec<dlj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awx.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dlj::new)
   );
   private final jg<awx> b;
   private final double c;

   public dlj(jg<awx> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jg<awx> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
