import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwr(alb e, ji<cuf> f, xl g, boolean h) {
   public static final Codec<cwr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alb.a.fieldOf("asset_id").forGetter(cwr::a),
               aky.a(lq.G).fieldOf("template_item").forGetter(cwr::b),
               xn.a.fieldOf("description").forGetter(cwr::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwr::d)
            )
            .apply($$0, cwr::new)
   );
   public static final zj<ww, cwr> b = zj.a(alb.b, cwr::a, zh.b(lq.G), cwr::b, xn.b, cwr::c, zh.b, cwr::d, cwr::new);
   public static final Codec<ji<cwr>> c = akx.a(lq.aP, a);
   public static final zj<ww, ji<cwr>> d = zh.a(lq.aP, b);

   public xl a(ji<cwp> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alb a() {
      return this.e;
   }

   public ji<cuf> b() {
      return this.f;
   }

   public xl c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
