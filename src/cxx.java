import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxx(ale e, jo<cvn> f, xe g, boolean h) {
   public static final Codec<cxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.fieldOf("asset_id").forGetter(cxx::a),
               alb.a(lw.K).fieldOf("template_item").forGetter(cxx::b),
               xg.a.fieldOf("description").forGetter(cxx::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cxx::d)
            )
            .apply($$0, cxx::new)
   );
   public static final zc<wp, cxx> b = zc.a(ale.b, cxx::a, za.b(lw.K), cxx::b, xg.b, cxx::c, za.b, cxx::d, cxx::new);
   public static final Codec<jo<cxx>> c = ala.a(lw.aZ, a);
   public static final zc<wp, jo<cxx>> d = za.a(lw.aZ, b);

   public xe a(jo<cxv> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public ale a() {
      return this.e;
   }

   public jo<cvn> b() {
      return this.f;
   }

   public xe c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
