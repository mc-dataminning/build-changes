import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum daq implements azv {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<daq> e = azv.a(daq::values);
   public static final IntFunction<daq> f = axq.a(daq::a, values(), axq.a.a);
   public static final yn<ByteBuf, daq> g = yl.a(f, daq::a);
   private final String h;
   private final int i;

   private daq(final String $$0, final int $$1) {
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
