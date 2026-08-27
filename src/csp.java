import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csp(ajh c, il<cqf> d, vu e, boolean f) {
   public static final Codec<csp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajh.a.fieldOf("asset_id").forGetter(csp::a),
               aje.a(kj.F).fieldOf("template_item").forGetter(csp::b),
               vw.a.fieldOf("description").forGetter(csp::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(csp::d)
            )
            .apply($$0, csp::new)
   );
   public static final Codec<il<csp>> b = ajd.a(kj.aK, a);

   public vu a(il<csn> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public ajh a() {
      return this.c;
   }

   public il<cqf> b() {
      return this.d;
   }

   public vu c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
