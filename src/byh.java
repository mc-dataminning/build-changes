import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class byh extends bxu<bwj> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bwb, Float> f;
   private final Function<bwb, Double> g;

   public byh(Function<bwb, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public byh(Function<bwb, Float> $$0, Function<bwb, Double> $$1) {
      super(ae.a(() -> {
         Builder<cff<?>, cfg> $$0x = ImmutableMap.builder();
         $$0x.put(cff.n, cfg.c);
         $$0x.put(cff.m, cfg.c);
         $$0x.put(cff.P, cfg.b);
         $$0x.put(cff.R, cfg.c);
         $$0x.put(cff.O, cfg.a);
         $$0x.put(cff.r, cfg.b);
         $$0x.put(cff.Z, cfg.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bwj $$0) {
      return this.f.apply($$0);
   }

   private Optional<cps> b(bwj $$0) {
      return $$0.eb().c(cff.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ash $$0, bwj $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.eb().a(cff.r) && !$$1.eb().a(cff.Z);
   }

   protected void b(ash $$0, bwj $$1, long $$2) {
      $$1.eb().a(cff.R, true);
   }

   protected void c(ash $$0, bwj $$1, long $$2) {
      bxd<?> $$3 = $$1.eb();
      $$3.a(cff.P, 100);
      $$3.a(cff.R, false);
      $$3.b(cff.m);
      $$3.b(cff.n);
   }

   protected void d(ash $$0, bwj $$1, long $$2) {
      cps $$3 = this.b($$1).get();
      bxd<?> $$4 = $$1.eb();
      $$4.a(cff.n, new byf($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < bae.k($$5)) {
         $$4.b(cff.m);
      } else {
         $$4.a(cff.m, new cfi(new byf($$3, false), this.a($$1), 2));
      }
   }
}
