import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cve(akh e, iw<csu> f, wu g, boolean h) {
   public static final Codec<cve> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akh.a.fieldOf("asset_id").forGetter(cve::a),
               ake.a(le.G).fieldOf("template_item").forGetter(cve::b),
               ww.a.fieldOf("description").forGetter(cve::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cve::d)
            )
            .apply($$0, cve::new)
   );
   public static final ys<wf, cve> b = ys.a(akh.b, cve::a, yq.b(le.G), cve::b, ww.b, cve::c, yq.b, cve::d, cve::new);
   public static final Codec<iw<cve>> c = akd.a(le.aP, a);
   public static final ys<wf, iw<cve>> d = yq.a(le.aP, b);

   public wu a(iw<cvc> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akh a() {
      return this.e;
   }

   public iw<csu> b() {
      return this.f;
   }

   public wu c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
