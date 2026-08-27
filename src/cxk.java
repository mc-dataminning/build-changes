import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cxk implements ayx {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cxk> e = ayx.a(cxk::values);
   public static final IntFunction<cxk> f = awv.a(cxk::a, values(), awv.a.a);
   public static final yv<ByteBuf, cxk> g = yt.a(f, cxk::a);
   private final String h;
   private final int i;

   private cxk(String $$0, int $$1) {
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
