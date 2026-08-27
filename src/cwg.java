import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class cwg extends csk {
   private final csk a;
   private static final Map<csk, csk> b = Maps.newIdentityHashMap();
   private static final Map<dey, dey> c = Maps.newIdentityHashMap();
   private static final Map<dey, dey> d = Maps.newIdentityHashMap();

   public cwg(csk $$0, dex.d $$1) {
      super($$1.e($$0.t() / 2.0F).f(0.75F));
      this.a = $$0;
      b.put($$0, this);
   }

   public csk a() {
      return this.a;
   }

   public static boolean h(dey $$0) {
      return b.containsKey($$0.b());
   }

   private void a(aki $$0, gv $$1) {
      bzg $$2 = bik.aI.a((cpk)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.N();
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, ciw $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cpg.g) && cnf.a(cnh.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dey n(dey $$0) {
      return a(c, $$0, () -> b.get($$0.b()).n());
   }

   public dey o(dey $$0) {
      return a(d, $$0, () -> this.a().n());
   }

   private static dey a(Map<dey, dey> $$0, dey $$1, Supplier<dey> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dey $$2x = $$2.get();

         for (dgb $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
