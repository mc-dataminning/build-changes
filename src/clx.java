import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record clx(int e, int f, alz g, Optional<xv> h, Optional<xv> i) {
   public static final Codec<clx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.a(1, 16).fieldOf("width").forGetter(clx::b),
               azn.a(1, 16).fieldOf("height").forGetter(clx::c),
               alz.a.fieldOf("asset_id").forGetter(clx::d),
               xx.a.optionalFieldOf("title").forGetter(clx::e),
               xx.a.optionalFieldOf("author").forGetter(clx::f)
            )
            .apply($$0, clx::new)
   );
   public static final zt<xg, clx> b = zt.a(zr.h, clx::b, zr.h, clx::c, alz.b, clx::d, xx.e, clx::e, xx.e, clx::f, clx::new);
   public static final Codec<jq<clx>> c = alv.a(mb.X, a);
   public static final zt<xg, jq<clx>> d = zr.a(mb.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public alz d() {
      return this.g;
   }

   public Optional<xv> e() {
      return this.h;
   }

   public Optional<xv> f() {
      return this.i;
   }
}
