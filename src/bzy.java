import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bzy extends bzl<byc> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bxu, Float> f;
   private final Function<bxu, Double> g;

   public bzy(Function<bxu, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bzy(Function<bxu, Float> $$0, Function<bxu, Double> $$1) {
      super(ag.a(() -> {
         Builder<cgw<?>, cgx> $$0x = ImmutableMap.builder();
         $$0x.put(cgw.o, cgx.c);
         $$0x.put(cgw.n, cgx.c);
         $$0x.put(cgw.Q, cgx.b);
         $$0x.put(cgw.S, cgx.c);
         $$0x.put(cgw.P, cgx.a);
         $$0x.put(cgw.s, cgx.b);
         $$0x.put(cgw.aa, cgx.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(byc $$0) {
      return this.f.apply($$0);
   }

   private Optional<crx> b(byc $$0) {
      return $$0.ec().c(cgw.P);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ars $$0, byc $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ec().a(cgw.s) && !$$1.ec().a(cgw.aa);
   }

   protected void b(ars $$0, byc $$1, long $$2) {
      $$1.ec().a(cgw.S, true);
   }

   protected void c(ars $$0, byc $$1, long $$2) {
      byu<?> $$3 = $$1.ec();
      $$3.a(cgw.Q, 100);
      $$3.a(cgw.S, false);
      $$3.b(cgw.n);
      $$3.b(cgw.o);
   }

   protected void d(ars $$0, byc $$1, long $$2) {
      crx $$3 = this.b($$1).get();
      byu<?> $$4 = $$1.ec();
      $$4.a(cgw.o, new bzw($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azo.k($$5)) {
         $$4.b(cgw.n);
      } else {
         $$4.a(cgw.n, new cgz(new bzw($$3, false), this.a($$1), 2));
      }
   }
}
