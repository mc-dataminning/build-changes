import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eex(int b, int c, int d, ja<eix> e) implements eek {
   public static final Codec<eex> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.j.fieldOf("tries").orElse(128).forGetter(eex::a),
               axu.i.fieldOf("xz_spread").orElse(7).forGetter(eex::b),
               axu.i.fieldOf("y_spread").orElse(3).forGetter(eex::c),
               eix.b.fieldOf("feature").forGetter(eex::d)
            )
            .apply($$0, eex::new)
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

   public ja<eix> d() {
      return this.e;
   }
}
