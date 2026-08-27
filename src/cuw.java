import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public class cuw extends csi {
   public static final dgd a = cuu.a;
   public static final dga b = dfz.A;
   private static final Map<cja, ij> c = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ii()));
   private static final int d = 4;

   public static void a(cpu $$0, ij $$1) {
      c.put($$0.k(), $$1);
   }

   protected cuw(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         dcv $$6 = $$1.c_($$2);
         if ($$6 instanceof ddm) {
            $$3.a((ddm)$$6);
            if ($$6 instanceof ddn) {
               $$3.a(apo.ac);
            } else {
               $$3.a(apo.ae);
            }
         }

         return bgy.b;
      }
   }

   protected void a(akr $$0, gw $$1) {
      gy $$2 = new gy($$0, $$1);
      ddm $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
         $$0.a(djt.a, $$1, djt.a.a($$3.q()));
      } else {
         cjf $$5 = $$3.a($$4);
         ij $$6 = this.a($$5);
         if ($$6 != ij.b) {
            $$3.a($$4, $$6.dispense($$2, $$5));
         }
      }
   }

   protected ij a(cjf $$0) {
      return c.get($$0.d());
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.c());
      boolean $$7 = $$0.c(b);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      this.a($$1, $$2);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddm($$0, $$1);
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.d().g());
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof ddm) {
            ((ddm)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof ddm) {
            bgu.a($$1, $$2, (ddm)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public static hq a(gx $$0) {
      hc $$1 = $$0.e().c(a);
      double $$2 = $$0.a() + 0.7 * (double)$$1.j();
      double $$3 = $$0.b() + 0.7 * (double)$$1.k();
      double $$4 = $$0.c() + 0.7 * (double)$$1.l();
      return new hr($$2, $$3, $$4);
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return cel.a($$1.c_($$2));
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }
}
