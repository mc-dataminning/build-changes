import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqe(int b, int c, int d, he<dud> e) implements dpr {
   public static final Codec<dqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.j.fieldOf("tries").orElse(128).forGetter(dqe::a),
               aqy.i.fieldOf("xz_spread").orElse(7).forGetter(dqe::b),
               aqy.i.fieldOf("y_spread").orElse(3).forGetter(dqe::c),
               dud.b.fieldOf("feature").forGetter(dqe::d)
            )
            .apply($$0, dqe::new)
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

   public he<dud> d() {
      return this.e;
   }
}
