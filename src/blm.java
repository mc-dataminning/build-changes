import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class blm extends bkz<bjr> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bji, Float> f;
   private final Function<bji, Double> g;

   public blm(Function<bji, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public blm(Function<bji, Float> $$0, Function<bji, Double> $$1) {
      super(ac.a(() -> {
         Builder<bsj<?>, bsk> $$0x = ImmutableMap.builder();
         $$0x.put(bsj.n, bsk.c);
         $$0x.put(bsj.m, bsk.c);
         $$0x.put(bsj.O, bsk.b);
         $$0x.put(bsj.Q, bsk.c);
         $$0x.put(bsj.N, bsk.a);
         $$0x.put(bsj.r, bsk.b);
         $$0x.put(bsj.Y, bsk.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bjr $$0) {
      return this.f.apply($$0);
   }

   private Optional<cbw> b(bjr $$0) {
      return $$0.dN().c(bsj.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aks $$0, bjr $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dN().a(bsj.r) && !$$1.dN().a(bsj.Y);
   }

   protected void b(aks $$0, bjr $$1, long $$2) {
      $$1.dN().a(bsj.Q, true);
   }

   protected void c(aks $$0, bjr $$1, long $$2) {
      bki<?> $$3 = $$1.dN();
      $$3.a(bsj.O, 100);
      $$3.a(bsj.Q, false);
      $$3.b(bsj.m);
      $$3.b(bsj.n);
   }

   protected void d(aks $$0, bjr $$1, long $$2) {
      cbw $$3 = this.b($$1).get();
      bki<?> $$4 = $$1.dN();
      $$4.a(bsj.n, new blk($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < ary.k($$5)) {
         $$4.b(bsj.m);
      } else {
         $$4.a(bsj.m, new bsm(new blk($$3, false), this.a($$1), 2));
      }
   }
}
