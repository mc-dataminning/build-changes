import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cpm(ahh c, ih<cnb> d, vg e, boolean f) {
   public static final Codec<cpm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahh.a.fieldOf("asset_id").forGetter(cpm::a),
               ahe.a(ke.F).fieldOf("template_item").forGetter(cpm::b),
               vi.a.fieldOf("description").forGetter(cpm::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cpm::d)
            )
            .apply($$0, cpm::new)
   );
   public static final Codec<ih<cpm>> b = ahd.a(ke.aJ, a);

   public vg a(ih<cpk> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public ahh a() {
      return this.c;
   }

   public ih<cnb> b() {
      return this.d;
   }

   public vg c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
