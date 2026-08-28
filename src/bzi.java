import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bzi extends byv<bxm> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bxe, Float> f;
   private final Function<bxe, Double> g;

   public bzi(Function<bxe, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bzi(Function<bxe, Float> $$0, Function<bxe, Double> $$1) {
      super(af.a(() -> {
         Builder<cgg<?>, cgh> $$0x = ImmutableMap.builder();
         $$0x.put(cgg.o, cgh.c);
         $$0x.put(cgg.n, cgh.c);
         $$0x.put(cgg.Q, cgh.b);
         $$0x.put(cgg.S, cgh.c);
         $$0x.put(cgg.P, cgh.a);
         $$0x.put(cgg.s, cgh.b);
         $$0x.put(cgg.aa, cgh.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bxm $$0) {
      return this.f.apply($$0);
   }

   private Optional<crc> b(bxm $$0) {
      return $$0.ec().c(cgg.P);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arq $$0, bxm $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ec().a(cgg.s) && !$$1.ec().a(cgg.aa);
   }

   protected void b(arq $$0, bxm $$1, long $$2) {
      $$1.ec().a(cgg.S, true);
   }

   protected void c(arq $$0, bxm $$1, long $$2) {
      bye<?> $$3 = $$1.ec();
      $$3.a(cgg.Q, 100);
      $$3.a(cgg.S, false);
      $$3.b(cgg.n);
      $$3.b(cgg.o);
   }

   protected void d(arq $$0, bxm $$1, long $$2) {
      crc $$3 = this.b($$1).get();
      bye<?> $$4 = $$1.ec();
      $$4.a(cgg.o, new bzg($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azm.k($$5)) {
         $$4.b(cgg.n);
      } else {
         $$4.a(cgg.n, new cgj(new bzg($$3, false), this.a($$1), 2));
      }
   }
}
