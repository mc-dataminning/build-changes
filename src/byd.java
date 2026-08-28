import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class byd extends bxq<bwf> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bvx, Float> f;
   private final Function<bvx, Double> g;

   public byd(Function<bvx, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public byd(Function<bvx, Float> $$0, Function<bvx, Double> $$1) {
      super(ae.a(() -> {
         Builder<cfb<?>, cfc> $$0x = ImmutableMap.builder();
         $$0x.put(cfb.n, cfc.c);
         $$0x.put(cfb.m, cfc.c);
         $$0x.put(cfb.P, cfc.b);
         $$0x.put(cfb.R, cfc.c);
         $$0x.put(cfb.O, cfc.a);
         $$0x.put(cfb.r, cfc.b);
         $$0x.put(cfb.Z, cfc.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bwf $$0) {
      return this.f.apply($$0);
   }

   private Optional<cpo> b(bwf $$0) {
      return $$0.ec().c(cfb.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arx $$0, bwf $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ec().a(cfb.r) && !$$1.ec().a(cfb.Z);
   }

   protected void b(arx $$0, bwf $$1, long $$2) {
      $$1.ec().a(cfb.R, true);
   }

   protected void c(arx $$0, bwf $$1, long $$2) {
      bwz<?> $$3 = $$1.ec();
      $$3.a(cfb.P, 100);
      $$3.a(cfb.R, false);
      $$3.b(cfb.m);
      $$3.b(cfb.n);
   }

   protected void d(arx $$0, bwf $$1, long $$2) {
      cpo $$3 = this.b($$1).get();
      bwz<?> $$4 = $$1.ec();
      $$4.a(cfb.n, new byb($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azu.k($$5)) {
         $$4.b(cfb.m);
      } else {
         $$4.a(cfb.m, new cfe(new byb($$3, false), this.a($$1), 2));
      }
   }
}
