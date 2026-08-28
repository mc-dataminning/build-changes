import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cjv(int e, int f, alb g, Optional<xd> h, Optional<xd> i) {
   public static final Codec<cjv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayl.a(1, 16).fieldOf("width").forGetter(cjv::b),
               ayl.a(1, 16).fieldOf("height").forGetter(cjv::c),
               alb.a.fieldOf("asset_id").forGetter(cjv::d),
               xf.a.optionalFieldOf("title").forGetter(cjv::e),
               xf.a.optionalFieldOf("author").forGetter(cjv::f)
            )
            .apply($$0, cjv::new)
   );
   public static final zb<wo, cjv> b = zb.a(yz.g, cjv::b, yz.g, cjv::c, alb.b, cjv::d, xf.e, cjv::e, xf.e, cjv::f, cjv::new);
   public static final Codec<jn<cjv>> c = akx.a(lv.X, a);
   public static final zb<wo, jn<cjv>> d = yz.a(lv.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public alb d() {
      return this.g;
   }

   public Optional<xd> e() {
      return this.h;
   }

   public Optional<xd> f() {
      return this.i;
   }
}
