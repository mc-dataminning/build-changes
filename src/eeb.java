import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeb(int b, int c, int d, jj<eia> e) implements edo {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.l.fieldOf("tries").orElse(128).forGetter(eeb::a),
               axo.k.fieldOf("xz_spread").orElse(7).forGetter(eeb::b),
               axo.k.fieldOf("y_spread").orElse(3).forGetter(eeb::c),
               eia.b.fieldOf("feature").forGetter(eeb::d)
            )
            .apply($$0, eeb::new)
   );

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public jj<eia> d() {
      return this.e;
   }
}
