import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctw(ajv e, in<crn> f, wi g, boolean h) {
   public static final Codec<ctw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajv.a.fieldOf("asset_id").forGetter(ctw::a),
               ajs.a(ku.G).fieldOf("template_item").forGetter(ctw::b),
               wk.a.fieldOf("description").forGetter(ctw::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(ctw::d)
            )
            .apply($$0, ctw::new)
   );
   public static final yg<vt, ctw> b = yg.a(ajv.b, ctw::a, ye.b(ku.G), ctw::b, wk.b, ctw::c, ye.b, ctw::d, ctw::new);
   public static final Codec<in<ctw>> c = ajr.a(ku.aM, a);
   public static final yg<vt, in<ctw>> d = ye.a(ku.aM, b);

   public wi a(in<ctu> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public ajv a() {
      return this.e;
   }

   public in<crn> b() {
      return this.f;
   }

   public wi c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
