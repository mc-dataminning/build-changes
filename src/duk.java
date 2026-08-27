import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duk(int b, int c, int d, ih<dyj> e) implements dtx {
   public static final Codec<duk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atv.j.fieldOf("tries").orElse(128).forGetter(duk::a),
               atv.i.fieldOf("xz_spread").orElse(7).forGetter(duk::b),
               atv.i.fieldOf("y_spread").orElse(3).forGetter(duk::c),
               dyj.b.fieldOf("feature").forGetter(duk::d)
            )
            .apply($$0, duk::new)
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

   public ih<dyj> d() {
      return this.e;
   }
}
