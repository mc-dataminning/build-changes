import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record clw(int e, int f, alz g, Optional<xv> h, Optional<xv> i) {
   public static final Codec<clw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.a(1, 16).fieldOf("width").forGetter(clw::b),
               azn.a(1, 16).fieldOf("height").forGetter(clw::c),
               alz.a.fieldOf("asset_id").forGetter(clw::d),
               xx.a.optionalFieldOf("title").forGetter(clw::e),
               xx.a.optionalFieldOf("author").forGetter(clw::f)
            )
            .apply($$0, clw::new)
   );
   public static final zt<xg, clw> b = zt.a(zr.h, clw::b, zr.h, clw::c, alz.b, clw::d, xx.e, clw::e, xx.e, clw::f, clw::new);
   public static final Codec<jq<clw>> c = alv.a(mb.X, a);
   public static final zt<xg, jq<clw>> d = zr.a(mb.X, b);

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
