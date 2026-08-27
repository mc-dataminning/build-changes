import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum crr implements axc {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<crr> e = axc.a(crr::values);
   public static final IntFunction<crr> f = auz.a(crr::a, values(), auz.a.a);
   public static final xo<ByteBuf, crr> g = xm.a(f, crr::a);
   private final String h;
   private final int i;

   private crr(String $$0, int $$1) {
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
