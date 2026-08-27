import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtd(dvp b, dpf c, biq d, int e) implements dtg {
   public static final Codec<dtd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvp.a.fieldOf("state_provider").forGetter(dtd::a),
               dpf.b.fieldOf("target").forGetter(dtd::b),
               biq.b(0, 8).fieldOf("radius").forGetter(dtd::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dtd::d)
            )
            .apply($$0, dtd::new)
   );

   public dvp a() {
      return this.b;
   }

   public dpf b() {
      return this.c;
   }

   public biq c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
