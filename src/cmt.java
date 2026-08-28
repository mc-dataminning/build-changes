import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cmt(int e, int f, ale g, Optional<ww> h, Optional<ww> i) {
   public static final Codec<cmt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.a(1, 16).fieldOf("width").forGetter(cmt::b),
               ays.a(1, 16).fieldOf("height").forGetter(cmt::c),
               ale.a.fieldOf("asset_id").forGetter(cmt::d),
               wy.a.optionalFieldOf("title").forGetter(cmt::e),
               wy.a.optionalFieldOf("author").forGetter(cmt::f)
            )
            .apply($$0, cmt::new)
   );
   public static final yu<wh, cmt> b = yu.a(ys.h, cmt::b, ys.h, cmt::c, ale.b, cmt::d, wy.e, cmt::e, wy.e, cmt::f, cmt::new);
   public static final Codec<je<cmt>> c = ala.a(mg.aX, a);
   public static final yu<wh, je<cmt>> d = ys.a(mg.aX, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public ale d() {
      return this.g;
   }

   public Optional<ww> e() {
      return this.h;
   }

   public Optional<ww> f() {
      return this.i;
   }
}
