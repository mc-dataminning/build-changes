import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum czx implements baf {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<czx> e = baf.a(czx::values);
   public static final IntFunction<czx> f = aya.a(czx::a, values(), aya.a.a);
   public static final zf<ByteBuf, czx> g = zd.a(f, czx::a);
   private final String h;
   private final int i;

   private czx(final String $$0, final int $$1) {
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
