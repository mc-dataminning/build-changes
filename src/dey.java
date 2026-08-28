import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dey(akv e, jr<cwk> f, wp g, boolean h) {
   public static final Codec<dey> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akv.a.fieldOf("asset_id").forGetter(dey::a),
               cwk.e.fieldOf("template_item").forGetter(dey::b),
               wr.a.fieldOf("description").forGetter(dey::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dey::d)
            )
            .apply($$0, dey::new)
   );
   public static final yn<wa, dey> b = yn.a(akv.b, dey::a, yl.b(mc.K), dey::b, wr.b, dey::c, yl.b, dey::d, dey::new);
   public static final Codec<jr<dey>> c = akr.a(mc.ba, a);
   public static final yn<wa, jr<dey>> d = yl.a(mc.ba, b);

   public wp a(jr<dew> $$0) {
      return this.g.f().c($$0.a().d().a());
   }

   public akv a() {
      return this.e;
   }

   public jr<cwk> b() {
      return this.f;
   }

   public wp c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
