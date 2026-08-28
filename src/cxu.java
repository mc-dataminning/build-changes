import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxu(alc e, jn<cvk> f, xd g, boolean h) {
   public static final Codec<cxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alc.a.fieldOf("asset_id").forGetter(cxu::a),
               akz.a(lv.K).fieldOf("template_item").forGetter(cxu::b),
               xf.a.fieldOf("description").forGetter(cxu::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cxu::d)
            )
            .apply($$0, cxu::new)
   );
   public static final zb<wo, cxu> b = zb.a(alc.b, cxu::a, yz.b(lv.K), cxu::b, xf.b, cxu::c, yz.b, cxu::d, cxu::new);
   public static final Codec<jn<cxu>> c = aky.a(lv.aY, a);
   public static final zb<wo, jn<cxu>> d = yz.a(lv.aY, b);

   public xd a(jn<cxs> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alc a() {
      return this.e;
   }

   public jn<cvk> b() {
      return this.f;
   }

   public xd c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
