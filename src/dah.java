import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dah implements baj {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dah> e = baj.a(dah::values);
   public static final IntFunction<dah> f = aye.a(dah::a, values(), aye.a.a);
   public static final zj<ByteBuf, dah> g = zh.a(f, dah::a);
   private final String h;
   private final int i;

   private dah(final String $$0, final int $$1) {
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
