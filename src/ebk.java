import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ebk implements bak {
   a(0, "start"),
   b(1, "log"),
   c(2, "fail"),
   d(3, "accept");

   private static final IntFunction<ebk> g = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
   public static final bak.a<ebk> e = bak.a(ebk::values);
   public static final yw<ByteBuf, ebk> f = yu.a(g, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final wy j;
   private final wy k;

   private ebk(final int $$0, final String $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = wy.c("test_block.mode." + $$1);
      this.k = wy.c("test_block.mode_info." + $$1);
   }

   @Override
   public String c() {
      return this.i;
   }

   public wy a() {
      return this.j;
   }

   public wy b() {
      return this.k;
   }
}
