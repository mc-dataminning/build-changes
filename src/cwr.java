import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cwr extends csv {
   private final csv a;
   private static final Map<csv, csv> b = Maps.newIdentityHashMap();
   private static final Map<dfj, dfj> c = Maps.newIdentityHashMap();
   private static final Map<dfj, dfj> d = Maps.newIdentityHashMap();

   public cwr(csv $$0, dfi.d $$1) {
      super($$1.e($$0.t() / 2.0F).f(0.75F));
      this.a = $$0;
      b.put($$0, this);
   }

   public csv a() {
      return this.a;
   }

   public static boolean h(dfj $$0) {
      return b.containsKey($$0.b());
   }

   private void a(akr $$0, gw $$1) {
      bzp $$2 = biu.aI.a((cpv)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, cjf $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cpr.g) && cnq.a(cns.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dfj n(dfj $$0) {
      return a(c, $$0, () -> b.get($$0.b()).n());
   }

   public dfj o(dfj $$0) {
      return a(d, $$0, () -> this.a().n());
   }

   private static dfj a(Map<dfj, dfj> $$0, dfj $$1, Supplier<dfj> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dfj $$2x = $$2.get();

         for (dgm $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
