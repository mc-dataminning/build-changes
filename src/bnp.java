import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bnp extends bnc<blu> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bll, Float> f;
   private final Function<bll, Double> g;

   public bnp(Function<bll, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bnp(Function<bll, Float> $$0, Function<bll, Double> $$1) {
      super(ac.a(() -> {
         Builder<bum<?>, bun> $$0x = ImmutableMap.builder();
         $$0x.put(bum.n, bun.c);
         $$0x.put(bum.m, bun.c);
         $$0x.put(bum.O, bun.b);
         $$0x.put(bum.Q, bun.c);
         $$0x.put(bum.N, bun.a);
         $$0x.put(bum.r, bun.b);
         $$0x.put(bum.Y, bun.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(blu $$0) {
      return this.f.apply($$0);
   }

   private Optional<cdz> b(blu $$0) {
      return $$0.dP().c(bum.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ami $$0, blu $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dP().a(bum.r) && !$$1.dP().a(bum.Y);
   }

   protected void b(ami $$0, blu $$1, long $$2) {
      $$1.dP().a(bum.Q, true);
   }

   protected void c(ami $$0, blu $$1, long $$2) {
      bml<?> $$3 = $$1.dP();
      $$3.a(bum.O, 100);
      $$3.a(bum.Q, false);
      $$3.b(bum.m);
      $$3.b(bum.n);
   }

   protected void d(ami $$0, blu $$1, long $$2) {
      cdz $$3 = this.b($$1).get();
      bml<?> $$4 = $$1.dP();
      $$4.a(bum.n, new bnn($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < atq.k($$5)) {
         $$4.b(bum.m);
      } else {
         $$4.a(bum.m, new bup(new bnn($$3, false), this.a($$1), 2));
      }
   }
}
