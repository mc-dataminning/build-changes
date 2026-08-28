import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum das implements azv {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<das> e = azv.a(das::values);
   public static final IntFunction<das> f = axq.a(das::a, values(), axq.a.a);
   public static final yn<ByteBuf, das> g = yl.a(f, das::a);
   private final String h;
   private final int i;

   private das(final String $$0, final int $$1) {
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
