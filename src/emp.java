import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emp(int b, int c, int d, jf<eqr> e) implements emc {
   public static final Codec<emp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.m.fieldOf("tries").orElse(128).forGetter(emp::a),
               ayu.l.fieldOf("xz_spread").orElse(7).forGetter(emp::b),
               ayu.l.fieldOf("y_spread").orElse(3).forGetter(emp::c),
               eqr.b.fieldOf("feature").forGetter(emp::d)
            )
            .apply($$0, emp::new)
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

   public jf<eqr> d() {
      return this.e;
   }
}
