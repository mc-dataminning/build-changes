import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record clo(int e, int f, alp g, Optional<xk> h, Optional<xk> i) {
   public static final Codec<clo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azd.a(1, 16).fieldOf("width").forGetter(clo::b),
               azd.a(1, 16).fieldOf("height").forGetter(clo::c),
               alp.a.fieldOf("asset_id").forGetter(clo::d),
               xm.a.optionalFieldOf("title").forGetter(clo::e),
               xm.a.optionalFieldOf("author").forGetter(clo::f)
            )
            .apply($$0, clo::new)
   );
   public static final zi<wv, clo> b = zi.a(zg.h, clo::b, zg.h, clo::c, alp.b, clo::d, xm.e, clo::e, xm.e, clo::f, clo::new);
   public static final Codec<jq<clo>> c = all.a(mb.X, a);
   public static final zi<wv, jq<clo>> d = zg.a(mb.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public alp d() {
      return this.g;
   }

   public Optional<xk> e() {
      return this.h;
   }

   public Optional<xk> f() {
      return this.i;
   }
}
