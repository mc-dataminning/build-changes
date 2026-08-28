import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhn(alg e, wy f, boolean g) {
   public static final Codec<dhn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alg.a.fieldOf("asset_id").forGetter(dhn::a),
               xa.a.fieldOf("description").forGetter(dhn::b),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dhn::c)
            )
            .apply($$0, dhn::new)
   );
   public static final yw<wj, dhn> b = yw.a(alg.b, dhn::a, xa.b, dhn::b, yu.b, dhn::c, dhn::new);
   public static final Codec<je<dhn>> c = alc.a(mg.bk, a);
   public static final yw<wj, je<dhn>> d = yu.a(mg.bk, b);

   public wy a(je<dhl> $$0) {
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
