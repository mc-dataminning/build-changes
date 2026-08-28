import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egh(int b, int c, int d, jn<ekg> e) implements efu {
   public static final Codec<egh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aym.l.fieldOf("tries").orElse(128).forGetter(egh::a),
               aym.k.fieldOf("xz_spread").orElse(7).forGetter(egh::b),
               aym.k.fieldOf("y_spread").orElse(3).forGetter(egh::c),
               ekg.b.fieldOf("feature").forGetter(egh::d)
            )
            .apply($$0, egh::new)
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

   public jn<ekg> d() {
      return this.e;
   }
}
