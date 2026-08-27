import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cvi implements ayg {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cvi> e = ayg.a(cvi::values);
   public static final IntFunction<cvi> f = awd.a(cvi::a, values(), awd.a.a);
   public static final yg<ByteBuf, cvi> g = ye.a(f, cvi::a);
   private final String h;
   private final int i;

   private cvi(String $$0, int $$1) {
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
