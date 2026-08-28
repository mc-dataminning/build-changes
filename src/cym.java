import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cym implements azj {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cym> e = azj.a(cym::values);
   public static final IntFunction<cym> f = axd.a(cym::a, values(), axd.a.a);
   public static final yw<ByteBuf, cym> g = yu.a(f, cym::a);
   private final String h;
   private final int i;

   private cym(final String $$0, final int $$1) {
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
