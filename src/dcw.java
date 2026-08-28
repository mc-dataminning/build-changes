import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcw {
   public static final Codec<dcw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avz.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dcw::new)
   );
   private final ji<avz> b;
   private final double c;

   public dcw(ji<avz> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ji<avz> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
