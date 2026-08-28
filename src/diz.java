import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record diz(alr e, xg f, boolean g) {
   public static final Codec<diz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alr.a.fieldOf("asset_id").forGetter(diz::a),
               xi.a.fieldOf("description").forGetter(diz::b),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(diz::c)
            )
            .apply($$0, diz::new)
   );
   public static final ze<wp, diz> b = ze.a(alr.b, diz::a, xi.b, diz::b, zc.b, diz::c, diz::new);
   public static final Codec<jg<diz>> c = aln.a(mi.bl, a);
   public static final ze<wp, jg<diz>> d = zc.a(mi.bl, b);

   public xg a(jg<dix> $$0) {
      return this.f.f().c($$0.a().b().a());
   }

   public alr a() {
      return this.e;
   }

   public xg b() {
      return this.f;
   }

   public boolean c() {
      return this.g;
   }
}
