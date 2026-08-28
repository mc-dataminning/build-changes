import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum czy implements bab {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<czy> e = bab.a(czy::values);
   public static final IntFunction<czy> f = axw.a(czy::a, values(), axw.a.a);
   public static final zc<ByteBuf, czy> g = za.a(f, czy::a);
   private final String h;
   private final int i;

   private czy(final String $$0, final int $$1) {
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
