import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cky(int e, int f, alj g, Optional<xj> h, Optional<xj> i) {
   public static final Codec<cky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.a(1, 16).fieldOf("width").forGetter(cky::b),
               ayv.a(1, 16).fieldOf("height").forGetter(cky::c),
               alj.a.fieldOf("asset_id").forGetter(cky::d),
               xl.a.optionalFieldOf("title").forGetter(cky::e),
               xl.a.optionalFieldOf("author").forGetter(cky::f)
            )
            .apply($$0, cky::new)
   );
   public static final zh<wu, cky> b = zh.a(zf.h, cky::b, zf.h, cky::c, alj.b, cky::d, xl.e, cky::e, xl.e, cky::f, cky::new);
   public static final Codec<jq<cky>> c = alf.a(ma.X, a);
   public static final zh<wu, jq<cky>> d = zf.a(ma.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public alj d() {
      return this.g;
   }

   public Optional<xj> e() {
      return this.h;
   }

   public Optional<xj> f() {
      return this.i;
   }
}
