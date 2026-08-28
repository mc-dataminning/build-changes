import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eki(int b, int c, int d, js<eok> e) implements ejv {
   public static final Codec<eki> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.m.fieldOf("tries").orElse(128).forGetter(eki::a),
               ays.l.fieldOf("xz_spread").orElse(7).forGetter(eki::b),
               ays.l.fieldOf("y_spread").orElse(3).forGetter(eki::c),
               eok.b.fieldOf("feature").forGetter(eki::d)
            )
            .apply($$0, eki::new)
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

   public js<eok> d() {
      return this.e;
   }
}
