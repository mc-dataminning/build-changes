import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bws extends bwf<buv> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bun, Float> f;
   private final Function<bun, Double> g;

   public bws(Function<bun, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bws(Function<bun, Float> $$0, Function<bun, Double> $$1) {
      super(ad.a(() -> {
         Builder<cdq<?>, cdr> $$0x = ImmutableMap.builder();
         $$0x.put(cdq.n, cdr.c);
         $$0x.put(cdq.m, cdr.c);
         $$0x.put(cdq.P, cdr.b);
         $$0x.put(cdq.R, cdr.c);
         $$0x.put(cdq.O, cdr.a);
         $$0x.put(cdq.r, cdr.b);
         $$0x.put(cdq.Z, cdr.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(buv $$0) {
      return this.f.apply($$0);
   }

   private Optional<cnx> b(buv $$0) {
      return $$0.dY().c(cdq.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arj $$0, buv $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dY().a(cdq.r) && !$$1.dY().a(cdq.Z);
   }

   protected void b(arj $$0, buv $$1, long $$2) {
      $$1.dY().a(cdq.R, true);
   }

   protected void c(arj $$0, buv $$1, long $$2) {
      bvo<?> $$3 = $$1.dY();
      $$3.a(cdq.P, 100);
      $$3.a(cdq.R, false);
      $$3.b(cdq.m);
      $$3.b(cdq.n);
   }

   protected void d(arj $$0, buv $$1, long $$2) {
      cnx $$3 = this.b($$1).get();
      bvo<?> $$4 = $$1.dY();
      $$4.a(cdq.n, new bwq($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azf.k($$5)) {
         $$4.b(cdq.m);
      } else {
         $$4.a(cdq.m, new cdt(new bwq($$3, false), this.a($$1), 2));
      }
   }
}
