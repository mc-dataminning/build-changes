import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctn(ajt e, il<cre> f, wg g, boolean h) {
   public static final Codec<ctn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajt.a.fieldOf("asset_id").forGetter(ctn::a),
               ajq.a(ks.F).fieldOf("template_item").forGetter(ctn::b),
               wi.a.fieldOf("description").forGetter(ctn::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(ctn::d)
            )
            .apply($$0, ctn::new)
   );
   public static final ye<vr, ctn> b = ye.a(ajt.b, ctn::a, yc.b(ks.F), ctn::b, wi.b, ctn::c, yc.b, ctn::d, ctn::new);
   public static final Codec<il<ctn>> c = ajp.a(ks.aL, a);
   public static final ye<vr, il<ctn>> d = yc.a(ks.aL, b);

   public wg a(il<ctl> $$0) {
      return this.g.f().c($$0.a().e().a());
   }

   public ajt a() {
      return this.e;
   }

   public il<cre> b() {
      return this.f;
   }

   public wg c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
