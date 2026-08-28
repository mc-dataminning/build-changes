import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cmz(int e, int f, alg g, Optional<wy> h, Optional<wy> i) {
   public static final Codec<cmz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.a(1, 16).fieldOf("width").forGetter(cmz::b),
               ayu.a(1, 16).fieldOf("height").forGetter(cmz::c),
               alg.a.fieldOf("asset_id").forGetter(cmz::d),
               xa.a.optionalFieldOf("title").forGetter(cmz::e),
               xa.a.optionalFieldOf("author").forGetter(cmz::f)
            )
            .apply($$0, cmz::new)
   );
   public static final yw<wj, cmz> b = yw.a(yu.h, cmz::b, yu.h, cmz::c, alg.b, cmz::d, xa.e, cmz::e, xa.e, cmz::f, cmz::new);
   public static final Codec<je<cmz>> c = alc.a(mg.aY, a);
   public static final yw<wj, je<cmz>> d = yu.a(mg.aY, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public alg d() {
      return this.g;
   }

   public Optional<wy> e() {
      return this.h;
   }

   public Optional<wy> f() {
      return this.i;
   }
}
