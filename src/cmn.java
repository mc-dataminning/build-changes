import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum cmn implements bax {
   a(0, "white"),
   b(1, "creamy"),
   c(2, "chestnut"),
   d(3, "brown"),
   e(4, "black"),
   f(5, "gray"),
   g(6, "dark_brown");

   public static final Codec<cmn> h = bax.a(cmn::values);
   private static final IntFunction<cmn> j = ayo.a(cmn::a, values(), ayo.a.b);
   public static final ze<ByteBuf, cmn> i = zc.a(j, cmn::a);
   private final int k;
   private final String l;

   private cmn(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public int a() {
      return this.k;
   }

   public static cmn a(int $$0) {
      return j.apply($$0);
   }

   @Override
   public String c() {
      return this.l;
   }
}
