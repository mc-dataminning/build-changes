import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dee implements bao {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dee> e = bao.a(dee::values);
   public static final IntFunction<dee> f = ayg.a(dee::a, values(), ayg.a.a);
   public static final za<ByteBuf, dee> g = yy.a(f, dee::a);
   private final String h;
   private final int i;

   private dee(final String $$0, final int $$1) {
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
