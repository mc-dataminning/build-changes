import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum csi implements axg {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<csi> e = axg.a(csi::values);
   public static final IntFunction<csi> f = ave.a(csi::a, values(), ave.a.a);
   public static final xq<ByteBuf, csi> g = xo.a(f, csi::a);
   private final String h;
   private final int i;

   private csi(String $$0, int $$1) {
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
