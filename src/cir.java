import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record cir(int e, int f, akk g) {
   public static final Codec<cir> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.a(1, 16).fieldOf("width").forGetter(cir::b), axo.a(1, 16).fieldOf("height").forGetter(cir::c), akk.a.fieldOf("asset_id").forGetter(cir::d)
            )
            .apply($$0, cir::new)
   );
   public static final ys<ByteBuf, cir> b = ys.a(yq.g, cir::b, yq.g, cir::c, akk.b, cir::d, cir::new);
   public static final Codec<jj<cir>> c = akg.a(lr.W, a);
   public static final ys<wf, jj<cir>> d = yq.a(lr.W, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public akk d() {
      return this.g;
   }
}
