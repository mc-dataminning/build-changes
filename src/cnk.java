import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cnk(int e, int f, alg g, Optional<wy> h, Optional<wy> i) {
   public static final Codec<cnk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.a(1, 16).fieldOf("width").forGetter(cnk::b),
               ayu.a(1, 16).fieldOf("height").forGetter(cnk::c),
               alg.a.fieldOf("asset_id").forGetter(cnk::d),
               xa.a.optionalFieldOf("title").forGetter(cnk::e),
               xa.a.optionalFieldOf("author").forGetter(cnk::f)
            )
            .apply($$0, cnk::new)
   );
   public static final yw<wj, cnk> b = yw.a(yu.h, cnk::b, yu.h, cnk::c, alg.b, cnk::d, xa.e, cnk::e, xa.e, cnk::f, cnk::new);
   public static final Codec<jf<cnk>> c = alc.a(mh.aZ, a);
   public static final yw<wj, jf<cnk>> d = yu.a(mh.aZ, b);

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
