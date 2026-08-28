import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ckx(int e, int f, akv g, Optional<wp> h, Optional<wp> i) {
   public static final Codec<ckx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.a(1, 16).fieldOf("width").forGetter(ckx::b),
               ayi.a(1, 16).fieldOf("height").forGetter(ckx::c),
               akv.a.fieldOf("asset_id").forGetter(ckx::d),
               wr.a.optionalFieldOf("title").forGetter(ckx::e),
               wr.a.optionalFieldOf("author").forGetter(ckx::f)
            )
            .apply($$0, ckx::new)
   );
   public static final yn<wa, ckx> b = yn.a(yl.h, ckx::b, yl.h, ckx::c, akv.b, ckx::d, wr.e, ckx::e, wr.e, ckx::f, ckx::new);
   public static final Codec<jr<ckx>> c = akr.a(mc.X, a);
   public static final yn<wa, jr<ckx>> d = yl.a(mc.X, b);

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
