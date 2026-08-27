import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class buw extends buj<bsz> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bsq, Float> f;
   private final Function<bsq, Double> g;

   public buw(Function<bsq, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public buw(Function<bsq, Float> $$0, Function<bsq, Double> $$1) {
      super(ac.a(() -> {
         Builder<cbu<?>, cbv> $$0x = ImmutableMap.builder();
         $$0x.put(cbu.n, cbv.c);
         $$0x.put(cbu.m, cbv.c);
         $$0x.put(cbu.P, cbv.b);
         $$0x.put(cbu.R, cbv.c);
         $$0x.put(cbu.O, cbv.a);
         $$0x.put(cbu.r, cbv.b);
         $$0x.put(cbu.Z, cbv.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bsz $$0) {
      return this.f.apply($$0);
   }

   private Optional<cly> b(bsz $$0) {
      return $$0.dS().c(cbu.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aqn $$0, bsz $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dS().a(cbu.r) && !$$1.dS().a(cbu.Z);
   }

   protected void b(aqn $$0, bsz $$1, long $$2) {
      $$1.dS().a(cbu.R, true);
   }

   protected void c(aqn $$0, bsz $$1, long $$2) {
      bts<?> $$3 = $$1.dS();
      $$3.a(cbu.P, 100);
      $$3.a(cbu.R, false);
      $$3.b(cbu.m);
      $$3.b(cbu.n);
   }

   protected void d(aqn $$0, bsz $$1, long $$2) {
      cly $$3 = this.b($$1).get();
      bts<?> $$4 = $$1.dS();
      $$4.a(cbu.n, new buu($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayf.k($$5)) {
         $$4.b(cbu.m);
      } else {
         $$4.a(cbu.m, new cbx(new buu($$3, false), this.a($$1), 2));
      }
   }
}
