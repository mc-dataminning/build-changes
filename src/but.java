import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class but extends bug<bsw> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bso, Float> f;
   private final Function<bso, Double> g;

   public but(Function<bso, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public but(Function<bso, Float> $$0, Function<bso, Double> $$1) {
      super(ad.a(() -> {
         Builder<cbr<?>, cbs> $$0x = ImmutableMap.builder();
         $$0x.put(cbr.n, cbs.c);
         $$0x.put(cbr.m, cbs.c);
         $$0x.put(cbr.P, cbs.b);
         $$0x.put(cbr.R, cbs.c);
         $$0x.put(cbr.O, cbs.a);
         $$0x.put(cbr.r, cbs.b);
         $$0x.put(cbr.Z, cbs.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bsw $$0) {
      return this.f.apply($$0);
   }

   private Optional<cly> b(bsw $$0) {
      return $$0.dZ().c(cbr.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aqt $$0, bsw $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dZ().a(cbr.r) && !$$1.dZ().a(cbr.Z);
   }

   protected void b(aqt $$0, bsw $$1, long $$2) {
      $$1.dZ().a(cbr.R, true);
   }

   protected void c(aqt $$0, bsw $$1, long $$2) {
      btp<?> $$3 = $$1.dZ();
      $$3.a(cbr.P, 100);
      $$3.a(cbr.R, false);
      $$3.b(cbr.m);
      $$3.b(cbr.n);
   }

   protected void d(aqt $$0, bsw $$1, long $$2) {
      cly $$3 = this.b($$1).get();
      btp<?> $$4 = $$1.dZ();
      $$4.a(cbr.n, new bur($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < aym.k($$5)) {
         $$4.b(cbr.m);
      } else {
         $$4.a(cbr.m, new cbu(new bur($$3, false), this.a($$1), 2));
      }
   }
}
