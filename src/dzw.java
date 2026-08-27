import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzw(eci b, dvy c, bnf d, int e) implements dzz {
   public static final Codec<dzw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eci.a.fieldOf("state_provider").forGetter(dzw::a),
               dvy.b.fieldOf("target").forGetter(dzw::b),
               bnf.b(0, 8).fieldOf("radius").forGetter(dzw::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dzw::d)
            )
            .apply($$0, dzw::new)
   );

   public eci a() {
      return this.b;
   }

   public dvy b() {
      return this.c;
   }

   public bnf c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
