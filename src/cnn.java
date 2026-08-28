import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cnn(int e, int f, alg g, Optional<wy> h, Optional<wy> i) {
   public static final Codec<cnn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.a(1, 16).fieldOf("width").forGetter(cnn::b),
               ayu.a(1, 16).fieldOf("height").forGetter(cnn::c),
               alg.a.fieldOf("asset_id").forGetter(cnn::d),
               xa.a.optionalFieldOf("title").forGetter(cnn::e),
               xa.a.optionalFieldOf("author").forGetter(cnn::f)
            )
            .apply($$0, cnn::new)
   );
   public static final yw<wj, cnn> b = yw.a(yu.h, cnn::b, yu.h, cnn::c, alg.b, cnn::d, xa.e, cnn::e, xa.e, cnn::f, cnn::new);
   public static final Codec<jf<cnn>> c = alc.a(mh.aZ, a);
   public static final yw<wj, jf<cnn>> d = yu.a(mh.aZ, b);

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
