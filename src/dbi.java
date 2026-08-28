import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dbi implements baq {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dbi> e = baq.a(dbi::values);
   public static final IntFunction<dbi> f = ayl.a(dbi::a, values(), ayl.a.a);
   public static final zi<ByteBuf, dbi> g = zg.a(f, dbi::a);
   private final String h;
   private final int i;

   private dbi(final String $$0, final int $$1) {
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
