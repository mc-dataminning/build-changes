import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejf(int b, int c, int d, jq<eng> e) implements eis {
   public static final Codec<ejf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.m.fieldOf("tries").orElse(128).forGetter(ejf::a),
               azn.l.fieldOf("xz_spread").orElse(7).forGetter(ejf::b),
               azn.l.fieldOf("y_spread").orElse(3).forGetter(ejf::c),
               eng.b.fieldOf("feature").forGetter(ejf::d)
            )
            .apply($$0, ejf::new)
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

   public jq<eng> d() {
      return this.e;
   }
}
