import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwu(ale e, ji<cui> f, xo g, boolean h) {
   public static final Codec<cwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.fieldOf("asset_id").forGetter(cwu::a),
               alb.a(lq.G).fieldOf("template_item").forGetter(cwu::b),
               xq.a.fieldOf("description").forGetter(cwu::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwu::d)
            )
            .apply($$0, cwu::new)
   );
   public static final zm<wz, cwu> b = zm.a(ale.b, cwu::a, zk.b(lq.G), cwu::b, xq.b, cwu::c, zk.b, cwu::d, cwu::new);
   public static final Codec<ji<cwu>> c = ala.a(lq.aP, a);
   public static final zm<wz, ji<cwu>> d = zk.a(lq.aP, b);

   public xo a(ji<cws> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public ale a() {
      return this.e;
   }

   public ji<cui> b() {
      return this.f;
   }

   public xo c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
