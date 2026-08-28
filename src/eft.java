import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eft(int b, int c, int d, jn<ejs> e) implements efg {
   public static final Codec<eft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayl.l.fieldOf("tries").orElse(128).forGetter(eft::a),
               ayl.k.fieldOf("xz_spread").orElse(7).forGetter(eft::b),
               ayl.k.fieldOf("y_spread").orElse(3).forGetter(eft::c),
               ejs.b.fieldOf("feature").forGetter(eft::d)
            )
            .apply($$0, eft::new)
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

   public jn<ejs> d() {
      return this.e;
   }
}
