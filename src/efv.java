import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efv(eih b, ebv c, bqx d, int e) implements efy {
   public static final Codec<efv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eih.a.fieldOf("state_provider").forGetter(efv::a),
               ebv.b.fieldOf("target").forGetter(efv::b),
               bqx.b(0, 8).fieldOf("radius").forGetter(efv::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(efv::d)
            )
            .apply($$0, efv::new)
   );

   public eih a() {
      return this.b;
   }

   public ebv b() {
      return this.c;
   }

   public bqx c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
