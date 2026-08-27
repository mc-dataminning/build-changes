import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqc(int b, int c, int d, hf<dub> e) implements dpp {
   public static final Codec<dqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqw.j.fieldOf("tries").orElse(128).forGetter(dqc::a),
               aqw.i.fieldOf("xz_spread").orElse(7).forGetter(dqc::b),
               aqw.i.fieldOf("y_spread").orElse(3).forGetter(dqc::c),
               dub.b.fieldOf("feature").forGetter(dqc::d)
            )
            .apply($$0, dqc::new)
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

   public hf<dub> d() {
      return this.e;
   }
}
