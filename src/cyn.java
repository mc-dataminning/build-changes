import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cyn implements azu {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cyn> e = azu.a(cyn::values);
   public static final IntFunction<cyn> f = axp.a(cyn::a, values(), axp.a.a);
   public static final zn<ByteBuf, cyn> g = zl.a(f, cyn::a);
   private final String h;
   private final int i;

   private cyn(final String $$0, final int $$1) {
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
