import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.IntFunction;

public record aiu(iw b, aiu.a c, dzz.a d) implements zj<agt> {
   public static final za<wn, aiu> a = za.a(iw.b, aiu::b, aiu.a.h, aiu::e, dzz.a.b, aiu::f, aiu::new);

   public aiu(iw $$0, aiu.a $$1, Optional<alj<ss>> $$2, kb $$3, dty $$4, boolean $$5) {
      this($$0, $$1, new dzz.a($$2, $$3, $$4, $$5, dzz.b.a, Optional.empty()));
   }

   @Override
   public zl<aiu> a() {
      return agr.cj;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public aiu.a e() {
      return this.c;
   }

   public dzz.a f() {
      return this.d;
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      private static final IntFunction<aiu.a> i = ayg.a($$0 -> $$0.j, values(), ayg.a.a);
      public static final za<ByteBuf, aiu.a> h = yy.a(i, $$0 -> $$0.j);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }
   }
}
