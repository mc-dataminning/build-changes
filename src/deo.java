import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum deo implements bax {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<deo> e = bax.a(deo::values);
   public static final IntFunction<deo> f = ayo.a(deo::a, values(), ayo.a.a);
   public static final ze<ByteBuf, deo> g = zc.a(f, deo::a);
   private final String h;
   private final int i;

   private deo(final String $$0, final int $$1) {
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
