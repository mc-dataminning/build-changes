import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bqn extends bqa<boq> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<boi, Float> f;
   private final Function<boi, Double> g;

   public bqn(Function<boi, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bqn(Function<boi, Float> $$0, Function<boi, Double> $$1) {
      super(ac.a(() -> {
         Builder<bxl<?>, bxm> $$0x = ImmutableMap.builder();
         $$0x.put(bxl.n, bxm.c);
         $$0x.put(bxl.m, bxm.c);
         $$0x.put(bxl.P, bxm.b);
         $$0x.put(bxl.R, bxm.c);
         $$0x.put(bxl.O, bxm.a);
         $$0x.put(bxl.r, bxm.b);
         $$0x.put(bxl.Z, bxm.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(boq $$0) {
      return this.f.apply($$0);
   }

   private Optional<chl> b(boq $$0) {
      return $$0.dO().c(bxl.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aow $$0, boq $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dO().a(bxl.r) && !$$1.dO().a(bxl.Z);
   }

   protected void b(aow $$0, boq $$1, long $$2) {
      $$1.dO().a(bxl.R, true);
   }

   protected void c(aow $$0, boq $$1, long $$2) {
      bpj<?> $$3 = $$1.dO();
      $$3.a(bxl.P, 100);
      $$3.a(bxl.R, false);
      $$3.b(bxl.m);
      $$3.b(bxl.n);
   }

   protected void d(aow $$0, boq $$1, long $$2) {
      chl $$3 = this.b($$1).get();
      bpj<?> $$4 = $$1.dO();
      $$4.a(bxl.n, new bql($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < awi.k($$5)) {
         $$4.b(bxl.m);
      } else {
         $$4.a(bxl.m, new bxo(new bql($$3, false), this.a($$1), 2));
      }
   }
}
