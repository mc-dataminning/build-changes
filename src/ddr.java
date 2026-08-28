import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ddr implements bak {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<ddr> e = bak.a(ddr::values);
   public static final IntFunction<ddr> f = ayc.a(ddr::a, values(), ayc.a.a);
   public static final yw<ByteBuf, ddr> g = yu.a(f, ddr::a);
   private final String h;
   private final int i;

   private ddr(final String $$0, final int $$1) {
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
