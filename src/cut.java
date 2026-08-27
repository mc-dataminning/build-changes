import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cut {
   public static final Codec<cut> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ars.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cut::new)
   );
   private final ih<ars> b;
   private final double c;

   public cut(ih<ars> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ih<ars> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
