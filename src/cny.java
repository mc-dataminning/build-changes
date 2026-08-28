import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cny(int e, int f, ali g, Optional<xa> h, Optional<xa> i) {
   public static final Codec<cny> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.a(1, 16).fieldOf("width").forGetter(cny::b),
               ayw.a(1, 16).fieldOf("height").forGetter(cny::c),
               ali.a.fieldOf("asset_id").forGetter(cny::d),
               xc.a.optionalFieldOf("title").forGetter(cny::e),
               xc.a.optionalFieldOf("author").forGetter(cny::f)
            )
            .apply($$0, cny::new)
   );
   public static final yy<wl, cny> b = yy.a(yw.h, cny::b, yw.h, cny::c, ali.b, cny::d, xc.e, cny::e, xc.e, cny::f, cny::new);
   public static final Codec<jf<cny>> c = ale.a(mh.aZ, a);
   public static final yy<wl, jf<cny>> d = yw.a(mh.aZ, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public ali d() {
      return this.g;
   }

   public Optional<xa> e() {
      return this.h;
   }

   public Optional<xa> f() {
      return this.i;
   }
}
