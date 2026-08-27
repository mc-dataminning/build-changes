import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class daw extends cuj {
   public static final MapCodec<daw> c = b(daw::new);
   public static final dhn d = dhm.r;
   private static final Map<cqy, List<daw.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends daw> a() {
      return c;
   }

   protected daw(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      for (hx $$5 : hx.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$4) {
         for (hx $$5 : hx.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(d) && hx.b != $$3 ? 15 : 0;
   }

   protected boolean a(crs $$0, ht $$1, dgw $$2) {
      return $$0.b($$1.d(), hx.a);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<daw.a> $$5 = h.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.V() - $$5.get(0).b > 60L) {
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
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.L().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$3 == hx.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(jm.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(d);
   }

   private static boolean a(crs $$0, ht $$1, boolean $$2) {
      List<daw.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new daw.a($$1.i(), $$0.V()));
      }

      int $$4 = 0;

      for (daw.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final ht a;
      final long b;

      public a(ht $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
