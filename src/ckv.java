import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ckv(int e, int f, all g, Optional<xl> h, Optional<xl> i) {
   public static final Codec<ckv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.a(1, 16).fieldOf("width").forGetter(ckv::b),
               ayw.a(1, 16).fieldOf("height").forGetter(ckv::c),
               all.a.fieldOf("asset_id").forGetter(ckv::d),
               xn.a.optionalFieldOf("title").forGetter(ckv::e),
               xn.a.optionalFieldOf("author").forGetter(ckv::f)
            )
            .apply($$0, ckv::new)
   );
   public static final zj<ww, ckv> b = zj.a(zh.h, ckv::b, zh.h, ckv::c, all.b, ckv::d, xn.e, ckv::e, xn.e, ckv::f, ckv::new);
   public static final Codec<jq<ckv>> c = alh.a(ma.X, a);
   public static final zj<ww, jq<ckv>> d = zh.a(ma.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public all d() {
      return this.g;
   }

   public Optional<xl> e() {
      return this.h;
   }

   public Optional<xl> f() {
      return this.i;
   }
}
