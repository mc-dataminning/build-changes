import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dex(aku e, jr<cwj> f, wo g, boolean h) {
   public static final Codec<dex> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aku.a.fieldOf("asset_id").forGetter(dex::a),
               cwj.e.fieldOf("template_item").forGetter(dex::b),
               wq.a.fieldOf("description").forGetter(dex::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dex::d)
            )
            .apply($$0, dex::new)
   );
   public static final ym<vz, dex> b = ym.a(aku.b, dex::a, yk.b(mc.K), dex::b, wq.b, dex::c, yk.b, dex::d, dex::new);
   public static final Codec<jr<dex>> c = akq.a(mc.ba, a);
   public static final ym<vz, jr<dex>> d = yk.a(mc.ba, b);

   public wo a(jr<dev> $$0) {
      return this.g.f().c($$0.a().d().a());
   }

   public aku a() {
      return this.e;
   }

   public jr<cwj> b() {
      return this.f;
   }

   public wo c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }
}
