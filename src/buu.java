import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class buu extends buh<bsx> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bso, Float> f;
   private final Function<bso, Double> g;

   public buu(Function<bso, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public buu(Function<bso, Float> $$0, Function<bso, Double> $$1) {
      super(ac.a(() -> {
         Builder<cbs<?>, cbt> $$0x = ImmutableMap.builder();
         $$0x.put(cbs.n, cbt.c);
         $$0x.put(cbs.m, cbt.c);
         $$0x.put(cbs.P, cbt.b);
         $$0x.put(cbs.R, cbt.c);
         $$0x.put(cbs.O, cbt.a);
         $$0x.put(cbs.r, cbt.b);
         $$0x.put(cbs.Z, cbt.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bsx $$0) {
      return this.f.apply($$0);
   }

   private Optional<clw> b(bsx $$0) {
      return $$0.dS().c(cbs.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aqm $$0, bsx $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dS().a(cbs.r) && !$$1.dS().a(cbs.Z);
   }

   protected void b(aqm $$0, bsx $$1, long $$2) {
      $$1.dS().a(cbs.R, true);
   }

   protected void c(aqm $$0, bsx $$1, long $$2) {
      btq<?> $$3 = $$1.dS();
      $$3.a(cbs.P, 100);
      $$3.a(cbs.R, false);
      $$3.b(cbs.m);
      $$3.b(cbs.n);
   }

   protected void d(aqm $$0, bsx $$1, long $$2) {
      clw $$3 = this.b($$1).get();
      btq<?> $$4 = $$1.dS();
      $$4.a(cbs.n, new bus($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayd.k($$5)) {
         $$4.b(cbs.m);
      } else {
         $$4.a(cbs.m, new cbv(new bus($$3, false), this.a($$1), 2));
      }
   }
}
