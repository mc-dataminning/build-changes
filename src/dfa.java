import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfa(akv e, jr<cwm> f, wp g, boolean h) {
   public static final Codec<dfa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akv.a.fieldOf("asset_id").forGetter(dfa::a),
               cwm.e.fieldOf("template_item").forGetter(dfa::b),
               wr.a.fieldOf("description").forGetter(dfa::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dfa::d)
            )
            .apply($$0, dfa::new)
   );
   public static final yn<wa, dfa> b = yn.a(akv.b, dfa::a, yl.b(mc.K), dfa::b, wr.b, dfa::c, yl.b, dfa::d, dfa::new);
   public static final Codec<jr<dfa>> c = akr.a(mc.ba, a);
   public static final yn<wa, jr<dfa>> d = yl.a(mc.ba, b);

   public wp a(jr<dey> $$0) {
      return this.g.f().c($$0.a().d().a());
   }

   public akv a() {
      return this.e;
   }

   public jr<cwm> b() {
      return this.f;
   }

   public wp c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
