import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqw {
   public static final Codec<cqw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(apf.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cqw::new)
   );
   private final he<apf> b;
   private final double c;

   public cqw(he<apf> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public he<apf> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
