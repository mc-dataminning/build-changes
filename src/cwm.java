import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cwm extends csq {
   private final csq a;
   private static final Map<csq, csq> b = Maps.newIdentityHashMap();
   private static final Map<dfe, dfe> c = Maps.newIdentityHashMap();
   private static final Map<dfe, dfe> d = Maps.newIdentityHashMap();

   public cwm(csq $$0, dfd.d $$1) {
      super($$1.e($$0.t() / 2.0F).f(0.75F));
      this.a = $$0;
      b.put($$0, this);
   }

   public csq a() {
      return this.a;
   }

   public static boolean h(dfe $$0) {
      return b.containsKey($$0.b());
   }

   private void a(akn $$0, gw $$1) {
      bzk $$2 = bip.aI.a((cpq)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.N();
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, cja $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cpm.g) && cnl.a(cnn.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dfe n(dfe $$0) {
      return a(c, $$0, () -> b.get($$0.b()).n());
   }

   public dfe o(dfe $$0) {
      return a(d, $$0, () -> this.a().n());
   }

   private static dfe a(Map<dfe, dfe> $$0, dfe $$1, Supplier<dfe> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dfe $$2x = $$2.get();

         for (dgh $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
