import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elk(int b, int c, int d, je<epm> e) implements ekx {
   public static final Codec<elk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.m.fieldOf("tries").orElse(128).forGetter(elk::a),
               ays.l.fieldOf("xz_spread").orElse(7).forGetter(elk::b),
               ays.l.fieldOf("y_spread").orElse(3).forGetter(elk::c),
               epm.b.fieldOf("feature").forGetter(elk::d)
            )
            .apply($$0, elk::new)
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

   public je<epm> d() {
      return this.e;
   }
}
