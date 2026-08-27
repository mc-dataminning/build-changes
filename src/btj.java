import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class btj extends bsw<brm> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bre, Float> f;
   private final Function<bre, Double> g;

   public btj(Function<bre, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public btj(Function<bre, Float> $$0, Function<bre, Double> $$1) {
      super(ac.a(() -> {
         Builder<cah<?>, cai> $$0x = ImmutableMap.builder();
         $$0x.put(cah.n, cai.c);
         $$0x.put(cah.m, cai.c);
         $$0x.put(cah.P, cai.b);
         $$0x.put(cah.R, cai.c);
         $$0x.put(cah.O, cai.a);
         $$0x.put(cah.r, cai.b);
         $$0x.put(cah.Z, cai.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(brm $$0) {
      return this.f.apply($$0);
   }

   private Optional<ckl> b(brm $$0) {
      return $$0.dQ().c(cah.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aqe $$0, brm $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dQ().a(cah.r) && !$$1.dQ().a(cah.Z);
   }

   protected void b(aqe $$0, brm $$1, long $$2) {
      $$1.dQ().a(cah.R, true);
   }

   protected void c(aqe $$0, brm $$1, long $$2) {
      bsf<?> $$3 = $$1.dQ();
      $$3.a(cah.P, 100);
      $$3.a(cah.R, false);
      $$3.b(cah.m);
      $$3.b(cah.n);
   }

   protected void d(aqe $$0, brm $$1, long $$2) {
      ckl $$3 = this.b($$1).get();
      bsf<?> $$4 = $$1.dQ();
      $$4.a(cah.n, new bth($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < axw.k($$5)) {
         $$4.b(cah.m);
      } else {
         $$4.a(cah.m, new cak(new bth($$3, false), this.a($$1), 2));
      }
   }
}
