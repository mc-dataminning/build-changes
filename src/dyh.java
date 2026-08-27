import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyh(int b, int c, int d, il<ecg> e) implements dxu {
   public static final Codec<dyh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.k.fieldOf("tries").orElse(128).forGetter(dyh::a),
               awe.j.fieldOf("xz_spread").orElse(7).forGetter(dyh::b),
               awe.j.fieldOf("y_spread").orElse(3).forGetter(dyh::c),
               ecg.b.fieldOf("feature").forGetter(dyh::d)
            )
            .apply($$0, dyh::new)
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

   public il<ecg> d() {
      return this.e;
   }
}
