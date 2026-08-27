import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public class cuy extends csk {
   public static final dgf a = cuw.a;
   public static final dgc b = dgb.A;
   private static final Map<cjc, ij> c = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ii()));
   private static final int d = 4;

   public static void a(cpw $$0, ij $$1) {
      c.put($$0.k(), $$1);
   }

   protected cuy(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         dcx $$6 = $$1.c_($$2);
         if ($$6 instanceof ddo) {
            $$3.a((ddo)$$6);
            if ($$6 instanceof ddp) {
               $$3.a(app.ac);
            } else {
               $$3.a(app.ae);
            }
         }

         return bha.b;
      }
   }

   protected void a(aks $$0, gw $$1) {
      gy $$2 = new gy($$0, $$1);
      ddo $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
         $$0.a(djv.a, $$1, djv.a.a($$3.q()));
      } else {
         cjh $$5 = $$3.a($$4);
         ij $$6 = this.a($$5);
         if ($$6 != ij.b) {
            $$3.a($$4, $$6.dispense($$2, $$5));
         }
      }
   }

   protected ij a(cjh $$0) {
      return c.get($$0.d());
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
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
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      this.a($$1, $$2);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddo($$0, $$1);
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.d().g());
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if ($$4.A()) {
         dcx $$5 = $$0.c_($$1);
         if ($$5 instanceof ddo) {
            ((ddo)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcx $$5 = $$1.c_($$2);
         if ($$5 instanceof ddo) {
            bgw.a($$1, $$2, (ddo)$$5);
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
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return cen.a($$1.c_($$2));
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }
}
