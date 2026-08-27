import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class cza extends dbi {
   public static final dgc a = dgb.r;
   private static final Map<cpd, List<cza.a>> e = new WeakHashMap<>();
   public static final int b = 60;
   public static final int c = 8;
   public static final int d = 160;
   private static final int f = 2;

   protected cza(dfk.d $$0) {
      super($$0, ir.b);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      for (hc $$5 : hc.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$4) {
         for (hc $$5 : hc.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(a) && hc.b != $$3 ? 15 : 0;
   }

   protected boolean a(cpx $$0, gw $$1, dfl $$2) {
      return $$0.b($$1.d(), hc.a);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<cza.a> $$5 = e.get($$1);

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
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if ($$0.c(a) == this.a($$1, $$2, $$0) && !$$1.L().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$3 == hc.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$0.c(a)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   private static boolean a(cpx $$0, gw $$1, boolean $$2) {
      List<cza.a> $$3 = e.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new cza.a($$1.i(), $$0.V()));
      }

      int $$4 = 0;

      for (cza.a $$5 : $$3) {
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
