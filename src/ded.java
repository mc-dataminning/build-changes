import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ded(alj e, jq<cwi> f, xj g, boolean h) {
   public static final Codec<ded> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alj.a.fieldOf("asset_id").forGetter(ded::a),
               alg.a(ma.K).fieldOf("template_item").forGetter(ded::b),
               xl.a.fieldOf("description").forGetter(ded::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(ded::d)
            )
            .apply($$0, ded::new)
   );
   public static final zh<wu, ded> b = zh.a(alj.b, ded::a, zf.b(ma.K), ded::b, xl.b, ded::c, zf.b, ded::d, ded::new);
   public static final Codec<jq<ded>> c = alf.a(ma.aY, a);
   public static final zh<wu, jq<ded>> d = zf.a(ma.aY, b);

   public xj a(jq<deb> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public alj a() {
      return this.e;
   }

   public jq<cwi> b() {
      return this.f;
   }

   public xj c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
