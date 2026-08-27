import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cui(akf e, iv<cry> f, ws g, boolean h) {
   public static final Codec<cui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akf.a.fieldOf("asset_id").forGetter(cui::a),
               akc.a(ld.G).fieldOf("template_item").forGetter(cui::b),
               wu.a.fieldOf("description").forGetter(cui::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cui::d)
            )
            .apply($$0, cui::new)
   );
   public static final yq<wd, cui> b = yq.a(akf.b, cui::a, yo.b(ld.G), cui::b, wu.b, cui::c, yo.b, cui::d, cui::new);
   public static final Codec<iv<cui>> c = akb.a(ld.aO, a);
   public static final yq<wd, iv<cui>> d = yo.a(ld.aO, b);

   public ws a(iv<cug> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public akf a() {
      return this.e;
   }

   public iv<cry> b() {
      return this.f;
   }

   public ws c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
