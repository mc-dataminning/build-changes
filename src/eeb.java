import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeb(egn b, eac c, bpv d, int e) implements eee {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egn.a.fieldOf("state_provider").forGetter(eeb::a),
               eac.b.fieldOf("target").forGetter(eeb::b),
               bpv.b(0, 8).fieldOf("radius").forGetter(eeb::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eeb::d)
            )
            .apply($$0, eeb::new)
   );

   public egn a() {
      return this.b;
   }

   public eac b() {
      return this.c;
   }

   public bpv c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
