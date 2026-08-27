import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqi(int b, int c, int d, hg<duh> e) implements dpv {
   public static final Codec<dqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.j.fieldOf("tries").orElse(128).forGetter(dqi::a),
               arb.i.fieldOf("xz_spread").orElse(7).forGetter(dqi::b),
               arb.i.fieldOf("y_spread").orElse(3).forGetter(dqi::c),
               duh.b.fieldOf("feature").forGetter(dqi::d)
            )
            .apply($$0, dqi::new)
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

   public hg<duh> d() {
      return this.e;
   }
}
