import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record din(ali e, xa f, boolean g) {
   public static final Codec<din> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ali.a.fieldOf("asset_id").forGetter(din::a),
               xc.a.fieldOf("description").forGetter(din::b),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(din::c)
            )
            .apply($$0, din::new)
   );
   public static final yy<wl, din> b = yy.a(ali.b, din::a, xc.b, din::b, yw.b, din::c, din::new);
   public static final Codec<jf<din>> c = ale.a(mh.bl, a);
   public static final yy<wl, jf<din>> d = yw.a(mh.bl, b);

   public xa a(jf<dil> $$0) {
      return this.f.f().c($$0.a().b().a());
   }

   public ali a() {
      return this.e;
   }

   public xa b() {
      return this.f;
   }

   public boolean c() {
      return this.g;
   }
}
