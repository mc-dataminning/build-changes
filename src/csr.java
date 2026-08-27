import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csr(ajh c, il<cqh> d, vu e, boolean f) {
   public static final Codec<csr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajh.a.fieldOf("asset_id").forGetter(csr::a),
               aje.a(kj.F).fieldOf("template_item").forGetter(csr::b),
               vw.a.fieldOf("description").forGetter(csr::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(csr::d)
            )
            .apply($$0, csr::new)
   );
   public static final Codec<il<csr>> b = ajd.a(kj.aK, a);

   public vu a(il<csp> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public ajh a() {
      return this.c;
   }

   public il<cqh> b() {
      return this.d;
   }

   public vu c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
