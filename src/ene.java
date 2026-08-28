import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ene(int b, int c, int d, jg<erh> e) implements emr {
   public static final Codec<ene> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.m.fieldOf("tries").orElse(128).forGetter(ene::a),
               ayy.l.fieldOf("xz_spread").orElse(7).forGetter(ene::b),
               ayy.l.fieldOf("y_spread").orElse(3).forGetter(ene::c),
               erh.b.fieldOf("feature").forGetter(ene::d)
            )
            .apply($$0, ene::new)
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

   public jg<erh> d() {
      return this.e;
   }
}
