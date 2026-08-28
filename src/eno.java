import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eno(int b, int c, int d, jg<err> e) implements enb {
   public static final Codec<eno> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.m.fieldOf("tries").orElse(128).forGetter(eno::a),
               azg.l.fieldOf("xz_spread").orElse(7).forGetter(eno::b),
               azg.l.fieldOf("y_spread").orElse(3).forGetter(eno::c),
               err.b.fieldOf("feature").forGetter(eno::d)
            )
            .apply($$0, eno::new)
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

   public jg<err> d() {
      return this.e;
   }
}
