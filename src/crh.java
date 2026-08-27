import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crh(aiy c, ij<coy> d, vq e, boolean f) {
   public static final Codec<crh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aiy.a.fieldOf("asset_id").forGetter(crh::a),
               aiv.a(kg.F).fieldOf("template_item").forGetter(crh::b),
               vs.a.fieldOf("description").forGetter(crh::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(crh::d)
            )
            .apply($$0, crh::new)
   );
   public static final Codec<ij<crh>> b = aiu.a(kg.aJ, a);

   public vq a(ij<crf> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public aiy a() {
      return this.c;
   }

   public ij<coy> b() {
      return this.d;
   }

   public vq c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
