import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhs(alg e, wy f, boolean g) {
   public static final Codec<dhs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alg.a.fieldOf("asset_id").forGetter(dhs::a),
               xa.a.fieldOf("description").forGetter(dhs::b),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dhs::c)
            )
            .apply($$0, dhs::new)
   );
   public static final yw<wj, dhs> b = yw.a(alg.b, dhs::a, xa.b, dhs::b, yu.b, dhs::c, dhs::new);
   public static final Codec<je<dhs>> c = alc.a(mg.bl, a);
   public static final yw<wj, je<dhs>> d = yu.a(mg.bl, b);

   public wy a(je<dhq> $$0) {
      return this.f.f().c($$0.a().b().a());
   }

   public alg a() {
      return this.e;
   }

   public wy b() {
      return this.f;
   }

   public boolean c() {
      return this.g;
   }
}
