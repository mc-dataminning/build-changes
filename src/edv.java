import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edv(int b, int c, int d, jj<ehu> e) implements edi {
   public static final Codec<edv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.l.fieldOf("tries").orElse(128).forGetter(edv::a),
               axm.k.fieldOf("xz_spread").orElse(7).forGetter(edv::b),
               axm.k.fieldOf("y_spread").orElse(3).forGetter(edv::c),
               ehu.b.fieldOf("feature").forGetter(edv::d)
            )
            .apply($$0, edv::new)
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

   public jj<ehu> d() {
      return this.e;
   }
}
