import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dau implements bam {
   a(0, "common", o.p),
   b(1, "uncommon", o.o),
   c(2, "rare", o.l),
   d(3, "epic", o.n);

   public static final Codec<dau> e = bam.b(dau::values);
   public static final IntFunction<dau> f = aye.a($$0 -> $$0.h, values(), aye.a.a);
   public static final yy<ByteBuf, dau> g = yw.a(f, $$0 -> $$0.h);
   private final int h;
   private final String i;
   private final o j;

   private dau(final int $$0, final String $$1, final o $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public o a() {
      return this.j;
   }

   @Override
   public String c() {
      return this.i;
   }
}
