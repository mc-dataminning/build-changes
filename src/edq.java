import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edq(int b, int c, int d, ji<ehp> e) implements edd {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.l.fieldOf("tries").orElse(128).forGetter(edq::a),
               ayh.k.fieldOf("xz_spread").orElse(7).forGetter(edq::b),
               ayh.k.fieldOf("y_spread").orElse(3).forGetter(edq::c),
               ehp.b.fieldOf("feature").forGetter(edq::d)
            )
            .apply($$0, edq::new)
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

   public ji<ehp> d() {
      return this.e;
   }
}
