import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clb(aep c, hf<cir> d, te e) {
   public static final Codec<clb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aep.a.fieldOf("asset_id").forGetter(clb::a),
               aem.a(jd.D).fieldOf("template_item").forGetter(clb::b),
               aqw.b.fieldOf("description").forGetter(clb::c)
            )
            .apply($$0, clb::new)
   );
   public static final Codec<hf<clb>> b = ael.a(jd.aE, a);

   public te a(hf<ckz> $$0) {
      return this.e.e().c($$0.a().e().a());
   }

   public aep a() {
      return this.c;
   }

   public hf<cir> b() {
      return this.d;
   }

   public te c() {
      return this.e;
   }
}
