import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwy(alf e, ji<cum> f, xp g, boolean h) {
   public static final Codec<cwy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alf.a.fieldOf("asset_id").forGetter(cwy::a),
               alc.a(lq.G).fieldOf("template_item").forGetter(cwy::b),
               xr.a.fieldOf("description").forGetter(cwy::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cwy::d)
            )
            .apply($$0, cwy::new)
   );
   public static final zn<xa, cwy> b = zn.a(alf.b, cwy::a, zl.b(lq.G), cwy::b, xr.b, cwy::c, zl.b, cwy::d, cwy::new);
   public static final Codec<ji<cwy>> c = alb.a(lq.aP, a);
   public static final zn<xa, ji<cwy>> d = zl.a(lq.aP, b);

   public xp a(ji<cww> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alf a() {
      return this.e;
   }

   public ji<cum> b() {
      return this.f;
   }

   public xp c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
