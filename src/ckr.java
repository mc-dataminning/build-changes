import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ckr(int e, int f, ali g, Optional<xi> h, Optional<xi> i) {
   public static final Codec<ckr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.a(1, 16).fieldOf("width").forGetter(ckr::b),
               ayt.a(1, 16).fieldOf("height").forGetter(ckr::c),
               ali.a.fieldOf("asset_id").forGetter(ckr::d),
               xk.a.optionalFieldOf("title").forGetter(ckr::e),
               xk.a.optionalFieldOf("author").forGetter(ckr::f)
            )
            .apply($$0, ckr::new)
   );
   public static final zg<wt, ckr> b = zg.a(ze.h, ckr::b, ze.h, ckr::c, ali.b, ckr::d, xk.e, ckr::e, xk.e, ckr::f, ckr::new);
   public static final Codec<jq<ckr>> c = ale.a(lz.X, a);
   public static final zg<wt, jq<ckr>> d = ze.a(lz.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public ali d() {
      return this.g;
   }

   public Optional<xi> e() {
      return this.h;
   }

   public Optional<xi> f() {
      return this.i;
   }
}
