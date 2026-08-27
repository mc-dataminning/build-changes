import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cie(acq c, he<cfu> d, sw e) {
   public static final Codec<cie> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               acq.a.fieldOf("asset_id").forGetter(cie::a),
               acn.a(jc.D).fieldOf("template_item").forGetter(cie::b),
               aoi.b.fieldOf("description").forGetter(cie::c)
            )
            .apply($$0, cie::new)
   );
   public static final Codec<he<cie>> b = acm.a(jc.aE, a);

   public sw a(he<cic> $$0) {
      return this.e.e().c($$0.a().e().a());
   }

   public acq a() {
      return this.c;
   }

   public he<cfu> b() {
      return this.d;
   }

   public sw c() {
      return this.e;
   }
}
