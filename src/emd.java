import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emd(int b, int c, int d, je<eqf> e) implements elq {
   public static final Codec<emd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.m.fieldOf("tries").orElse(128).forGetter(emd::a),
               ayu.l.fieldOf("xz_spread").orElse(7).forGetter(emd::b),
               ayu.l.fieldOf("y_spread").orElse(3).forGetter(emd::c),
               eqf.b.fieldOf("feature").forGetter(emd::d)
            )
            .apply($$0, emd::new)
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

   public je<eqf> d() {
      return this.e;
   }
}
