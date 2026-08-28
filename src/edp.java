import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edp(int b, int c, int d, ji<eho> e) implements edc {
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.l.fieldOf("tries").orElse(128).forGetter(edp::a),
               ayh.k.fieldOf("xz_spread").orElse(7).forGetter(edp::b),
               ayh.k.fieldOf("y_spread").orElse(3).forGetter(edp::c),
               eho.b.fieldOf("feature").forGetter(edp::d)
            )
            .apply($$0, edp::new)
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

   public ji<eho> d() {
      return this.e;
   }
}
