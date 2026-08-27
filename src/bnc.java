import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bnc extends bmp<blh> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bky, Float> f;
   private final Function<bky, Double> g;

   public bnc(Function<bky, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bnc(Function<bky, Float> $$0, Function<bky, Double> $$1) {
      super(ac.a(() -> {
         Builder<btz<?>, bua> $$0x = ImmutableMap.builder();
         $$0x.put(btz.n, bua.c);
         $$0x.put(btz.m, bua.c);
         $$0x.put(btz.O, bua.b);
         $$0x.put(btz.Q, bua.c);
         $$0x.put(btz.N, bua.a);
         $$0x.put(btz.r, bua.b);
         $$0x.put(btz.Y, bua.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(blh $$0) {
      return this.f.apply($$0);
   }

   private Optional<cdm> b(blh $$0) {
      return $$0.dN().c(btz.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ama $$0, blh $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dN().a(btz.r) && !$$1.dN().a(btz.Y);
   }

   protected void b(ama $$0, blh $$1, long $$2) {
      $$1.dN().a(btz.Q, true);
   }

   protected void c(ama $$0, blh $$1, long $$2) {
      bly<?> $$3 = $$1.dN();
      $$3.a(btz.O, 100);
      $$3.a(btz.Q, false);
      $$3.b(btz.m);
      $$3.b(btz.n);
   }

   protected void d(ama $$0, blh $$1, long $$2) {
      cdm $$3 = this.b($$1).get();
      bly<?> $$4 = $$1.dN();
      $$4.a(btz.n, new bna($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < ati.k($$5)) {
         $$4.b(btz.m);
      } else {
         $$4.a(btz.m, new buc(new bna($$3, false), this.a($$1), 2));
      }
   }
}
