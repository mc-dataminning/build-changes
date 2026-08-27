import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cng(agg c, ib<ckw> d, ur e, boolean f) {
   public static final Codec<cng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agg.a.fieldOf("asset_id").forGetter(cng::a),
               agd.a(jz.E).fieldOf("template_item").forGetter(cng::b),
               ut.a.fieldOf("description").forGetter(cng::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cng::d)
            )
            .apply($$0, cng::new)
   );
   public static final Codec<ib<cng>> b = agc.a(jz.aG, a);

   public ur a(ib<cne> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public agg a() {
      return this.c;
   }

   public ib<ckw> b() {
      return this.d;
   }

   public ur c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
