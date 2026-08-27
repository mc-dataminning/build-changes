import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cld(aer c, he<cit> d, tf e) {
   public static final Codec<cld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aer.a.fieldOf("asset_id").forGetter(cld::a),
               aeo.a(jc.D).fieldOf("template_item").forGetter(cld::b),
               aqy.b.fieldOf("description").forGetter(cld::c)
            )
            .apply($$0, cld::new)
   );
   public static final Codec<he<cld>> b = aen.a(jc.aE, a);

   public tf a(he<clb> $$0) {
      return this.e.e().c($$0.a().e().a());
   }

   public aer a() {
      return this.c;
   }

   public he<cit> b() {
      return this.d;
   }

   public tf c() {
      return this.e;
   }
}
