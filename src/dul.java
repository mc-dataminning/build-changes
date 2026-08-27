import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dul(int b, int c, int d, ih<dyk> e) implements dty {
   public static final Codec<dul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atw.j.fieldOf("tries").orElse(128).forGetter(dul::a),
               atw.i.fieldOf("xz_spread").orElse(7).forGetter(dul::b),
               atw.i.fieldOf("y_spread").orElse(3).forGetter(dul::c),
               dyk.b.fieldOf("feature").forGetter(dul::d)
            )
            .apply($$0, dul::new)
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

   public ih<dyk> d() {
      return this.e;
   }
}
