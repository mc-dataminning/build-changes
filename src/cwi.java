import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cwi extends csm {
   private final csm a;
   private static final Map<csm, csm> b = Maps.newIdentityHashMap();
   private static final Map<dfa, dfa> c = Maps.newIdentityHashMap();
   private static final Map<dfa, dfa> d = Maps.newIdentityHashMap();

   public cwi(csm $$0, dez.d $$1) {
      super($$1.e($$0.t() / 2.0F).f(0.75F));
      this.a = $$0;
      b.put($$0, this);
   }

   public csm a() {
      return this.a;
   }

   public static boolean h(dfa $$0) {
      return b.containsKey($$0.b());
   }

   private void a(akk $$0, gu $$1) {
      bzi $$2 = bim.aI.a((cpm)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.N();
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, ciy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cpi.g) && cnh.a(cnj.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dfa n(dfa $$0) {
      return a(c, $$0, () -> b.get($$0.b()).n());
   }

   public dfa o(dfa $$0) {
      return a(d, $$0, () -> this.a().n());
   }

   private static dfa a(Map<dfa, dfa> $$0, dfa $$1, Supplier<dfa> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dfa $$2x = $$2.get();

         for (dgd $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
