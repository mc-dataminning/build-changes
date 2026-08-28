import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum ckw implements bag {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<ckw> h = bag.a(ckw::values);
   private static final IntFunction<ckw> j = aya.a(ckw::a, values(), aya.a.b);
   public static final yt<ByteBuf, ckw> i = yr.a(j, ckw::a);
   private final int k;
   private final String l;

   private ckw(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public int a() {
      return this.k;
   }

   public static ckw a(int $$0) {
      return j.apply($$0);
   }

   @Override
   public String c() {
      return this.l;
   }
}
