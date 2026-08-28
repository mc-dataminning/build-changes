import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dec implements bam {
   a("building", 0),
   b("redstone", 1),
   c("equipment", 2),
   d("misc", 3);

   public static final Codec<dec> e = bam.a(dec::values);
   public static final IntFunction<dec> f = aye.a(dec::a, values(), aye.a.a);
   public static final yy<ByteBuf, dec> g = yw.a(f, dec::a);
   private final String h;
   private final int i;

   private dec(final String $$0, final int $$1) {
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
