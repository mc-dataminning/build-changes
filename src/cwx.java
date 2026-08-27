import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwx(akt e, ja<cuc> f, xe g, boolean h) {
   public static final Codec<cwx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akt.a.fieldOf("asset_id").forGetter(cwx::a),
               akq.a(li.G).fieldOf("template_item").forGetter(cwx::b),
               xg.a.fieldOf("description").forGetter(cwx::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwx::d)
            )
            .apply($$0, cwx::new)
   );
   public static final zc<wp, cwx> b = zc.a(akt.b, cwx::a, za.b(li.G), cwx::b, xg.b, cwx::c, za.b, cwx::d, cwx::new);
   public static final Codec<ja<cwx>> c = akp.a(li.aP, a);
   public static final zc<wp, ja<cwx>> d = za.a(li.aP, b);

   public xe a(ja<cwv> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akt a() {
      return this.e;
   }

   public ja<cuc> b() {
      return this.f;
   }

   public xe c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
