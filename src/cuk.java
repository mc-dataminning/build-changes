import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cuk {
   public static final Codec<cuk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arq.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cuk::new)
   );
   private final ih<arq> b;
   private final double c;

   public cuk(ih<arq> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ih<arq> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
