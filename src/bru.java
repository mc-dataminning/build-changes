import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bru extends brh<bpx> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bpp, Float> f;
   private final Function<bpp, Double> g;

   public bru(Function<bpp, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bru(Function<bpp, Float> $$0, Function<bpp, Double> $$1) {
      super(ac.a(() -> {
         Builder<bys<?>, byt> $$0x = ImmutableMap.builder();
         $$0x.put(bys.n, byt.c);
         $$0x.put(bys.m, byt.c);
         $$0x.put(bys.P, byt.b);
         $$0x.put(bys.R, byt.c);
         $$0x.put(bys.O, byt.a);
         $$0x.put(bys.r, byt.b);
         $$0x.put(bys.Z, byt.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bpx $$0) {
      return this.f.apply($$0);
   }

   private Optional<ciu> b(bpx $$0) {
      return $$0.dP().c(bys.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(apf $$0, bpx $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dP().a(bys.r) && !$$1.dP().a(bys.Z);
   }

   protected void b(apf $$0, bpx $$1, long $$2) {
      $$1.dP().a(bys.R, true);
   }

   protected void c(apf $$0, bpx $$1, long $$2) {
      bqq<?> $$3 = $$1.dP();
      $$3.a(bys.P, 100);
      $$3.a(bys.R, false);
      $$3.b(bys.m);
      $$3.b(bys.n);
   }

   protected void d(apf $$0, bpx $$1, long $$2) {
      ciu $$3 = this.b($$1).get();
      bqq<?> $$4 = $$1.dP();
      $$4.a(bys.n, new brs($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < aww.k($$5)) {
         $$4.b(bys.m);
      } else {
         $$4.a(bys.m, new byv(new brs($$3, false), this.a($$1), 2));
      }
   }
}
