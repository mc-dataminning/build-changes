import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfz(alz e, jq<cxl> f, xv g, boolean h) {
   public static final Codec<dfz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alz.a.fieldOf("asset_id").forGetter(dfz::a),
               cxl.e.fieldOf("template_item").forGetter(dfz::b),
               xx.a.fieldOf("description").forGetter(dfz::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dfz::d)
            )
            .apply($$0, dfz::new)
   );
   public static final zt<xg, dfz> b = zt.a(alz.b, dfz::a, zr.b(mb.K), dfz::b, xx.b, dfz::c, zr.b, dfz::d, dfz::new);
   public static final Codec<jq<dfz>> c = alv.a(mb.ba, a);
   public static final zt<xg, jq<dfz>> d = zr.a(mb.ba, b);

   public xv a(jq<dfx> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alz a() {
      return this.e;
   }

   public jq<cxl> b() {
      return this.f;
   }

   public xv c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
