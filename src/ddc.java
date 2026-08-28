import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ddc implements bak {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<ddc> e = bak.a(ddc::values);
   public static final IntFunction<ddc> f = ayc.a(ddc::a, values(), ayc.a.a);
   public static final yw<ByteBuf, ddc> g = yu.a(f, ddc::a);
   private final String h;
   private final int i;

   private ddc(final String $$0, final int $$1) {
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
