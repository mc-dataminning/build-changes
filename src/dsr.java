import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsr(int b, int c, int d, ig<dwq> e) implements dse {
   public static final Codec<dsr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asy.j.fieldOf("tries").orElse(128).forGetter(dsr::a),
               asy.i.fieldOf("xz_spread").orElse(7).forGetter(dsr::b),
               asy.i.fieldOf("y_spread").orElse(3).forGetter(dsr::c),
               dwq.b.fieldOf("feature").forGetter(dsr::d)
            )
            .apply($$0, dsr::new)
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

   public ig<dwq> d() {
      return this.e;
   }
}
