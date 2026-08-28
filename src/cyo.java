import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cyo implements azk {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cyo> e = azk.a(cyo::values);
   public static final IntFunction<cyo> f = axe.a(cyo::a, values(), axe.a.a);
   public static final yx<ByteBuf, cyo> g = yv.a(f, cyo::a);
   private final String h;
   private final int i;

   private cyo(final String $$0, final int $$1) {
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
