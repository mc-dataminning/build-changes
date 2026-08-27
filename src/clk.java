import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clk(aew c, he<cja> d, tl e, boolean f) {
   public static final Codec<clk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aew.a.fieldOf("asset_id").forGetter(clk::a),
               aet.a(jc.D).fieldOf("template_item").forGetter(clk::b),
               arf.b.fieldOf("description").forGetter(clk::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(clk::d)
            )
            .apply($$0, clk::new)
   );
   public static final Codec<he<clk>> b = aes.a(jc.aE, a);

   public tl a(he<cli> $$0) {
      return this.e.e().c($$0.a().e().a());
   }

   public aew a() {
      return this.c;
   }

   public he<cja> b() {
      return this.d;
   }

   public tl c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
