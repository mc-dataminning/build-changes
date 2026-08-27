import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cru {
   public static final Codec<cru> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqc.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cru::new)
   );
   private final ib<aqc> b;
   private final double c;

   public cru(ib<aqc> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ib<aqc> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
