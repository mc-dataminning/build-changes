import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public class cro extends cpa {
   public static final dcv a = crm.a;
   public static final dcs b = dcr.A;
   private static final Map<cfu, ih> c = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ig()));
   private static final int d = 4;

   public static void a(cml $$0, ih $$1) {
      c.put($$0.k(), $$1);
   }

   protected cro(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         czn $$6 = $$1.c_($$2);
         if ($$6 instanceof dae) {
            $$3.a((dae)$$6);
            if ($$6 instanceof daf) {
               $$3.a(amr.ac);
            } else {
               $$3.a(amr.ae);
            }
         }

         return bdx.b;
      }
   }

   protected void a(aif $$0, gu $$1) {
      gw $$2 = new gw($$0, $$1);
      dae $$3 = $$2.f();
      int $$4 = $$3.a($$0.z);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
         $$0.a(dgl.a, $$1, dgl.a.a($$3.q()));
      } else {
         cfz $$5 = $$3.a($$4);
         ih $$6 = this.a($$5);
         if ($$6 != ih.b) {
            $$3.a($$4, $$6.dispense($$2, $$5));
         }
      }
   }

   protected ih a(cfz $$0) {
      return c.get($$0.d());
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
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
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      this.a($$1, $$2);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new dae($$0, $$1);
   }

   @Override
   public dcb a(cih $$0) {
      return this.n().a(a, $$0.d().g());
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if ($$4.A()) {
         czn $$5 = $$0.c_($$1);
         if ($$5 instanceof dae) {
            ((dae)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         czn $$5 = $$1.c_($$2);
         if ($$5 instanceof dae) {
            bdt.a($$1, $$2, (dae)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public static ho a(gv $$0) {
      ha $$1 = $$0.e().c(a);
      double $$2 = $$0.a() + 0.7 * (double)$$1.j();
      double $$3 = $$0.b() + 0.7 * (double)$$1.k();
      double $$4 = $$0.c() + 0.7 * (double)$$1.l();
      return new hp($$2, $$3, $$4);
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return cbf.a($$1.c_($$2));
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b);
   }
}
