import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwy(akq e, jm<cuj> f, wy g, boolean h) {
   public static final Codec<cwy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akq.a.fieldOf("asset_id").forGetter(cwy::a),
               akn.a(lu.K).fieldOf("template_item").forGetter(cwy::b),
               xa.a.fieldOf("description").forGetter(cwy::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwy::d)
            )
            .apply($$0, cwy::new)
   );
   public static final yw<wj, cwy> b = yw.a(akq.b, cwy::a, yu.b(lu.K), cwy::b, xa.b, cwy::c, yu.b, cwy::d, cwy::new);
   public static final Codec<jm<cwy>> c = akm.a(lu.aX, a);
   public static final yw<wj, jm<cwy>> d = yu.a(lu.aX, b);

   public wy a(jm<cww> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akq a() {
      return this.e;
   }

   public jm<cuj> b() {
      return this.f;
   }

   public wy c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
