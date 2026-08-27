import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqh(int b, int c, int d, he<dug> e) implements dpu {
   public static final Codec<dqh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arj.j.fieldOf("tries").orElse(128).forGetter(dqh::a),
               arj.i.fieldOf("xz_spread").orElse(7).forGetter(dqh::b),
               arj.i.fieldOf("y_spread").orElse(3).forGetter(dqh::c),
               dug.b.fieldOf("feature").forGetter(dqh::d)
            )
            .apply($$0, dqh::new)
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

   public he<dug> d() {
      return this.e;
   }
}
