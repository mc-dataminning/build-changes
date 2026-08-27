import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class diz extends dcl {
   public static final MapCodec<diz> c = b(diz::new);
   public static final dqp d = dqo.r;
   private static final Map<cza, List<diz.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends diz> a() {
      return c;
   }

   protected diz(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      for (ir $$5 : ir.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$4) {
         for (ir $$5 : ir.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(d) && ir.b != $$3 ? 15 : 0;
   }

   protected boolean a(czu $$0, im $$1, dpy $$2) {
      return $$0.b($$1.d(), ir.a);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<diz.a> $$5 = h.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.Y() - $$5.get(0).b > 60L) {
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
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.O().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$3 == ir.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(kq.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(d);
   }

   private static boolean a(czu $$0, im $$1, boolean $$2) {
      List<diz.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new diz.a($$1.i(), $$0.Y()));
      }

      int $$4 = 0;

      for (diz.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final im a;
      final long b;

      public a(im $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
