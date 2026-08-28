import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhg {
   public static final Codec<dhg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avz.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dhg::new)
   );
   private final jr<avz> b;
   private final double c;

   public dhg(jr<avz> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jr<avz> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
