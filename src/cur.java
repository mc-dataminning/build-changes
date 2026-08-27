import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public class cur extends csd {
   public static final dfy a = cup.a;
   public static final dfv b = dfu.A;
   private static final Map<civ, ij> c = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ii()));
   private static final int d = 4;

   public static void a(cpp $$0, ij $$1) {
      c.put($$0.k(), $$1);
   }

   protected cur(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         dcq $$6 = $$1.c_($$2);
         if ($$6 instanceof ddh) {
            $$3.a((ddh)$$6);
            if ($$6 instanceof ddi) {
               $$3.a(apj.ac);
            } else {
               $$3.a(apj.ae);
            }
         }

         return bgt.b;
      }
   }

   protected void a(akn $$0, gw $$1) {
      gy $$2 = new gy($$0, $$1);
      ddh $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
         $$0.a(djo.a, $$1, djo.a.a($$3.q()));
      } else {
         cja $$5 = $$3.a($$4);
         ij $$6 = this.a($$5);
         if ($$6 != ij.b) {
            $$3.a($$4, $$6.dispense($$2, $$5));
         }
      }
   }

   protected ij a(cja $$0) {
      return c.get($$0.d());
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.c());
      boolean $$7 = $$0.c(b);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 4);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 4);
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      this.a($$1, $$2);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddh($$0, $$1);
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.d().g());
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof ddh) {
            ((ddh)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcq $$5 = $$1.c_($$2);
         if ($$5 instanceof ddh) {
            bgp.a($$1, $$2, (ddh)$$5);
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
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return ceg.a($$1.c_($$2));
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }
}
