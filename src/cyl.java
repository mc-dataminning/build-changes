import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cyl implements azu {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<cyl> e = azu.a(cyl::values);
   public static final IntFunction<cyl> f = axp.a(cyl::a, values(), axp.a.a);
   public static final zn<ByteBuf, cyl> g = zl.a(f, cyl::a);
   private final String h;
   private final int i;

   private cyl(final String $$0, final int $$1) {
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
