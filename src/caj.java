import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class caj extends bzw<byn> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<byf, Float> f;
   private final Function<byf, Double> g;

   public caj(Function<byf, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public caj(Function<byf, Float> $$0, Function<byf, Double> $$1) {
      super(ag.a(() -> {
         Builder<chh<?>, chi> $$0x = ImmutableMap.builder();
         $$0x.put(chh.o, chi.c);
         $$0x.put(chh.n, chi.c);
         $$0x.put(chh.Q, chi.b);
         $$0x.put(chh.S, chi.c);
         $$0x.put(chh.P, chi.a);
         $$0x.put(chh.s, chi.b);
         $$0x.put(chh.aa, chi.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(byn $$0) {
      return this.f.apply($$0);
   }

   private Optional<csi> b(byn $$0) {
      return $$0.ec().c(chh.P);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(asb $$0, byn $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ec().a(chh.s) && !$$1.ec().a(chh.aa);
   }

   protected void b(asb $$0, byn $$1, long $$2) {
      $$1.ec().a(chh.S, true);
   }

   protected void c(asb $$0, byn $$1, long $$2) {
      bzf<?> $$3 = $$1.ec();
      $$3.a(chh.Q, 100);
      $$3.a(chh.S, false);
      $$3.b(chh.n);
      $$3.b(chh.o);
   }

   protected void d(asb $$0, byn $$1, long $$2) {
      csi $$3 = this.b($$1).get();
      bzf<?> $$4 = $$1.ec();
      $$4.a(chh.o, new cah($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azz.k($$5)) {
         $$4.b(chh.n);
      } else {
         $$4.a(chh.n, new chk(new cah($$3, false), this.a($$1), 2));
      }
   }
}
