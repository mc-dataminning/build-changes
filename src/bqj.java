import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bqj extends bpw<boo> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bog, Float> f;
   private final Function<bog, Double> g;

   public bqj(Function<bog, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bqj(Function<bog, Float> $$0, Function<bog, Double> $$1) {
      super(ac.a(() -> {
         Builder<bxh<?>, bxi> $$0x = ImmutableMap.builder();
         $$0x.put(bxh.n, bxi.c);
         $$0x.put(bxh.m, bxi.c);
         $$0x.put(bxh.P, bxi.b);
         $$0x.put(bxh.R, bxi.c);
         $$0x.put(bxh.O, bxi.a);
         $$0x.put(bxh.r, bxi.b);
         $$0x.put(bxh.Z, bxi.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(boo $$0) {
      return this.f.apply($$0);
   }

   private Optional<chh> b(boo $$0) {
      return $$0.dO().c(bxh.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aov $$0, boo $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dO().a(bxh.r) && !$$1.dO().a(bxh.Z);
   }

   protected void b(aov $$0, boo $$1, long $$2) {
      $$1.dO().a(bxh.R, true);
   }

   protected void c(aov $$0, boo $$1, long $$2) {
      bpf<?> $$3 = $$1.dO();
      $$3.a(bxh.P, 100);
      $$3.a(bxh.R, false);
      $$3.b(bxh.m);
      $$3.b(bxh.n);
   }

   protected void d(aov $$0, boo $$1, long $$2) {
      chh $$3 = this.b($$1).get();
      bpf<?> $$4 = $$1.dO();
      $$4.a(bxh.n, new bqh($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < awh.k($$5)) {
         $$4.b(bxh.m);
      } else {
         $$4.a(bxh.m, new bxk(new bqh($$3, false), this.a($$1), 2));
      }
   }
}
