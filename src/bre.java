import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum bre {
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

   public static final IntFunction<bre> s = awd.a(bre::a, values(), awd.a.a);
   public static final yg<ByteBuf, bre> t = ye.a(s, bre::a);
   private final int u;

   private bre(int $$0) {
      this.u = $$0;
   }

   public int a() {
      return this.u;
   }
}
