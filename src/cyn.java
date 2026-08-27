import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class cyn extends dav {
   public static final dfp a = dfo.r;
   private static final Map<coq, List<cyn.a>> e = new WeakHashMap<>();
   public static final int b = 60;
   public static final int c = 8;
   public static final int d = 160;
   private static final int f = 2;

   protected cyn(dex.d $$0) {
      super($$0, iq.b);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      for (hb $$5 : hb.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$4) {
         for (hb $$5 : hb.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(a) && hb.b != $$3 ? 15 : 0;
   }

   protected boolean a(cpk $$0, gv $$1, dey $$2) {
      return $$0.b($$1.d(), hb.a);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<cyn.a> $$5 = e.get($$1);

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
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if ($$0.c(a) == this.a($$1, $$2, $$0) && !$$1.L().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$3 == hb.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(a)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   private static boolean a(cpk $$0, gv $$1, boolean $$2) {
      List<cyn.a> $$3 = e.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new cyn.a($$1.i(), $$0.V()));
      }

      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$3.size(); $$5++) {
         cyn.a $$6 = $$3.get($$5);
         if ($$6.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final gv a;
      final long b;

      public a(gv $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
