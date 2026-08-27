import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cpd(ahg c, ih<cms> d, vf e, boolean f) {
   public static final Codec<cpd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahg.a.fieldOf("asset_id").forGetter(cpd::a),
               ahd.a(ke.F).fieldOf("template_item").forGetter(cpd::b),
               vh.a.fieldOf("description").forGetter(cpd::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cpd::d)
            )
            .apply($$0, cpd::new)
   );
   public static final Codec<ih<cpd>> b = ahc.a(ke.aJ, a);

   public vf a(ih<cpb> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public ahg a() {
      return this.c;
   }

   public ih<cms> b() {
      return this.d;
   }

   public vf c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
