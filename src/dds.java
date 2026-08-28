import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dds(ali e, jq<cvx> f, xi g, boolean h) {
   public static final Codec<dds> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ali.a.fieldOf("asset_id").forGetter(dds::a),
               alf.a(lz.K).fieldOf("template_item").forGetter(dds::b),
               xk.a.fieldOf("description").forGetter(dds::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dds::d)
            )
            .apply($$0, dds::new)
   );
   public static final zg<wt, dds> b = zg.a(ali.b, dds::a, ze.b(lz.K), dds::b, xk.b, dds::c, ze.b, dds::d, dds::new);
   public static final Codec<jq<dds>> c = ale.a(lz.aY, a);
   public static final zg<wt, jq<dds>> d = ze.a(lz.aY, b);

   public xi a(jq<ddq> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public ali a() {
      return this.e;
   }

   public jq<cvx> b() {
      return this.f;
   }

   public xi c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
