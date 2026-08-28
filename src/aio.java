import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.IntFunction;

public record aio(iu b, aio.a c, dyi.a d) implements zd<agn> {
   public static final yu<wh, aio> a = yu.a(iu.b, aio::b, aio.a.h, aio::e, dyi.a.b, aio::f, aio::new);

   public aio(iu $$0, aio.a $$1, Optional<ald<sq>> $$2, jz $$3, dsm $$4, boolean $$5) {
      this($$0, $$1, new dyi.a($$2, $$3, $$4, $$5, dyi.b.a, Optional.empty()));
   }

   @Override
   public zf<aio> a() {
      return agl.cj;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public aio.a e() {
      return this.c;
   }

   public dyi.a f() {
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

      private static final IntFunction<aio.a> i = aya.a($$0 -> $$0.j, values(), aya.a.a);
      public static final yu<ByteBuf, aio.a> h = ys.a(i, $$0 -> $$0.j);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }
   }
}
