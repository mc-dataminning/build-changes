import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ckz(int e, int f, akv g, Optional<wp> h, Optional<wp> i) {
   public static final Codec<ckz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.a(1, 16).fieldOf("width").forGetter(ckz::b),
               ayi.a(1, 16).fieldOf("height").forGetter(ckz::c),
               akv.a.fieldOf("asset_id").forGetter(ckz::d),
               wr.a.optionalFieldOf("title").forGetter(ckz::e),
               wr.a.optionalFieldOf("author").forGetter(ckz::f)
            )
            .apply($$0, ckz::new)
   );
   public static final yn<wa, ckz> b = yn.a(yl.h, ckz::b, yl.h, ckz::c, akv.b, ckz::d, wr.e, ckz::e, wr.e, ckz::f, ckz::new);
   public static final Codec<jr<ckz>> c = akr.a(mc.X, a);
   public static final yn<wa, jr<ckz>> d = yl.a(mc.X, b);

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
