import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eec(int b, int c, int d, jj<eib> e) implements edp {
   public static final Codec<eec> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.l.fieldOf("tries").orElse(128).forGetter(eec::a),
               axo.k.fieldOf("xz_spread").orElse(7).forGetter(eec::b),
               axo.k.fieldOf("y_spread").orElse(3).forGetter(eec::c),
               eib.b.fieldOf("feature").forGetter(eec::d)
            )
            .apply($$0, eec::new)
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

   public jj<eib> d() {
      return this.e;
   }
}
