import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ecp implements bam {
   a(0, "start"),
   b(1, "log"),
   c(2, "fail"),
   d(3, "accept");

   private static final IntFunction<ecp> g = aye.a($$0 -> $$0.h, values(), aye.a.a);
   public static final Codec<ecp> e = bam.a(ecp::values);
   public static final yy<ByteBuf, ecp> f = yw.a(g, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final xa j;
   private final xa k;

   private ecp(final int $$0, final String $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = xa.c("test_block.mode." + $$1);
      this.k = xa.c("test_block.mode_info." + $$1);
   }

   @Override
   public String c() {
      return this.i;
   }

   public xa a() {
      return this.j;
   }

   public xa b() {
      return this.k;
   }
}
