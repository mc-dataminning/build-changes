import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clq(aez c, he<cjg> d, tl e, boolean f) {
   public static final Codec<clq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aez.a.fieldOf("asset_id").forGetter(clq::a),
               aew.a(jc.E).fieldOf("template_item").forGetter(clq::b),
               tn.a.fieldOf("description").forGetter(clq::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(clq::d)
            )
            .apply($$0, clq::new)
   );
   public static final Codec<he<clq>> b = aev.a(jc.aF, a);

   public tl a(he<clo> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public aez a() {
      return this.c;
   }

   public he<cjg> b() {
      return this.d;
   }

   public tl c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
