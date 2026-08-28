import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class caa extends bzn<bye> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bxw, Float> f;
   private final Function<bxw, Double> g;

   public caa(Function<bxw, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public caa(Function<bxw, Float> $$0, Function<bxw, Double> $$1) {
      super(ag.a(() -> {
         Builder<cgy<?>, cgz> $$0x = ImmutableMap.builder();
         $$0x.put(cgy.o, cgz.c);
         $$0x.put(cgy.n, cgz.c);
         $$0x.put(cgy.Q, cgz.b);
         $$0x.put(cgy.S, cgz.c);
         $$0x.put(cgy.P, cgz.a);
         $$0x.put(cgy.s, cgz.b);
         $$0x.put(cgy.aa, cgz.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bye $$0) {
      return this.f.apply($$0);
   }

   private Optional<crz> b(bye $$0) {
      return $$0.ec().c(cgy.P);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aru $$0, bye $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ec().a(cgy.s) && !$$1.ec().a(cgy.aa);
   }

   protected void b(aru $$0, bye $$1, long $$2) {
      $$1.ec().a(cgy.S, true);
   }

   protected void c(aru $$0, bye $$1, long $$2) {
      byw<?> $$3 = $$1.ec();
      $$3.a(cgy.Q, 100);
      $$3.a(cgy.S, false);
      $$3.b(cgy.n);
      $$3.b(cgy.o);
   }

   protected void d(aru $$0, bye $$1, long $$2) {
      crz $$3 = this.b($$1).get();
      byw<?> $$4 = $$1.ec();
      $$4.a(cgy.o, new bzy($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azq.k($$5)) {
         $$4.b(cgy.n);
      } else {
         $$4.a(cgy.n, new chb(new bzy($$3, false), this.a($$1), 2));
      }
   }
}
