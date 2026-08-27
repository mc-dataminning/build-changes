import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class czq extends csk implements czy {
   public static final int b = 30;
   public static final int c = 10;
   public static final dgj<dgs> d = dgb.bo;
   public static final dgl e = dgb.aT;
   public static final dgc f = dgb.C;
   protected static final eii g = csx.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = cye.b($$1[$$2]);
      }
   });

   public czq(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, dgs.a).a(e, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      gw $$1 = $$0.a();
      eao $$2 = $$0.q().b_($$1);
      return this.n().a(f, Boolean.valueOf($$2.a() == eap.c));
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(f) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (h($$0) != dgs.b) {
         if (h($$0) == dgs.c) {
            $$1.a($$2, $$0.a(d, dgs.a), 3);
            if (!$$0.c(f)) {
               $$1.a(null, $$2, apf.uu, apg.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bis $$3) {
      if (!$$0.w_() && n($$2) && $$3.ag() != biw.bi && $$0.c_($$1) instanceof dec $$5 && $$0 instanceof aks $$6 && $$5.gg().a($$6, $$1, djv.P, djv.a.a($$2))) {
         $$5.g().b($$6, djv.P, djv.a.a($$3), $$3.dj());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(e) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(e, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dgs.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cpx $$0, gw $$1, dfl $$2) {
      csx $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dec($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return !$$0.B ? a($$2, dcz.I, ($$0x, $$1x, $$2x, $$3) -> dke.c.a($$0x, $$3.gf(), $$3.gg())) : null;
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return g;
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(e);
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$3 == hc.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dgs h(dfl $$0) {
      return $$0.c(d);
   }

   public static boolean n(dfl $$0) {
      return h($$0) == dgs.a;
   }

   public static void a(cpx $$0, gw $$1, dfl $$2) {
      $$0.a($$1, $$2.a(d, dgs.c).a(e, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int b() {
      return 30;
   }

   public void a(@Nullable bis $$0, cpx $$1, gw $$2, dfl $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(d, dgs.b).a(e, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.b());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, djv.L, $$2);
      if (!$$3.c(f)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apf.ut, apg.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bis $$0, cpx $$1, gw $$2, int $$3) {
      for (hc $$4 : hc.values()) {
         gw $$5 = $$2.a($$4);
         dfl $$6 = $$1.a_($$5);
         if ($$6.a(apu.bO)) {
            $$1.a(dke.b($$3), $$5, djv.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, apf.I, apg.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if (h($$0) == dgs.b) {
         hc $$4 = hc.b($$3);
         if ($$4 != hc.b && $$4 != hc.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(iq.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      if ($$1.c_($$2) instanceof dec $$4) {
         return h($$0) == dgs.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, cjh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bgc.a(5));
      }
   }
}
