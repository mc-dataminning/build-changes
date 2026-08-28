import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum edb implements bax {
   a(0, "start"),
   b(1, "log"),
   c(2, "fail"),
   d(3, "accept");

   private static final IntFunction<edb> g = ayo.a($$0 -> $$0.h, values(), ayo.a.a);
   public static final Codec<edb> e = bax.a(edb::values);
   public static final ze<ByteBuf, edb> f = zc.a(g, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final xg j;
   private final xg k;

   private edb(final int $$0, final String $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = xg.c("test_block.mode." + $$1);
      this.k = xg.c("test_block.mode_info." + $$1);
   }

   @Override
   public String c() {
      return this.i;
   }

   public xg a() {
      return this.j;
   }

   public xg b() {
      return this.k;
   }
}
