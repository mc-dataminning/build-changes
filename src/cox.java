import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cox(ahd c, ih<cmm> d, vd e, boolean f) {
   public static final Codec<cox> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahd.a.fieldOf("asset_id").forGetter(cox::a),
               aha.a(ke.F).fieldOf("template_item").forGetter(cox::b),
               vf.a.fieldOf("description").forGetter(cox::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cox::d)
            )
            .apply($$0, cox::new)
   );
   public static final Codec<ih<cox>> b = agz.a(ke.aJ, a);

   public vd a(ih<cov> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public ahd a() {
      return this.c;
   }

   public ih<cmm> b() {
      return this.d;
   }

   public vd c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
