import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cwh extends csl {
   private final csl a;
   private static final Map<csl, csl> b = Maps.newIdentityHashMap();
   private static final Map<dez, dez> c = Maps.newIdentityHashMap();
   private static final Map<dez, dez> d = Maps.newIdentityHashMap();

   public cwh(csl $$0, dey.d $$1) {
      super($$1.e($$0.t() / 2.0F).f(0.75F));
      this.a = $$0;
      b.put($$0, this);
   }

   public csl a() {
      return this.a;
   }

   public static boolean h(dez $$0) {
      return b.containsKey($$0.b());
   }

   private void a(akk $$0, gu $$1) {
      bzh $$2 = bim.aI.a((cpl)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.N();
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, cix $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cph.g) && cng.a(cni.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dez n(dez $$0) {
      return a(c, $$0, () -> b.get($$0.b()).n());
   }

   public dez o(dez $$0) {
      return a(d, $$0, () -> this.a().n());
   }

   private static dez a(Map<dez, dez> $$0, dez $$1, Supplier<dez> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dez $$2x = $$2.get();

         for (dgc $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
