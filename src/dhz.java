import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhz(alg e, wy f, boolean g) {
   public static final Codec<dhz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alg.a.fieldOf("asset_id").forGetter(dhz::a),
               xa.a.fieldOf("description").forGetter(dhz::b),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dhz::c)
            )
            .apply($$0, dhz::new)
   );
   public static final yw<wj, dhz> b = yw.a(alg.b, dhz::a, xa.b, dhz::b, yu.b, dhz::c, dhz::new);
   public static final Codec<jf<dhz>> c = alc.a(mh.bl, a);
   public static final yw<wj, jf<dhz>> d = yu.a(mh.bl, b);

   public wy a(jf<dhx> $$0) {
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
