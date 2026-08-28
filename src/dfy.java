import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfy(alz e, jq<cxk> f, xv g, boolean h) {
   public static final Codec<dfy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alz.a.fieldOf("asset_id").forGetter(dfy::a),
               alw.a(mb.K).fieldOf("template_item").forGetter(dfy::b),
               xx.a.fieldOf("description").forGetter(dfy::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dfy::d)
            )
            .apply($$0, dfy::new)
   );
   public static final zt<xg, dfy> b = zt.a(alz.b, dfy::a, zr.b(mb.K), dfy::b, xx.b, dfy::c, zr.b, dfy::d, dfy::new);
   public static final Codec<jq<dfy>> c = alv.a(mb.ba, a);
   public static final zt<xg, jq<dfy>> d = zr.a(mb.ba, b);

   public xv a(jq<dfw> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alz a() {
      return this.e;
   }

   public jq<cxk> b() {
      return this.f;
   }

   public xv c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
