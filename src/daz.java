import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class daz {
   public static final Codec<daz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avb.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, daz::new)
   );
   private final iw<avb> b;
   private final double c;

   public daz(iw<avb> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public iw<avb> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
