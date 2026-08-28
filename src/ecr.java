import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ecr implements bao {
   a(0, "start"),
   b(1, "log"),
   c(2, "fail"),
   d(3, "accept");

   private static final IntFunction<ecr> g = ayg.a($$0 -> $$0.h, values(), ayg.a.a);
   public static final Codec<ecr> e = bao.a(ecr::values);
   public static final za<ByteBuf, ecr> f = yy.a(g, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final xc j;
   private final xc k;

   private ecr(final int $$0, final String $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = xc.c("test_block.mode." + $$1);
      this.k = xc.c("test_block.mode_info." + $$1);
   }

   @Override
   public String c() {
      return this.i;
   }

   public xc a() {
      return this.j;
   }

   public xc b() {
      return this.k;
   }
}
