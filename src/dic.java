import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dic(alg e, wy f, boolean g) {
   public static final Codec<dic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alg.a.fieldOf("asset_id").forGetter(dic::a),
               xa.a.fieldOf("description").forGetter(dic::b),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dic::c)
            )
            .apply($$0, dic::new)
   );
   public static final yw<wj, dic> b = yw.a(alg.b, dic::a, xa.b, dic::b, yu.b, dic::c, dic::new);
   public static final Codec<jf<dic>> c = alc.a(mh.bl, a);
   public static final yw<wj, jf<dic>> d = yu.a(mh.bl, b);

   public wy a(jf<dia> $$0) {
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
