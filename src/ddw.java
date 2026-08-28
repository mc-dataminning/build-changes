import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddw(all e, jq<cwb> f, xl g, boolean h) {
   public static final Codec<ddw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               all.a.fieldOf("asset_id").forGetter(ddw::a),
               ali.a(ma.K).fieldOf("template_item").forGetter(ddw::b),
               xn.a.fieldOf("description").forGetter(ddw::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(ddw::d)
            )
            .apply($$0, ddw::new)
   );
   public static final zj<ww, ddw> b = zj.a(all.b, ddw::a, zh.b(ma.K), ddw::b, xn.b, ddw::c, zh.b, ddw::d, ddw::new);
   public static final Codec<jq<ddw>> c = alh.a(ma.aY, a);
   public static final zj<ww, jq<ddw>> d = zh.a(ma.aY, b);

   public xl a(jq<ddu> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public all a() {
      return this.e;
   }

   public jq<cwb> b() {
      return this.f;
   }

   public xl c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
