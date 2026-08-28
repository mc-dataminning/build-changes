import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxa(akr e, jm<cul> f, wz g, boolean h) {
   public static final Codec<cxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akr.a.fieldOf("asset_id").forGetter(cxa::a),
               ako.a(lu.K).fieldOf("template_item").forGetter(cxa::b),
               xb.a.fieldOf("description").forGetter(cxa::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cxa::d)
            )
            .apply($$0, cxa::new)
   );
   public static final yx<wk, cxa> b = yx.a(akr.b, cxa::a, yv.b(lu.K), cxa::b, xb.b, cxa::c, yv.b, cxa::d, cxa::new);
   public static final Codec<jm<cxa>> c = akn.a(lu.aX, a);
   public static final yx<wk, jm<cxa>> d = yv.a(lu.aX, b);

   public wz a(jm<cwy> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akr a() {
      return this.e;
   }

   public jm<cul> b() {
      return this.f;
   }

   public wz c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
