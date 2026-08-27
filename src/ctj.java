import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class ctj extends cpn {
   private final cpn a;
   private static final Map<cpn, cpn> b = Maps.newIdentityHashMap();
   private static final Map<dcb, dcb> c = Maps.newIdentityHashMap();
   private static final Map<dcb, dcb> d = Maps.newIdentityHashMap();

   public ctj(cpn $$0, dca.d $$1) {
      super($$1.e($$0.t() / 2.0F).f(0.75F));
      this.a = $$0;
      b.put($$0, this);
   }

   public cpn a() {
      return this.a;
   }

   public static boolean h(dcb $$0) {
      return b.containsKey($$0.b());
   }

   private void a(aif $$0, gu $$1) {
      bwj $$2 = bfn.aI.a((cmm)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.O();
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cmi.g) && cki.a(ckk.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dcb n(dcb $$0) {
      return a(c, $$0, () -> b.get($$0.b()).n());
   }

   public dcb o(dcb $$0) {
      return a(d, $$0, () -> this.a().n());
   }

   private static dcb a(Map<dcb, dcb> $$0, dcb $$1, Supplier<dcb> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dcb $$2x = $$2.get();

         for (dde $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
