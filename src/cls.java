import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cls(int e, int f, alz g, Optional<xv> h, Optional<xv> i) {
   public static final Codec<cls> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.a(1, 16).fieldOf("width").forGetter(cls::b),
               azn.a(1, 16).fieldOf("height").forGetter(cls::c),
               alz.a.fieldOf("asset_id").forGetter(cls::d),
               xx.a.optionalFieldOf("title").forGetter(cls::e),
               xx.a.optionalFieldOf("author").forGetter(cls::f)
            )
            .apply($$0, cls::new)
   );
   public static final zt<xg, cls> b = zt.a(zr.h, cls::b, zr.h, cls::c, alz.b, cls::d, xx.e, cls::e, xx.e, cls::f, cls::new);
   public static final Codec<jq<cls>> c = alv.a(mb.X, a);
   public static final zt<xg, jq<cls>> d = zr.a(mb.X, b);

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
