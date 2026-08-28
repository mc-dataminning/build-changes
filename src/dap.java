import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dap implements azu {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dap> e = azu.a(dap::values);
   public static final IntFunction<dap> f = axp.a(dap::a, values(), axp.a.a);
   public static final ym<ByteBuf, dap> g = yk.a(f, dap::a);
   private final String h;
   private final int i;

   private dap(final String $$0, final int $$1) {
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
