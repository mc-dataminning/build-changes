import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cwt extends csx {
   private final csx a;
   private static final Map<csx, csx> b = Maps.newIdentityHashMap();
   private static final Map<dfl, dfl> c = Maps.newIdentityHashMap();
   private static final Map<dfl, dfl> d = Maps.newIdentityHashMap();

   public cwt(csx $$0, dfk.d $$1) {
      super($$1.e($$0.t() / 2.0F).f(0.75F));
      this.a = $$0;
      b.put($$0, this);
   }

   public csx a() {
      return this.a;
   }

   public static boolean h(dfl $$0) {
      return b.containsKey($$0.b());
   }

   private void a(aks $$0, gw $$1) {
      bzr $$2 = biw.aI.a((cpx)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, cjh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cpt.g) && cns.a(cnu.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dfl n(dfl $$0) {
      return a(c, $$0, () -> b.get($$0.b()).n());
   }

   public dfl o(dfl $$0) {
      return a(d, $$0, () -> this.a().n());
   }

   private static dfl a(Map<dfl, dfl> $$0, dfl $$1, Supplier<dfl> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dfl $$2x = $$2.get();

         for (dgo $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
