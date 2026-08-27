import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clc(aer c, he<cis> d, tf e, boolean f) {
   public static final Codec<clc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aer.a.fieldOf("asset_id").forGetter(clc::a),
               aeo.a(jc.D).fieldOf("template_item").forGetter(clc::b),
               aqy.b.fieldOf("description").forGetter(clc::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(clc::d)
            )
            .apply($$0, clc::new)
   );
   public static final Codec<he<clc>> b = aen.a(jc.aE, a);

   public tf a(he<cla> $$0) {
      return this.e.e().c($$0.a().e().a());
   }

   public aer a() {
      return this.c;
   }

   public he<cis> b() {
      return this.d;
   }

   public tf c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
