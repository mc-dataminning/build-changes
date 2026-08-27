import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cmo(afw c, ib<cke> d, ui e, boolean f) {
   public static final Codec<cmo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               afw.a.fieldOf("asset_id").forGetter(cmo::a),
               aft.a(jz.E).fieldOf("template_item").forGetter(cmo::b),
               uk.a.fieldOf("description").forGetter(cmo::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cmo::d)
            )
            .apply($$0, cmo::new)
   );
   public static final Codec<ib<cmo>> b = afs.a(jz.aF, a);

   public ui a(ib<cmm> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public afw a() {
      return this.c;
   }

   public ib<cke> b() {
      return this.d;
   }

   public ui c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
