import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwq(int b, int c, int d, ij<eap> e) implements dwd {
   public static final Codec<dwq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avq.j.fieldOf("tries").orElse(128).forGetter(dwq::a),
               avq.i.fieldOf("xz_spread").orElse(7).forGetter(dwq::b),
               avq.i.fieldOf("y_spread").orElse(3).forGetter(dwq::c),
               eap.b.fieldOf("feature").forGetter(dwq::d)
            )
            .apply($$0, dwq::new)
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

   public ij<eap> d() {
      return this.e;
   }
}
