import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dby implements bag {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dby> e = bag.a(dby::values);
   public static final IntFunction<dby> f = aya.a(dby::a, values(), aya.a.a);
   public static final yt<ByteBuf, dby> g = yr.a(f, dby::a);
   private final String h;
   private final int i;

   private dby(final String $$0, final int $$1) {
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
