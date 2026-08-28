import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.IntFunction;

public record aiq(iu b, aiq.a c, dza.a d) implements zf<agp> {
   public static final yw<wj, aiq> a = yw.a(iu.b, aiq::b, aiq.a.h, aiq::e, dza.a.b, aiq::f, aiq::new);

   public aiq(iu $$0, aiq.a $$1, Optional<alf<sr>> $$2, jz $$3, dsz $$4, boolean $$5) {
      this($$0, $$1, new dza.a($$2, $$3, $$4, $$5, dza.b.a, Optional.empty()));
   }

   @Override
   public zh<aiq> a() {
      return agn.cj;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public aiq.a e() {
      return this.c;
   }

   public dza.a f() {
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

      private static final IntFunction<aiq.a> i = ayc.a($$0 -> $$0.j, values(), ayc.a.a);
      public static final yw<ByteBuf, aiq.a> h = yu.a(i, $$0 -> $$0.j);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }
   }
}
