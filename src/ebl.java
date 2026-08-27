import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebl(int b, int c, int d, iv<efk> e) implements eay {
   public static final Codec<ebl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.j.fieldOf("tries").orElse(128).forGetter(ebl::a),
               axe.i.fieldOf("xz_spread").orElse(7).forGetter(ebl::b),
               axe.i.fieldOf("y_spread").orElse(3).forGetter(ebl::c),
               efk.b.fieldOf("feature").forGetter(ebl::d)
            )
            .apply($$0, ebl::new)
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

   public iv<efk> d() {
      return this.e;
   }
}
