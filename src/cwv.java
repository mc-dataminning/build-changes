import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwv(ale e, ji<cuj> f, xo g, boolean h) {
   public static final Codec<cwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.fieldOf("asset_id").forGetter(cwv::a),
               alb.a(lq.G).fieldOf("template_item").forGetter(cwv::b),
               xq.a.fieldOf("description").forGetter(cwv::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwv::d)
            )
            .apply($$0, cwv::new)
   );
   public static final zm<wz, cwv> b = zm.a(ale.b, cwv::a, zk.b(lq.G), cwv::b, xq.b, cwv::c, zk.b, cwv::d, cwv::new);
   public static final Codec<ji<cwv>> c = ala.a(lq.aP, a);
   public static final zm<wz, ji<cwv>> d = zk.a(lq.aP, b);

   public xo a(ji<cwt> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public ale a() {
      return this.e;
   }

   public ji<cuj> b() {
      return this.f;
   }

   public xo c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
