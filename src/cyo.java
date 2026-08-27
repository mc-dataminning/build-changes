import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cyo implements azg {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cyo> e = azg.a(cyo::values);
   public static final IntFunction<cyo> f = axd.a(cyo::a, values(), axd.a.a);
   public static final zc<ByteBuf, cyo> g = za.a(f, cyo::a);
   private final String h;
   private final int i;

   private cyo(String $$0, int $$1) {
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
