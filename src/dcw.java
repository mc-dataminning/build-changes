import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dcw implements bai {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dcw> e = bai.a(dcw::values);
   public static final IntFunction<dcw> f = aya.a(dcw::a, values(), aya.a.a);
   public static final yu<ByteBuf, dcw> g = ys.a(f, dcw::a);
   private final String h;
   private final int i;

   private dcw(final String $$0, final int $$1) {
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
