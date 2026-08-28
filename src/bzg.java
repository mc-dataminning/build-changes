import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bzg extends byt<bxk> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bxc, Float> f;
   private final Function<bxc, Double> g;

   public bzg(Function<bxc, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bzg(Function<bxc, Float> $$0, Function<bxc, Double> $$1) {
      super(af.a(() -> {
         Builder<cge<?>, cgf> $$0x = ImmutableMap.builder();
         $$0x.put(cge.o, cgf.c);
         $$0x.put(cge.n, cgf.c);
         $$0x.put(cge.Q, cgf.b);
         $$0x.put(cge.S, cgf.c);
         $$0x.put(cge.P, cgf.a);
         $$0x.put(cge.s, cgf.b);
         $$0x.put(cge.aa, cgf.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bxk $$0) {
      return this.f.apply($$0);
   }

   private Optional<cqy> b(bxk $$0) {
      return $$0.eb().c(cge.P);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arq $$0, bxk $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.eb().a(cge.s) && !$$1.eb().a(cge.aa);
   }

   protected void b(arq $$0, bxk $$1, long $$2) {
      $$1.eb().a(cge.S, true);
   }

   protected void c(arq $$0, bxk $$1, long $$2) {
      byc<?> $$3 = $$1.eb();
      $$3.a(cge.Q, 100);
      $$3.a(cge.S, false);
      $$3.b(cge.n);
      $$3.b(cge.o);
   }

   protected void d(arq $$0, bxk $$1, long $$2) {
      cqy $$3 = this.b($$1).get();
      byc<?> $$4 = $$1.eb();
      $$4.a(cge.o, new bze($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azm.k($$5)) {
         $$4.b(cge.n);
      } else {
         $$4.a(cge.n, new cgh(new bze($$3, false), this.a($$1), 2));
      }
   }
}
