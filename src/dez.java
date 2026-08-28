import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dez(aku e, jr<cwl> f, wo g, boolean h) {
   public static final Codec<dez> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aku.a.fieldOf("asset_id").forGetter(dez::a),
               cwl.e.fieldOf("template_item").forGetter(dez::b),
               wq.a.fieldOf("description").forGetter(dez::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dez::d)
            )
            .apply($$0, dez::new)
   );
   public static final ym<vz, dez> b = ym.a(aku.b, dez::a, yk.b(mc.K), dez::b, wq.b, dez::c, yk.b, dez::d, dez::new);
   public static final Codec<jr<dez>> c = akq.a(mc.ba, a);
   public static final ym<vz, jr<dez>> d = yk.a(mc.ba, b);

   public wo a(jr<dex> $$0) {
      return this.g.f().c($$0.a().d().a());
   }

   public aku a() {
      return this.e;
   }

   public jr<cwl> b() {
      return this.f;
   }

   public wo c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
