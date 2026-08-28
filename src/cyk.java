import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cyk implements azt {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cyk> e = azt.a(cyk::values);
   public static final IntFunction<cyk> f = axo.a(cyk::a, values(), axo.a.a);
   public static final zm<ByteBuf, cyk> g = zk.a(f, cyk::a);
   private final String h;
   private final int i;

   private cyk(final String $$0, final int $$1) {
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
