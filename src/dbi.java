import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum dbi implements dcb {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4),
   f(5),
   g(6),
   h(7),
   i(8),
   j(9),
   k(10),
   l(11),
   m(12);

   public static final IntFunction<dbi> n = ayv.a($$0 -> $$0.p, values(), ayv.a.a);
   public static final zt<ByteBuf, dbi> o = zr.a(n, $$0 -> $$0.p);
   private final int p;

   private dbi(final int $$0) {
      this.p = $$0;
   }
}
