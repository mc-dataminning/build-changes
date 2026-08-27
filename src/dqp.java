import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqp(int b, int c, int d, hg<duo> e) implements dqc {
   public static final Codec<dqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arh.j.fieldOf("tries").orElse(128).forGetter(dqp::a),
               arh.i.fieldOf("xz_spread").orElse(7).forGetter(dqp::b),
               arh.i.fieldOf("y_spread").orElse(3).forGetter(dqp::c),
               duo.b.fieldOf("feature").forGetter(dqp::d)
            )
            .apply($$0, dqp::new)
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

   public hg<duo> d() {
      return this.e;
   }
}
