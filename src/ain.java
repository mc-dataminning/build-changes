import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.IntFunction;

public record ain(jj b, ain.a c, dxg.a d) implements zc<agm> {
   public static final yt<wg, ain> a = yt.a(jj.b, ain::b, ain.a.h, ain::e, dxg.a.b, ain::f, ain::new);

   public ain(jj $$0, ain.a $$1, Optional<alc<sp>> $$2, kn $$3, drm $$4, boolean $$5) {
      this($$0, $$1, new dxg.a($$2, $$3, $$4, $$5, dxg.b.a, Optional.empty()));
   }

   @Override
   public ze<ain> a() {
      return agk.cj;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public ain.a e() {
      return this.c;
   }

   public dxg.a f() {
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

      private static final IntFunction<ain.a> i = aya.a($$0 -> $$0.j, values(), aya.a.a);
      public static final yt<ByteBuf, ain.a> h = yr.a(i, $$0 -> $$0.j);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }
   }
}
