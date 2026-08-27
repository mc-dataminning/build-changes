import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsa(int b, int c, int d, ib<dvz> e) implements drn {
   public static final Codec<dsa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.j.fieldOf("tries").orElse(128).forGetter(dsa::a),
               asq.i.fieldOf("xz_spread").orElse(7).forGetter(dsa::b),
               asq.i.fieldOf("y_spread").orElse(3).forGetter(dsa::c),
               dvz.b.fieldOf("feature").forGetter(dsa::d)
            )
            .apply($$0, dsa::new)
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

   public ib<dvz> d() {
      return this.e;
   }
}
