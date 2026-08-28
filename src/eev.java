import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eev(int b, int c, int d, jm<eiv> e) implements eei {
   public static final Codec<eev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.l.fieldOf("tries").orElse(128).forGetter(eev::a),
               axw.k.fieldOf("xz_spread").orElse(7).forGetter(eev::b),
               axw.k.fieldOf("y_spread").orElse(3).forGetter(eev::c),
               eiv.b.fieldOf("feature").forGetter(eev::d)
            )
            .apply($$0, eev::new)
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

   public jm<eiv> d() {
      return this.e;
   }
}
