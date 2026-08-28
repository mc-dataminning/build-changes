import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum deb implements bam {
   a(0, "food"),
   b(1, "blocks"),
   c(2, "misc");

   private static final IntFunction<deb> f = aye.a($$0 -> $$0.g, values(), aye.a.a);
   public static final Codec<deb> d = bam.a(deb::values);
   public static final yy<ByteBuf, deb> e = yw.a(f, $$0 -> $$0.g);
   private final int g;
   private final String h;

   private deb(final int $$0, final String $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }
}
