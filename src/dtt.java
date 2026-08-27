import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtt(int b, int c, int d, ie<dxs> e) implements dtg {
   public static final Codec<dtt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.j.fieldOf("tries").orElse(128).forGetter(dtt::a),
               atg.i.fieldOf("xz_spread").orElse(7).forGetter(dtt::b),
               atg.i.fieldOf("y_spread").orElse(3).forGetter(dtt::c),
               dxs.b.fieldOf("feature").forGetter(dtt::d)
            )
            .apply($$0, dtt::new)
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

   public ie<dxs> d() {
      return this.e;
   }
}
