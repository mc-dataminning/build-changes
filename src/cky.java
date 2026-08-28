import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cky(int e, int f, akv g, Optional<wp> h, Optional<wp> i) {
   public static final Codec<cky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.a(1, 16).fieldOf("width").forGetter(cky::b),
               ayi.a(1, 16).fieldOf("height").forGetter(cky::c),
               akv.a.fieldOf("asset_id").forGetter(cky::d),
               wr.a.optionalFieldOf("title").forGetter(cky::e),
               wr.a.optionalFieldOf("author").forGetter(cky::f)
            )
            .apply($$0, cky::new)
   );
   public static final yn<wa, cky> b = yn.a(yl.h, cky::b, yl.h, cky::c, akv.b, cky::d, wr.e, cky::e, wr.e, cky::f, cky::new);
   public static final Codec<jr<cky>> c = akr.a(mc.X, a);
   public static final yn<wa, jr<cky>> d = yl.a(mc.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public akv d() {
      return this.g;
   }

   public Optional<wp> e() {
      return this.h;
   }

   public Optional<wp> f() {
      return this.i;
   }
}
