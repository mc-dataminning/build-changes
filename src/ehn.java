import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehn(int b, int c, int d, jq<elm> e) implements eha {
   public static final Codec<ehn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.m.fieldOf("tries").orElse(128).forGetter(ehn::a),
               ayv.l.fieldOf("xz_spread").orElse(7).forGetter(ehn::b),
               ayv.l.fieldOf("y_spread").orElse(3).forGetter(ehn::c),
               elm.b.fieldOf("feature").forGetter(ehn::d)
            )
            .apply($$0, ehn::new)
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

   public jq<elm> d() {
      return this.e;
   }
}
