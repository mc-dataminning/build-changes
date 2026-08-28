import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cww(alf e, ji<cuk> f, xp g, boolean h) {
   public static final Codec<cww> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alf.a.fieldOf("asset_id").forGetter(cww::a),
               alc.a(lq.G).fieldOf("template_item").forGetter(cww::b),
               xr.a.fieldOf("description").forGetter(cww::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cww::d)
            )
            .apply($$0, cww::new)
   );
   public static final zn<xa, cww> b = zn.a(alf.b, cww::a, zl.b(lq.G), cww::b, xr.b, cww::c, zl.b, cww::d, cww::new);
   public static final Codec<ji<cww>> c = alb.a(lq.aP, a);
   public static final zn<xa, ji<cww>> d = zl.a(lq.aP, b);

   public xp a(ji<cwu> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alf a() {
      return this.e;
   }

   public ji<cuk> b() {
      return this.f;
   }

   public xp c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
