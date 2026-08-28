import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwh(akk e, jj<ctv> f, wu g, boolean h) {
   public static final Codec<cwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akk.a.fieldOf("asset_id").forGetter(cwh::a),
               akh.a(lr.K).fieldOf("template_item").forGetter(cwh::b),
               ww.a.fieldOf("description").forGetter(cwh::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwh::d)
            )
            .apply($$0, cwh::new)
   );
   public static final ys<wf, cwh> b = ys.a(akk.b, cwh::a, yq.b(lr.K), cwh::b, ww.b, cwh::c, yq.b, cwh::d, cwh::new);
   public static final Codec<jj<cwh>> c = akg.a(lr.aW, a);
   public static final ys<wf, jj<cwh>> d = yq.a(lr.aW, b);

   public wu a(jj<cwf> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akk a() {
      return this.e;
   }

   public jj<ctv> b() {
      return this.f;
   }

   public wu c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
