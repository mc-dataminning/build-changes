import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class cwg extends cpa implements cwo {
   public static final int b = 30;
   public static final int c = 10;
   public static final dcz<ddi> d = dcr.bo;
   public static final ddb e = dcr.aT;
   public static final dcs f = dcr.C;
   protected static final efb g = cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = cuu.b($$1[$$2]);
      }
   });

   public cwg(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, ddi.a).a(e, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      gu $$1 = $$0.a();
      dxe $$2 = $$0.q().b_($$1);
      return this.n().a(f, Boolean.valueOf($$2.a() == dxf.c));
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(f) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (h($$0) != ddi.b) {
         if (h($$0) == ddi.c) {
            $$1.a($$2, $$0.a(d, ddi.a), 3);
            if (!$$0.c(f)) {
               $$1.a(null, $$2, amh.uu, ami.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfj $$3) {
      if (!$$0.r_() && n($$2) && $$3.ae() != bfn.bi && $$0.c_($$1) instanceof das $$5 && $$0 instanceof aif $$6 && $$5.gc().a($$6, $$1, dgl.Q, dgl.a.a($$2))) {
         $$5.g().b($$6, dgl.Q, dgl.a.a($$3), $$3.dg());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$1.r_() && !$$0.a($$3.b())) {
         if ($$0.c(e) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(e, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == ddi.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cmm $$0, gu $$1, dcb $$2) {
      cpn $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public czn a(gu $$0, dcb $$1) {
      return new das($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return !$$0.B ? a($$2, czp.I, ($$0x, $$1x, $$2x, $$3) -> dgu.c.a($$0x, $$3.gb(), $$3.gc())) : null;
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return g;
   }

   @Override
   public boolean f_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(e);
   }

   @Override
   public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$3 == ha.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static ddi h(dcb $$0) {
      return $$0.c(d);
   }

   public static boolean n(dcb $$0) {
      return h($$0) == ddi.a;
   }

   public static void a(cmm $$0, gu $$1, dcb $$2) {
      $$0.a($$1, $$2.a(d, ddi.c).a(e, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int b() {
      return 30;
   }

   public void a(@Nullable bfj $$0, cmm $$1, gu $$2, dcb $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(d, ddi.b).a(e, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.b());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dgl.M, $$2);
      if (!$$3.c(f)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, amh.ut, ami.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bfj $$0, cmm $$1, gu $$2, int $$3) {
      for (ha $$4 : ha.values()) {
         gu $$5 = $$2.a($$4);
         dcb $$6 = $$1.a_($$5);
         if ($$6.a(amw.bM)) {
            $$1.a(dgu.b($$3), $$5, dgl.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, amh.I, ami.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if (h($$0) == ddi.b) {
         ha $$4 = ha.b($$3);
         if ($$4 != ha.b && $$4 != ha.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(io.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      if ($$1.c_($$2) instanceof das $$4) {
         return h($$0) == ddi.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   @Override
   public boolean g_(dcb $$0) {
      return true;
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, cfz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bcz.a(5));
      }
   }
}
