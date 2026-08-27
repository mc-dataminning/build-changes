import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxx {
   public static final Codec<cxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atx.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cxx::new)
   );
   private final il<atx> b;
   private final double c;

   public cxx(il<atx> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public il<atx> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
