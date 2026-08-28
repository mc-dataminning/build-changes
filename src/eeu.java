import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeu(int b, int c, int d, jm<eit> e) implements eeh {
   public static final Codec<eeu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.l.fieldOf("tries").orElse(128).forGetter(eeu::a),
               axw.k.fieldOf("xz_spread").orElse(7).forGetter(eeu::b),
               axw.k.fieldOf("y_spread").orElse(3).forGetter(eeu::c),
               eit.b.fieldOf("feature").forGetter(eeu::d)
            )
            .apply($$0, eeu::new)
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

   public jm<eit> d() {
      return this.e;
   }
}
