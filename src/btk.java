import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum btk {
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

   public static final IntFunction<btk> s = awu.a(btk::a, values(), awu.a.a);
   public static final ys<ByteBuf, btk> t = yq.a(s, btk::a);
   private final int u;

   private btk(final int $$0) {
      this.u = $$0;
   }

   public int a() {
      return this.u;
   }
}
