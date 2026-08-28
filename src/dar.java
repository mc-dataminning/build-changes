import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dar implements azv {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dar> e = azv.a(dar::values);
   public static final IntFunction<dar> f = axq.a(dar::a, values(), axq.a.a);
   public static final ym<ByteBuf, dar> g = yk.a(f, dar::a);
   private final String h;
   private final int i;

   private dar(final String $$0, final int $$1) {
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
