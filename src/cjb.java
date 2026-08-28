import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record cjb(int e, int f, akq g) {
   public static final Codec<cjb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axv.a(1, 16).fieldOf("width").forGetter(cjb::b), axv.a(1, 16).fieldOf("height").forGetter(cjb::c), akq.a.fieldOf("asset_id").forGetter(cjb::d)
            )
            .apply($$0, cjb::new)
   );
   public static final yw<ByteBuf, cjb> b = yw.a(yu.g, cjb::b, yu.g, cjb::c, akq.b, cjb::d, cjb::new);
   public static final Codec<jm<cjb>> c = akm.a(lu.X, a);
   public static final yw<wj, jm<cjb>> d = yu.a(lu.X, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public akq d() {
      return this.g;
   }
}
