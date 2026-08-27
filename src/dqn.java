import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqn(int b, int c, int d, hg<dum> e) implements dqa {
   public static final Codec<dqn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arg.j.fieldOf("tries").orElse(128).forGetter(dqn::a),
               arg.i.fieldOf("xz_spread").orElse(7).forGetter(dqn::b),
               arg.i.fieldOf("y_spread").orElse(3).forGetter(dqn::c),
               dum.b.fieldOf("feature").forGetter(dqn::d)
            )
            .apply($$0, dqn::new)
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

   public hg<dum> d() {
      return this.e;
   }
}
