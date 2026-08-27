import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class blq extends bld<bjv> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bjm, Float> f;
   private final Function<bjm, Double> g;

   public blq(Function<bjm, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public blq(Function<bjm, Float> $$0, Function<bjm, Double> $$1) {
      super(ac.a(() -> {
         Builder<bsn<?>, bso> $$0x = ImmutableMap.builder();
         $$0x.put(bsn.n, bso.c);
         $$0x.put(bsn.m, bso.c);
         $$0x.put(bsn.O, bso.b);
         $$0x.put(bsn.Q, bso.c);
         $$0x.put(bsn.N, bso.a);
         $$0x.put(bsn.r, bso.b);
         $$0x.put(bsn.Y, bso.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bjv $$0) {
      return this.f.apply($$0);
   }

   private Optional<cca> b(bjv $$0) {
      return $$0.dN().c(bsn.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(akt $$0, bjv $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dN().a(bsn.r) && !$$1.dN().a(bsn.Y);
   }

   protected void b(akt $$0, bjv $$1, long $$2) {
      $$1.dN().a(bsn.Q, true);
   }

   protected void c(akt $$0, bjv $$1, long $$2) {
      bkm<?> $$3 = $$1.dN();
      $$3.a(bsn.O, 100);
      $$3.a(bsn.Q, false);
      $$3.b(bsn.m);
      $$3.b(bsn.n);
   }

   protected void d(akt $$0, bjv $$1, long $$2) {
      cca $$3 = this.b($$1).get();
      bkm<?> $$4 = $$1.dN();
      $$4.a(bsn.n, new blo($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < asb.k($$5)) {
         $$4.b(bsn.m);
      } else {
         $$4.a(bsn.m, new bsq(new blo($$3, false), this.a($$1), 2));
      }
   }
}
