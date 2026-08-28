import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record enc(int b, int c, int d, jf<erf> e) implements emp {
   public static final Codec<enc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.m.fieldOf("tries").orElse(128).forGetter(enc::a),
               ayw.l.fieldOf("xz_spread").orElse(7).forGetter(enc::b),
               ayw.l.fieldOf("y_spread").orElse(3).forGetter(enc::c),
               erf.b.fieldOf("feature").forGetter(enc::d)
            )
            .apply($$0, enc::new)
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

   public jf<erf> d() {
      return this.e;
   }
}
