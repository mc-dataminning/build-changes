import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ckm(int e, int f, alh g, Optional<xh> h, Optional<xh> i) {
   public static final Codec<ckm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.a(1, 16).fieldOf("width").forGetter(ckm::b),
               ays.a(1, 16).fieldOf("height").forGetter(ckm::c),
               alh.a.fieldOf("asset_id").forGetter(ckm::d),
               xj.a.optionalFieldOf("title").forGetter(ckm::e),
               xj.a.optionalFieldOf("author").forGetter(ckm::f)
            )
            .apply($$0, ckm::new)
   );
   public static final zf<ws, ckm> b = zf.a(zd.h, ckm::b, zd.h, ckm::c, alh.b, ckm::d, xj.e, ckm::e, xj.e, ckm::f, ckm::new);
   public static final Codec<jp<ckm>> c = ald.a(ly.X, a);
   public static final zf<ws, jp<ckm>> d = zd.a(ly.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public alh d() {
      return this.g;
   }

   public Optional<xh> e() {
      return this.h;
   }

   public Optional<xh> f() {
      return this.i;
   }
}
