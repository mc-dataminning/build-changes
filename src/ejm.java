import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejm(int b, int c, int d, jq<enn> e) implements eiz {
   public static final Codec<ejm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.m.fieldOf("tries").orElse(128).forGetter(ejm::a),
               azn.l.fieldOf("xz_spread").orElse(7).forGetter(ejm::b),
               azn.l.fieldOf("y_spread").orElse(3).forGetter(ejm::c),
               enn.b.fieldOf("feature").forGetter(ejm::d)
            )
            .apply($$0, ejm::new)
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

   public jq<enn> d() {
      return this.e;
   }
}
