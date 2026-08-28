import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dad implements bag {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dad> e = bag.a(dad::values);
   public static final IntFunction<dad> f = ayb.a(dad::a, values(), ayb.a.a);
   public static final zg<ByteBuf, dad> g = ze.a(f, dad::a);
   private final String h;
   private final int i;

   private dad(final String $$0, final int $$1) {
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
