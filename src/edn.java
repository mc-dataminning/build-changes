import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edn(int b, int c, int d, ji<ehm> e) implements eda {
   public static final Codec<edn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayf.l.fieldOf("tries").orElse(128).forGetter(edn::a),
               ayf.k.fieldOf("xz_spread").orElse(7).forGetter(edn::b),
               ayf.k.fieldOf("y_spread").orElse(3).forGetter(edn::c),
               ehm.b.fieldOf("feature").forGetter(edn::d)
            )
            .apply($$0, edn::new)
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

   public ji<ehm> d() {
      return this.e;
   }
}
