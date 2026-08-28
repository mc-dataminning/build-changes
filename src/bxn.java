import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bxn extends bxa<bvp> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bvh, Float> f;
   private final Function<bvh, Double> g;

   public bxn(Function<bvh, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bxn(Function<bvh, Float> $$0, Function<bvh, Double> $$1) {
      super(af.a(() -> {
         Builder<cel<?>, cem> $$0x = ImmutableMap.builder();
         $$0x.put(cel.n, cem.c);
         $$0x.put(cel.m, cem.c);
         $$0x.put(cel.P, cem.b);
         $$0x.put(cel.R, cem.c);
         $$0x.put(cel.O, cem.a);
         $$0x.put(cel.r, cem.b);
         $$0x.put(cel.Z, cem.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bvp $$0) {
      return this.f.apply($$0);
   }

   private Optional<cox> b(bvp $$0) {
      return $$0.eb().c(cel.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ard $$0, bvp $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.eb().a(cel.r) && !$$1.eb().a(cel.Z);
   }

   protected void b(ard $$0, bvp $$1, long $$2) {
      $$1.eb().a(cel.R, true);
   }

   protected void c(ard $$0, bvp $$1, long $$2) {
      bwj<?> $$3 = $$1.eb();
      $$3.a(cel.P, 100);
      $$3.a(cel.R, false);
      $$3.b(cel.m);
      $$3.b(cel.n);
   }

   protected void d(ard $$0, bvp $$1, long $$2) {
      cox $$3 = this.b($$1).get();
      bwj<?> $$4 = $$1.eb();
      $$4.a(cel.n, new bxl($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayz.k($$5)) {
         $$4.b(cel.m);
      } else {
         $$4.a(cel.m, new ceo(new bxl($$3, false), this.a($$1), 2));
      }
   }
}
