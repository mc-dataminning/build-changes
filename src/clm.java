import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clm(aey c, hg<cjc> d, tn e, boolean f) {
   public static final Codec<clm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aey.a.fieldOf("asset_id").forGetter(clm::a),
               aev.a(je.D).fieldOf("template_item").forGetter(clm::b),
               arh.b.fieldOf("description").forGetter(clm::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(clm::d)
            )
            .apply($$0, clm::new)
   );
   public static final Codec<hg<clm>> b = aeu.a(je.aE, a);

   public tn a(hg<clk> $$0) {
      return this.e.e().c($$0.a().e().a());
   }

   public aey a() {
      return this.c;
   }

   public hg<cjc> b() {
      return this.d;
   }

   public tn c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
