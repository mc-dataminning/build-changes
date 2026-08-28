import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egl(int b, int c, int d, jo<ekk> e) implements efy {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.l.fieldOf("tries").orElse(128).forGetter(egl::a),
               ayo.k.fieldOf("xz_spread").orElse(7).forGetter(egl::b),
               ayo.k.fieldOf("y_spread").orElse(3).forGetter(egl::c),
               ekk.b.fieldOf("feature").forGetter(egl::d)
            )
            .apply($$0, egl::new)
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

   public jo<ekk> d() {
      return this.e;
   }
}
