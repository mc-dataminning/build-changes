import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record clk(aex c, hg<cja> d, tl e, boolean f) {
   public static final Codec<clk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aex.a.fieldOf("asset_id").forGetter(clk::a),
               aeu.a(je.D).fieldOf("template_item").forGetter(clk::b),
               arg.b.fieldOf("description").forGetter(clk::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(clk::d)
            )
            .apply($$0, clk::new)
   );
   public static final Codec<hg<clk>> b = aet.a(je.aE, a);

   public tl a(hg<cli> $$0) {
      return this.e.e().c($$0.a().e().a());
   }

   public aex a() {
      return this.c;
   }

   public hg<cja> b() {
      return this.d;
   }

   public tl c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
