import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class byv extends byi<bwz> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bwr, Float> f;
   private final Function<bwr, Double> g;

   public byv(Function<bwr, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public byv(Function<bwr, Float> $$0, Function<bwr, Double> $$1) {
      super(af.a(() -> {
         Builder<cft<?>, cfu> $$0x = ImmutableMap.builder();
         $$0x.put(cft.o, cfu.c);
         $$0x.put(cft.n, cfu.c);
         $$0x.put(cft.Q, cfu.b);
         $$0x.put(cft.S, cfu.c);
         $$0x.put(cft.P, cfu.a);
         $$0x.put(cft.s, cfu.b);
         $$0x.put(cft.aa, cfu.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bwz $$0) {
      return this.f.apply($$0);
   }

   private Optional<cqi> b(bwz $$0) {
      return $$0.eb().c(cft.P);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arn $$0, bwz $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.eb().a(cft.s) && !$$1.eb().a(cft.aa);
   }

   protected void b(arn $$0, bwz $$1, long $$2) {
      $$1.eb().a(cft.S, true);
   }

   protected void c(arn $$0, bwz $$1, long $$2) {
      bxr<?> $$3 = $$1.eb();
      $$3.a(cft.Q, 100);
      $$3.a(cft.S, false);
      $$3.b(cft.n);
      $$3.b(cft.o);
   }

   protected void d(arn $$0, bwz $$1, long $$2) {
      cqi $$3 = this.b($$1).get();
      bxr<?> $$4 = $$1.eb();
      $$4.a(cft.o, new byt($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azk.k($$5)) {
         $$4.b(cft.n);
      } else {
         $$4.a(cft.n, new cfw(new byt($$3, false), this.a($$1), 2));
      }
   }
}
