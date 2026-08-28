import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.IntFunction;

public record ajb(iw b, ajb.a c, eaj.a d) implements zo<aha> {
   public static final ze<wp, ajb> a = ze.a(iw.b, ajb::b, ajb.a.h, ajb::e, eaj.a.b, ajb::f, ajb::new);

   public ajb(iw $$0, ajb.a $$1, Optional<alq<ss>> $$2, kb $$3, dui $$4, boolean $$5) {
      this($$0, $$1, new eaj.a($$2, $$3, $$4, $$5, eaj.b.a, Optional.empty()));
   }

   @Override
   public zq<ajb> a() {
      return agy.cj;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public ajb.a e() {
      return this.c;
   }

   public eaj.a f() {
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

      private static final IntFunction<ajb.a> i = ayo.a($$0 -> $$0.j, values(), ayo.a.a);
      public static final ze<ByteBuf, ajb.a> h = zc.a(i, $$0 -> $$0.j);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }
   }
}
