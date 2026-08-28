import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwx(alf e, ji<cul> f, xp g, boolean h) {
   public static final Codec<cwx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alf.a.fieldOf("asset_id").forGetter(cwx::a),
               alc.a(lq.G).fieldOf("template_item").forGetter(cwx::b),
               xr.a.fieldOf("description").forGetter(cwx::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwx::d)
            )
            .apply($$0, cwx::new)
   );
   public static final zn<xa, cwx> b = zn.a(alf.b, cwx::a, zl.b(lq.G), cwx::b, xr.b, cwx::c, zl.b, cwx::d, cwx::new);
   public static final Codec<ji<cwx>> c = alb.a(lq.aP, a);
   public static final zn<xa, ji<cwx>> d = zl.a(lq.aP, b);

   public xp a(ji<cwv> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alf a() {
      return this.e;
   }

   public ji<cul> b() {
      return this.f;
   }

   public xp c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
