import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum bua {
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
   m(12),
   n(13),
   o(14),
   p(15),
   q(16),
   r(17);

   public static final IntFunction<bua> s = axe.a(bua::a, values(), axe.a.a);
   public static final yx<ByteBuf, bua> t = yv.a(s, bua::a);
   private final int u;

   private bua(final int $$0) {
      this.u = $$0;
   }

   public int a() {
      return this.u;
   }
}
