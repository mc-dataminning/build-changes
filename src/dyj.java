import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyj(int b, int c, int d, il<eci> e) implements dxw {
   public static final Codec<dyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.k.fieldOf("tries").orElse(128).forGetter(dyj::a),
               awe.j.fieldOf("xz_spread").orElse(7).forGetter(dyj::b),
               awe.j.fieldOf("y_spread").orElse(3).forGetter(dyj::c),
               eci.b.fieldOf("feature").forGetter(dyj::d)
            )
            .apply($$0, dyj::new)
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

   public il<eci> d() {
      return this.e;
   }
}
