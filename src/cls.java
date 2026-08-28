import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cls(int e, int f, aku g, Optional<wp> h, Optional<wp> i) {
   public static final Codec<cls> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.a(1, 16).fieldOf("width").forGetter(cls::b),
               ayi.a(1, 16).fieldOf("height").forGetter(cls::c),
               aku.a.fieldOf("asset_id").forGetter(cls::d),
               wr.a.optionalFieldOf("title").forGetter(cls::e),
               wr.a.optionalFieldOf("author").forGetter(cls::f)
            )
            .apply($$0, cls::new)
   );
   public static final yn<wa, cls> b = yn.a(yl.h, cls::b, yl.h, cls::c, aku.b, cls::d, wr.e, cls::e, wr.e, cls::f, cls::new);
   public static final Codec<jr<cls>> c = akq.a(mc.X, a);
   public static final yn<wa, jr<cls>> d = yl.a(mc.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public aku d() {
      return this.g;
   }

   public Optional<wp> e() {
      return this.h;
   }

   public Optional<wp> f() {
      return this.i;
   }
}
