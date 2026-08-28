import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.IntFunction;

public record ais(iv b, ais.a c, dzx.a d) implements zh<agr> {
   public static final yy<wl, ais> a = yy.a(iv.b, ais::b, ais.a.h, ais::e, dzx.a.b, ais::f, ais::new);

   public ais(iv $$0, ais.a $$1, Optional<alh<sr>> $$2, ka $$3, dtw $$4, boolean $$5) {
      this($$0, $$1, new dzx.a($$2, $$3, $$4, $$5, dzx.b.a, Optional.empty()));
   }

   @Override
   public zj<ais> a() {
      return agp.cj;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public ais.a e() {
      return this.c;
   }

   public dzx.a f() {
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

      private static final IntFunction<ais.a> i = aye.a($$0 -> $$0.j, values(), aye.a.a);
      public static final yy<ByteBuf, ais.a> h = yw.a(i, $$0 -> $$0.j);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }
   }
}
