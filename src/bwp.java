import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bwp extends bwc<bus> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<buk, Float> f;
   private final Function<buk, Double> g;

   public bwp(Function<buk, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bwp(Function<buk, Float> $$0, Function<buk, Double> $$1) {
      super(ad.a(() -> {
         Builder<cdn<?>, cdo> $$0x = ImmutableMap.builder();
         $$0x.put(cdn.n, cdo.c);
         $$0x.put(cdn.m, cdo.c);
         $$0x.put(cdn.P, cdo.b);
         $$0x.put(cdn.R, cdo.c);
         $$0x.put(cdn.O, cdo.a);
         $$0x.put(cdn.r, cdo.b);
         $$0x.put(cdn.Z, cdo.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bus $$0) {
      return this.f.apply($$0);
   }

   private Optional<cnu> b(bus $$0) {
      return $$0.dX().c(cdn.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arh $$0, bus $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dX().a(cdn.r) && !$$1.dX().a(cdn.Z);
   }

   protected void b(arh $$0, bus $$1, long $$2) {
      $$1.dX().a(cdn.R, true);
   }

   protected void c(arh $$0, bus $$1, long $$2) {
      bvl<?> $$3 = $$1.dX();
      $$3.a(cdn.P, 100);
      $$3.a(cdn.R, false);
      $$3.b(cdn.m);
      $$3.b(cdn.n);
   }

   protected void d(arh $$0, bus $$1, long $$2) {
      cnu $$3 = this.b($$1).get();
      bvl<?> $$4 = $$1.dX();
      $$4.a(cdn.n, new bwn($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azd.k($$5)) {
         $$4.b(cdn.m);
      } else {
         $$4.a(cdn.m, new cdq(new bwn($$3, false), this.a($$1), 2));
      }
   }
}
