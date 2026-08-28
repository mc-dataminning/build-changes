import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhh(ale e, ww f, boolean g) {
   public static final Codec<dhh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.fieldOf("asset_id").forGetter(dhh::a),
               wy.a.fieldOf("description").forGetter(dhh::b),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dhh::c)
            )
            .apply($$0, dhh::new)
   );
   public static final yu<wh, dhh> b = yu.a(ale.b, dhh::a, wy.b, dhh::b, ys.b, dhh::c, dhh::new);
   public static final Codec<je<dhh>> c = ala.a(mg.bj, a);
   public static final yu<wh, je<dhh>> d = ys.a(mg.bj, b);

   public ww a(je<dhf> $$0) {
      return this.f.f().c($$0.a().b().a());
   }

   public ale a() {
      return this.e;
   }

   public ww b() {
      return this.f;
   }

   public boolean c() {
      return this.g;
   }
}
