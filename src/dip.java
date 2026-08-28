import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dip(alk e, xc f, boolean g) {
   public static final Codec<dip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alk.a.fieldOf("asset_id").forGetter(dip::a),
               xe.a.fieldOf("description").forGetter(dip::b),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dip::c)
            )
            .apply($$0, dip::new)
   );
   public static final za<wn, dip> b = za.a(alk.b, dip::a, xe.b, dip::b, yy.b, dip::c, dip::new);
   public static final Codec<jg<dip>> c = alg.a(mi.bl, a);
   public static final za<wn, jg<dip>> d = yy.a(mi.bl, b);

   public xc a(jg<din> $$0) {
      return this.f.f().c($$0.a().b().a());
   }

   public alk a() {
      return this.e;
   }

   public xc b() {
      return this.f;
   }

   public boolean c() {
      return this.g;
   }
}
