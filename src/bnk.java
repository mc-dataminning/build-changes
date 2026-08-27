import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bnk extends bmx<blp> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<blg, Float> f;
   private final Function<blg, Double> g;

   public bnk(Function<blg, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bnk(Function<blg, Float> $$0, Function<blg, Double> $$1) {
      super(ac.a(() -> {
         Builder<buh<?>, bui> $$0x = ImmutableMap.builder();
         $$0x.put(buh.n, bui.c);
         $$0x.put(buh.m, bui.c);
         $$0x.put(buh.O, bui.b);
         $$0x.put(buh.Q, bui.c);
         $$0x.put(buh.N, bui.a);
         $$0x.put(buh.r, bui.b);
         $$0x.put(buh.Y, bui.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(blp $$0) {
      return this.f.apply($$0);
   }

   private Optional<cdu> b(blp $$0) {
      return $$0.dP().c(buh.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ame $$0, blp $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dP().a(buh.r) && !$$1.dP().a(buh.Y);
   }

   protected void b(ame $$0, blp $$1, long $$2) {
      $$1.dP().a(buh.Q, true);
   }

   protected void c(ame $$0, blp $$1, long $$2) {
      bmg<?> $$3 = $$1.dP();
      $$3.a(buh.O, 100);
      $$3.a(buh.Q, false);
      $$3.b(buh.m);
      $$3.b(buh.n);
   }

   protected void d(ame $$0, blp $$1, long $$2) {
      cdu $$3 = this.b($$1).get();
      bmg<?> $$4 = $$1.dP();
      $$4.a(buh.n, new bni($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < atm.k($$5)) {
         $$4.b(buh.m);
      } else {
         $$4.a(buh.m, new buk(new bni($$3, false), this.a($$1), 2));
      }
   }
}
