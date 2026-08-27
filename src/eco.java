import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eco(int b, int c, int d, ix<egn> e) implements ecb {
   public static final Codec<eco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.j.fieldOf("tries").orElse(128).forGetter(eco::a),
               axm.i.fieldOf("xz_spread").orElse(7).forGetter(eco::b),
               axm.i.fieldOf("y_spread").orElse(3).forGetter(eco::c),
               egn.b.fieldOf("feature").forGetter(eco::d)
            )
            .apply($$0, eco::new)
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

   public ix<egn> d() {
      return this.e;
   }
}
