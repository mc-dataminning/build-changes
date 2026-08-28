import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfr(alz e, jq<cxg> f, xv g, boolean h) {
   public static final Codec<dfr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alz.a.fieldOf("asset_id").forGetter(dfr::a),
               alw.a(mb.K).fieldOf("template_item").forGetter(dfr::b),
               xx.a.fieldOf("description").forGetter(dfr::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dfr::d)
            )
            .apply($$0, dfr::new)
   );
   public static final zt<xg, dfr> b = zt.a(alz.b, dfr::a, zr.b(mb.K), dfr::b, xx.b, dfr::c, zr.b, dfr::d, dfr::new);
   public static final Codec<jq<dfr>> c = alv.a(mb.aZ, a);
   public static final zt<xg, jq<dfr>> d = zr.a(mb.aZ, b);

   public xv a(jq<dfp> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alz a() {
      return this.e;
   }

   public jq<cxg> b() {
      return this.f;
   }

   public xv c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
