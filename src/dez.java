import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dez(akv e, jr<cwl> f, wp g, boolean h) {
   public static final Codec<dez> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akv.a.fieldOf("asset_id").forGetter(dez::a),
               cwl.e.fieldOf("template_item").forGetter(dez::b),
               wr.a.fieldOf("description").forGetter(dez::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dez::d)
            )
            .apply($$0, dez::new)
   );
   public static final yn<wa, dez> b = yn.a(akv.b, dez::a, yl.b(mc.K), dez::b, wr.b, dez::c, yl.b, dez::d, dez::new);
   public static final Codec<jr<dez>> c = akr.a(mc.ba, a);
   public static final yn<wa, jr<dez>> d = yl.a(mc.ba, b);

   public wp a(jr<dex> $$0) {
      return this.g.f().c($$0.a().d().a());
   }

   public akv a() {
      return this.e;
   }

   public jr<cwl> b() {
      return this.f;
   }

   public wp c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
