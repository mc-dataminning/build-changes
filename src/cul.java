import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public class cul extends crx {
   public static final dfs a = cuj.a;
   public static final dfp b = dfo.A;
   private static final Map<cir, ii> c = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ih()));
   private static final int d = 4;

   public static void a(cpj $$0, ii $$1) {
      c.put($$0.k(), $$1);
   }

   protected cul(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         dck $$6 = $$1.c_($$2);
         if ($$6 instanceof ddb) {
            $$3.a((ddb)$$6);
            if ($$6 instanceof ddc) {
               $$3.a(ape.ac);
            } else {
               $$3.a(ape.ae);
            }
         }

         return bgo.b;
      }
   }

   protected void a(aki $$0, gv $$1) {
      gx $$2 = new gx($$0, $$1);
      ddb $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
         $$0.a(dji.a, $$1, dji.a.a($$3.q()));
      } else {
         ciw $$5 = $$3.a($$4);
         ii $$6 = this.a($$5);
         if ($$6 != ii.b) {
            $$3.a($$4, $$6.dispense($$2, $$5));
         }
      }
   }

   protected ii a(ciw $$0) {
      return c.get($$0.d());
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
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
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      this.a($$1, $$2);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddb($$0, $$1);
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.d().g());
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof ddb) {
            ((ddb)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dck $$5 = $$1.c_($$2);
         if ($$5 instanceof ddb) {
            bgk.a($$1, $$2, (ddb)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public static hp a(gw $$0) {
      hb $$1 = $$0.e().c(a);
      double $$2 = $$0.a() + 0.7 * (double)$$1.j();
      double $$3 = $$0.b() + 0.7 * (double)$$1.k();
      double $$4 = $$0.c() + 0.7 * (double)$$1.l();
      return new hq($$2, $$3, $$4);
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return cec.a($$1.c_($$2));
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }
}
