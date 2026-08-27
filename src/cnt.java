import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cnt(agm c, ig<clj> d, uv e, boolean f) {
   public static final Codec<cnt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agm.a.fieldOf("asset_id").forGetter(cnt::a),
               agj.a(kd.E).fieldOf("template_item").forGetter(cnt::b),
               ux.a.fieldOf("description").forGetter(cnt::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cnt::d)
            )
            .apply($$0, cnt::new)
   );
   public static final Codec<ig<cnt>> b = agi.a(kd.aG, a);

   public uv a(ig<cnr> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public agm a() {
      return this.c;
   }

   public ig<clj> b() {
      return this.d;
   }

   public uv c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
