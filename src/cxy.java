import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cxy implements azc {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cxy> e = azc.a(cxy::values);
   public static final IntFunction<cxy> f = aww.a(cxy::a, values(), aww.a.a);
   public static final ys<ByteBuf, cxy> g = yq.a(f, cxy::a);
   private final String h;
   private final int i;

   private cxy(final String $$0, final int $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   private int a() {
      return this.i;
   }
}
