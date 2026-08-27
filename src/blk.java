import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class blk extends bkx<bjp> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bjg, Float> f;
   private final Function<bjg, Double> g;

   public blk(Function<bjg, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public blk(Function<bjg, Float> $$0, Function<bjg, Double> $$1) {
      super(ac.a(() -> {
         Builder<bsh<?>, bsi> $$0x = ImmutableMap.builder();
         $$0x.put(bsh.n, bsi.c);
         $$0x.put(bsh.m, bsi.c);
         $$0x.put(bsh.O, bsi.b);
         $$0x.put(bsh.Q, bsi.c);
         $$0x.put(bsh.N, bsi.a);
         $$0x.put(bsh.r, bsi.b);
         $$0x.put(bsh.Y, bsi.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bjp $$0) {
      return this.f.apply($$0);
   }

   private Optional<cbu> b(bjp $$0) {
      return $$0.dN().c(bsh.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(akr $$0, bjp $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dN().a(bsh.r) && !$$1.dN().a(bsh.Y);
   }

   protected void b(akr $$0, bjp $$1, long $$2) {
      $$1.dN().a(bsh.Q, true);
   }

   protected void c(akr $$0, bjp $$1, long $$2) {
      bkg<?> $$3 = $$1.dN();
      $$3.a(bsh.O, 100);
      $$3.a(bsh.Q, false);
      $$3.b(bsh.m);
      $$3.b(bsh.n);
   }

   protected void d(akr $$0, bjp $$1, long $$2) {
      cbu $$3 = this.b($$1).get();
      bkg<?> $$4 = $$1.dN();
      $$4.a(bsh.n, new bli($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < arx.k($$5)) {
         $$4.b(bsh.m);
      } else {
         $$4.a(bsh.m, new bsk(new bli($$3, false), this.a($$1), 2));
      }
   }
}
