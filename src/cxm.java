import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cxm implements ayz {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cxm> e = ayz.a(cxm::values);
   public static final IntFunction<cxm> f = aww.a(cxm::a, values(), aww.a.a);
   public static final yv<ByteBuf, cxm> g = yt.a(f, cxm::a);
   private final String h;
   private final int i;

   private cxm(String $$0, int $$1) {
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
