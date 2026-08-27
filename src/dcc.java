import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class dcc extends cvp {
   public static final MapCodec<dcc> c = b(dcc::new);
   public static final djg d = djf.r;
   private static final Map<cse, List<dcc.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dcc> a() {
      return c;
   }

   protected dcc(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      for (ia $$5 : ia.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$4) {
         for (ia $$5 : ia.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(d) && ia.b != $$3 ? 15 : 0;
   }

   protected boolean a(csy $$0, hv $$1, dip $$2) {
      return $$0.b($$1.d(), ia.a);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dcc.a> $$5 = h.get($$1);

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
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.M().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$3 == ia.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(jp.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(d);
   }

   private static boolean a(csy $$0, hv $$1, boolean $$2) {
      List<dcc.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dcc.a($$1.i(), $$0.W()));
      }

      int $$4 = 0;

      for (dcc.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final hv a;
      final long b;

      public a(hv $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
