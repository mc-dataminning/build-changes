import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cmc implements bam {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<cmc> h = bam.a(cmc::values);
   private static final IntFunction<cmc> j = aye.a(cmc::a, values(), aye.a.b);
   public static final yy<ByteBuf, cmc> i = yw.a(j, cmc::a);
   private final int k;
   private final String l;

   private cmc(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public int a() {
      return this.k;
   }

   public static cmc a(int $$0) {
      return j.apply($$0);
   }

   @Override
   public String c() {
      return this.l;
   }
}
