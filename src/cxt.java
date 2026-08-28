import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxt(alb e, jn<cvg> f, xd g, boolean h) {
   public static final Codec<cxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alb.a.fieldOf("asset_id").forGetter(cxt::a),
               aky.a(lv.K).fieldOf("template_item").forGetter(cxt::b),
               xf.a.fieldOf("description").forGetter(cxt::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cxt::d)
            )
            .apply($$0, cxt::new)
   );
   public static final zb<wo, cxt> b = zb.a(alb.b, cxt::a, yz.b(lv.K), cxt::b, xf.b, cxt::c, yz.b, cxt::d, cxt::new);
   public static final Codec<jn<cxt>> c = akx.a(lv.aX, a);
   public static final zb<wo, jn<cxt>> d = yz.a(lv.aX, b);

   public xd a(jn<cxr> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alb a() {
      return this.e;
   }

   public jn<cvg> b() {
      return this.f;
   }

   public xd c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
