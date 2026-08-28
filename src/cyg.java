import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cyg implements azp {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cyg> e = azp.a(cyg::values);
   public static final IntFunction<cyg> f = axl.a(cyg::a, values(), axl.a.a);
   public static final zj<ByteBuf, cyg> g = zh.a(f, cyg::a);
   private final String h;
   private final int i;

   private cyg(final String $$0, final int $$1) {
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
