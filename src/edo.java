import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edo(int b, int c, int d, ji<ehn> e) implements edb {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayg.l.fieldOf("tries").orElse(128).forGetter(edo::a),
               ayg.k.fieldOf("xz_spread").orElse(7).forGetter(edo::b),
               ayg.k.fieldOf("y_spread").orElse(3).forGetter(edo::c),
               ehn.b.fieldOf("feature").forGetter(edo::d)
            )
            .apply($$0, edo::new)
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

   public ji<ehn> d() {
      return this.e;
   }
}
