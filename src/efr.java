import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efr(eid b, ebr c, bqu d, int e) implements efu {
   public static final Codec<efr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eid.a.fieldOf("state_provider").forGetter(efr::a),
               ebr.b.fieldOf("target").forGetter(efr::b),
               bqu.b(0, 8).fieldOf("radius").forGetter(efr::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(efr::d)
            )
            .apply($$0, efr::new)
   );

   public eid a() {
      return this.b;
   }

   public ebr b() {
      return this.c;
   }

   public bqu c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
