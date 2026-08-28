import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dzx implements bag {
   a(0, "start"),
   b(1, "log"),
   c(2, "fail"),
   d(3, "accept");

   private static final IntFunction<dzx> g = aya.a($$0 -> $$0.h, values(), aya.a.a);
   public static final bag.a<dzx> e = bag.a(dzx::values);
   public static final yt<ByteBuf, dzx> f = yr.a(g, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final wv j;
   private final wv k;

   private dzx(final int $$0, final String $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = wv.c("test_block.mode." + $$1);
      this.k = wv.c("test_block.mode_info." + $$1);
   }

   @Override
   public String c() {
      return this.i;
   }

   public wv a() {
      return this.j;
   }

   public wv b() {
      return this.k;
   }
}
