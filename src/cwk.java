import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwk(akk e, jj<cty> f, wu g, boolean h) {
   public static final Codec<cwk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akk.a.fieldOf("asset_id").forGetter(cwk::a),
               akh.a(lr.K).fieldOf("template_item").forGetter(cwk::b),
               ww.a.fieldOf("description").forGetter(cwk::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwk::d)
            )
            .apply($$0, cwk::new)
   );
   public static final ys<wf, cwk> b = ys.a(akk.b, cwk::a, yq.b(lr.K), cwk::b, ww.b, cwk::c, yq.b, cwk::d, cwk::new);
   public static final Codec<jj<cwk>> c = akg.a(lr.aW, a);
   public static final ys<wf, jj<cwk>> d = yq.a(lr.aW, b);

   public wu a(jj<cwi> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akk a() {
      return this.e;
   }

   public jj<cty> b() {
      return this.f;
   }

   public wu c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
