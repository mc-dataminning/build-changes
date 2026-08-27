import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class cyt extends dbb {
   public static final dfv a = dfu.r;
   private static final Map<cow, List<cyt.a>> e = new WeakHashMap<>();
   public static final int b = 60;
   public static final int c = 8;
   public static final int d = 160;
   private static final int f = 2;

   protected cyt(dfd.d $$0) {
      super($$0, ir.b);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      for (hc $$5 : hc.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$4) {
         for (hc $$5 : hc.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(a) && hc.b != $$3 ? 15 : 0;
   }

   protected boolean a(cpq $$0, gw $$1, dfe $$2) {
      return $$0.b($$1.d(), hc.a);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<cyt.a> $$5 = e.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.V() - $$5.get(0).b > 60L) {
         $$5.remove(0);
      }

      if ($$0.c(a)) {
         if ($$4) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
            if (a($$1, $$2, true)) {
               $$1.c(1502, $$2, 0);
               $$1.a($$2, $$1.a_($$2).b(), 160);
            }
         }
      } else if (!$$4 && !a($$1, $$2, false)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if ($$0.c(a) == this.a($$1, $$2, $$0) && !$$1.L().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$3 == hc.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$0.c(a)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   private static boolean a(cpq $$0, gw $$1, boolean $$2) {
      List<cyt.a> $$3 = e.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new cyt.a($$1.i(), $$0.V()));
      }

      int $$4 = 0;

      for (cyt.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final gw a;
      final long b;

      public a(gw $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
