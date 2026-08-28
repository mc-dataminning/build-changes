import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emn(epa b, eim c, bty d, int e) implements emr {
   public static final Codec<emn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epa.a.fieldOf("state_provider").forGetter(emn::a),
               eim.b.fieldOf("target").forGetter(emn::b),
               bty.b(0, 8).fieldOf("radius").forGetter(emn::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(emn::d)
            )
            .apply($$0, emn::new)
   );

   public epa a() {
      return this.b;
   }

   public eim b() {
      return this.c;
   }

   public bty c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
