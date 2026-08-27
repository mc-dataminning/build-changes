import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cpe(ahg c, ih<cmt> d, vf e, boolean f) {
   public static final Codec<cpe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahg.a.fieldOf("asset_id").forGetter(cpe::a),
               ahd.a(ke.F).fieldOf("template_item").forGetter(cpe::b),
               vh.a.fieldOf("description").forGetter(cpe::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cpe::d)
            )
            .apply($$0, cpe::new)
   );
   public static final Codec<ih<cpe>> b = ahc.a(ke.aJ, a);

   public vf a(ih<cpc> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public ahg a() {
      return this.c;
   }

   public ih<cmt> b() {
      return this.d;
   }

   public vf c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
