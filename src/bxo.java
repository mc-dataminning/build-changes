import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bxo extends bxb<bvq> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bvi, Float> f;
   private final Function<bvi, Double> g;

   public bxo(Function<bvi, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bxo(Function<bvi, Float> $$0, Function<bvi, Double> $$1) {
      super(af.a(() -> {
         Builder<cem<?>, cen> $$0x = ImmutableMap.builder();
         $$0x.put(cem.n, cen.c);
         $$0x.put(cem.m, cen.c);
         $$0x.put(cem.P, cen.b);
         $$0x.put(cem.R, cen.c);
         $$0x.put(cem.O, cen.a);
         $$0x.put(cem.r, cen.b);
         $$0x.put(cem.Z, cen.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bvq $$0) {
      return this.f.apply($$0);
   }

   private Optional<coy> b(bvq $$0) {
      return $$0.eb().c(cem.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ard $$0, bvq $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.eb().a(cem.r) && !$$1.eb().a(cem.Z);
   }

   protected void b(ard $$0, bvq $$1, long $$2) {
      $$1.eb().a(cem.R, true);
   }

   protected void c(ard $$0, bvq $$1, long $$2) {
      bwk<?> $$3 = $$1.eb();
      $$3.a(cem.P, 100);
      $$3.a(cem.R, false);
      $$3.b(cem.m);
      $$3.b(cem.n);
   }

   protected void d(ard $$0, bvq $$1, long $$2) {
      coy $$3 = this.b($$1).get();
      bwk<?> $$4 = $$1.eb();
      $$4.a(cem.n, new bxm($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayz.k($$5)) {
         $$4.b(cem.m);
      } else {
         $$4.a(cem.m, new cep(new bxm($$3, false), this.a($$1), 2));
      }
   }
}
