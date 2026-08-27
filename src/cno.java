import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cno(agi c, ib<cle> d, ur e, boolean f) {
   public static final Codec<cno> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agi.a.fieldOf("asset_id").forGetter(cno::a),
               agf.a(jz.E).fieldOf("template_item").forGetter(cno::b),
               ut.a.fieldOf("description").forGetter(cno::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(cno::d)
            )
            .apply($$0, cno::new)
   );
   public static final Codec<ib<cno>> b = age.a(jz.aG, a);

   public ur a(ib<cnm> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public agi a() {
      return this.c;
   }

   public ib<cle> b() {
      return this.d;
   }

   public ur c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
