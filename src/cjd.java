import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record cjd(int e, int f, akr g) {
   public static final Codec<cjd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.a(1, 16).fieldOf("width").forGetter(cjd::b), axw.a(1, 16).fieldOf("height").forGetter(cjd::c), akr.a.fieldOf("asset_id").forGetter(cjd::d)
            )
            .apply($$0, cjd::new)
   );
   public static final yx<ByteBuf, cjd> b = yx.a(yv.g, cjd::b, yv.g, cjd::c, akr.b, cjd::d, cjd::new);
   public static final Codec<jm<cjd>> c = akn.a(lu.X, a);
   public static final yx<wk, jm<cjd>> d = yv.a(lu.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public akr d() {
      return this.g;
   }
}
