import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cuz implements aye {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cuz> e = aye.a(cuz::values);
   public static final IntFunction<cuz> f = awb.a(cuz::a, values(), awb.a.a);
   public static final ye<ByteBuf, cuz> g = yc.a(f, cuz::a);
   private final String h;
   private final int i;

   private cuz(String $$0, int $$1) {
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
