import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class boo extends bob<bmt> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bmk, Float> f;
   private final Function<bmk, Double> g;

   public boo(Function<bmk, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public boo(Function<bmk, Float> $$0, Function<bmk, Double> $$1) {
      super(ac.a(() -> {
         Builder<bvm<?>, bvn> $$0x = ImmutableMap.builder();
         $$0x.put(bvm.n, bvn.c);
         $$0x.put(bvm.m, bvn.c);
         $$0x.put(bvm.O, bvn.b);
         $$0x.put(bvm.Q, bvn.c);
         $$0x.put(bvm.N, bvn.a);
         $$0x.put(bvm.r, bvn.b);
         $$0x.put(bvm.Y, bvn.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bmt $$0) {
      return this.f.apply($$0);
   }

   private Optional<cfh> b(bmt $$0) {
      return $$0.dO().c(bvm.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(and $$0, bmt $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dO().a(bvm.r) && !$$1.dO().a(bvm.Y);
   }

   protected void b(and $$0, bmt $$1, long $$2) {
      $$1.dO().a(bvm.Q, true);
   }

   protected void c(and $$0, bmt $$1, long $$2) {
      bnk<?> $$3 = $$1.dO();
      $$3.a(bvm.O, 100);
      $$3.a(bvm.Q, false);
      $$3.b(bvm.m);
      $$3.b(bvm.n);
   }

   protected void d(and $$0, bmt $$1, long $$2) {
      cfh $$3 = this.b($$1).get();
      bnk<?> $$4 = $$1.dO();
      $$4.a(bvm.n, new bom($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < aun.k($$5)) {
         $$4.b(bvm.m);
      } else {
         $$4.a(bvm.m, new bvp(new bom($$3, false), this.a($$1), 2));
      }
   }
}
