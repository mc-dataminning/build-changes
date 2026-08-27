import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crd(aiy c, ij<cou> d, vq e, boolean f) {
   public static final Codec<crd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aiy.a.fieldOf("asset_id").forGetter(crd::a),
               aiv.a(kg.F).fieldOf("template_item").forGetter(crd::b),
               vs.a.fieldOf("description").forGetter(crd::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(crd::d)
            )
            .apply($$0, crd::new)
   );
   public static final Codec<ij<crd>> b = aiu.a(kg.aJ, a);

   public vq a(ij<crb> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public aiy a() {
      return this.c;
   }

   public ij<cou> b() {
      return this.d;
   }

   public vq c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
