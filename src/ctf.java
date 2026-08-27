import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ctf implements axq {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<ctf> e = axq.a(ctf::values);
   public static final IntFunction<ctf> f = avn.a(ctf::a, values(), avn.a.a);
   public static final xs<ByteBuf, ctf> g = xq.a(f, ctf::a);
   private final String h;
   private final int i;

   private ctf(String $$0, int $$1) {
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
