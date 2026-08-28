import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum eaz implements bai {
   a(0, "start"),
   b(1, "log"),
   c(2, "fail"),
   d(3, "accept");

   private static final IntFunction<eaz> g = aya.a($$0 -> $$0.h, values(), aya.a.a);
   public static final bai.a<eaz> e = bai.a(eaz::values);
   public static final yu<ByteBuf, eaz> f = ys.a(g, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final ww j;
   private final ww k;

   private eaz(final int $$0, final String $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = ww.c("test_block.mode." + $$1);
      this.k = ww.c("test_block.mode_info." + $$1);
   }

   @Override
   public String c() {
      return this.i;
   }

   public ww a() {
      return this.j;
   }

   public ww b() {
      return this.k;
   }
}
