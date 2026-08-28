import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edl(efx b, dzm c, bpl d, int e) implements edo {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efx.a.fieldOf("state_provider").forGetter(edl::a),
               dzm.b.fieldOf("target").forGetter(edl::b),
               bpl.b(0, 8).fieldOf("radius").forGetter(edl::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(edl::d)
            )
            .apply($$0, edl::new)
   );

   public efx a() {
      return this.b;
   }

   public dzm b() {
      return this.c;
   }

   public bpl c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
