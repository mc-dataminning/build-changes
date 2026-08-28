import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cxv implements ayz {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cxv> e = ayz.a(cxv::values);
   public static final IntFunction<cxv> f = awu.a(cxv::a, values(), awu.a.a);
   public static final ys<ByteBuf, cxv> g = yq.a(f, cxv::a);
   private final String h;
   private final int i;

   private cxv(final String $$0, final int $$1) {
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
