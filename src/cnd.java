import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cnd(int e, int f, alg g, Optional<wy> h, Optional<wy> i) {
   public static final Codec<cnd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.a(1, 16).fieldOf("width").forGetter(cnd::b),
               ayu.a(1, 16).fieldOf("height").forGetter(cnd::c),
               alg.a.fieldOf("asset_id").forGetter(cnd::d),
               xa.a.optionalFieldOf("title").forGetter(cnd::e),
               xa.a.optionalFieldOf("author").forGetter(cnd::f)
            )
            .apply($$0, cnd::new)
   );
   public static final yw<wj, cnd> b = yw.a(yu.h, cnd::b, yu.h, cnd::c, alg.b, cnd::d, xa.e, cnd::e, xa.e, cnd::f, cnd::new);
   public static final Codec<je<cnd>> c = alc.a(mg.aZ, a);
   public static final yw<wj, je<cnd>> d = yu.a(mg.aZ, b);

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
