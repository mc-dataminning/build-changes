import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ctd implements axq {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<ctd> e = axq.a(ctd::values);
   public static final IntFunction<ctd> f = avn.a(ctd::a, values(), avn.a.a);
   public static final xs<ByteBuf, ctd> g = xq.a(f, ctd::a);
   private final String h;
   private final int i;

   private ctd(String $$0, int $$1) {
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
