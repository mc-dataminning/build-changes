import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejg(int b, int c, int d, jq<enh> e) implements eit {
   public static final Codec<ejg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azd.m.fieldOf("tries").orElse(128).forGetter(ejg::a),
               azd.l.fieldOf("xz_spread").orElse(7).forGetter(ejg::b),
               azd.l.fieldOf("y_spread").orElse(3).forGetter(ejg::c),
               enh.b.fieldOf("feature").forGetter(ejg::d)
            )
            .apply($$0, ejg::new)
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

   public jq<enh> d() {
      return this.e;
   }
}
