import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edr(int b, int c, int d, ji<ehq> e) implements ede {
   public static final Codec<edr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.l.fieldOf("tries").orElse(128).forGetter(edr::a),
               ayh.k.fieldOf("xz_spread").orElse(7).forGetter(edr::b),
               ayh.k.fieldOf("y_spread").orElse(3).forGetter(edr::c),
               ehq.b.fieldOf("feature").forGetter(edr::d)
            )
            .apply($$0, edr::new)
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

   public ji<ehq> d() {
      return this.e;
   }
}
