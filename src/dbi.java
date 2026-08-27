import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class dbi extends cuv {
   public static final MapCodec<dbi> c = b(dbi::new);
   public static final die d = did.r;
   private static final Map<crl, List<dbi.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dbi> a() {
      return c;
   }

   protected dbi(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      for (ib $$5 : ib.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$4) {
         for (ib $$5 : ib.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(d) && ib.b != $$3 ? 15 : 0;
   }

   protected boolean a(csf $$0, hx $$1, dhn $$2) {
      return $$0.b($$1.d(), ib.a);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dbi.a> $$5 = h.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.W() - $$5.get(0).b > 60L) {
         $$5.remove(0);
      }

      if ($$0.c(d)) {
         if ($$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
            if (a($$1, $$2, true)) {
               $$1.c(1502, $$2, 0);
               $$1.a($$2, $$1.a_($$2).b(), 160);
            }
         }
      } else if (!$$4 && !a($$1, $$2, false)) {
         $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.M().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$3 == ib.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(jq.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(d);
   }

   private static boolean a(csf $$0, hx $$1, boolean $$2) {
      List<dbi.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dbi.a($$1.i(), $$0.W()));
      }

      int $$4 = 0;

      for (dbi.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final hx a;
      final long b;

      public a(hx $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
