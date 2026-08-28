import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dao implements bai {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dao> e = bai.a(dao::values);
   public static final IntFunction<dao> f = ayd.a(dao::a, values(), ayd.a.a);
   public static final zh<ByteBuf, dao> g = zf.a(f, dao::a);
   private final String h;
   private final int i;

   private dao(final String $$0, final int $$1) {
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
