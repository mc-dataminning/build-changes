import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cru(ajc c, il<cpl> d, vs e, boolean f) {
   public static final Codec<cru> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajc.a.fieldOf("asset_id").forGetter(cru::a),
               aiz.a(ki.F).fieldOf("template_item").forGetter(cru::b),
               vu.a.fieldOf("description").forGetter(cru::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cru::d)
            )
            .apply($$0, cru::new)
   );
   public static final Codec<il<cru>> b = aiy.a(ki.aK, a);

   public vs a(il<crs> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public ajc a() {
      return this.c;
   }

   public il<cpl> b() {
      return this.d;
   }

   public vs c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
