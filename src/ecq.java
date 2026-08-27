import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecq(int b, int c, int d, ix<egp> e) implements ecd {
   public static final Codec<ecq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axn.j.fieldOf("tries").orElse(128).forGetter(ecq::a),
               axn.i.fieldOf("xz_spread").orElse(7).forGetter(ecq::b),
               axn.i.fieldOf("y_spread").orElse(3).forGetter(ecq::c),
               egp.b.fieldOf("feature").forGetter(ecq::d)
            )
            .apply($$0, ecq::new)
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

   public ix<egp> d() {
      return this.e;
   }
}
