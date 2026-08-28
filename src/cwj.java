import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwj(akk e, jj<ctx> f, wu g, boolean h) {
   public static final Codec<cwj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akk.a.fieldOf("asset_id").forGetter(cwj::a),
               akh.a(lr.K).fieldOf("template_item").forGetter(cwj::b),
               ww.a.fieldOf("description").forGetter(cwj::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwj::d)
            )
            .apply($$0, cwj::new)
   );
   public static final ys<wf, cwj> b = ys.a(akk.b, cwj::a, yq.b(lr.K), cwj::b, ww.b, cwj::c, yq.b, cwj::d, cwj::new);
   public static final Codec<jj<cwj>> c = akg.a(lr.aW, a);
   public static final ys<wf, jj<cwj>> d = yq.a(lr.aW, b);

   public wu a(jj<cwh> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akk a() {
      return this.e;
   }

   public jj<ctx> b() {
      return this.f;
   }

   public wu c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
