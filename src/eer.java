import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eer(int b, int c, int d, jm<eiq> e) implements eee {
   public static final Codec<eer> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axv.l.fieldOf("tries").orElse(128).forGetter(eer::a),
               axv.k.fieldOf("xz_spread").orElse(7).forGetter(eer::b),
               axv.k.fieldOf("y_spread").orElse(3).forGetter(eer::c),
               eiq.b.fieldOf("feature").forGetter(eer::d)
            )
            .apply($$0, eer::new)
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

   public jm<eiq> d() {
      return this.e;
   }
}
