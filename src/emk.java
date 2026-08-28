import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emk(int b, int c, int d, jf<eqm> e) implements elx {
   public static final Codec<emk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.m.fieldOf("tries").orElse(128).forGetter(emk::a),
               ayu.l.fieldOf("xz_spread").orElse(7).forGetter(emk::b),
               ayu.l.fieldOf("y_spread").orElse(3).forGetter(emk::c),
               eqm.b.fieldOf("feature").forGetter(emk::d)
            )
            .apply($$0, emk::new)
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

   public jf<eqm> d() {
      return this.e;
   }
}
