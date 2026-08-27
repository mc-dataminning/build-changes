import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class czj extends csd implements czr {
   public static final int b = 30;
   public static final int c = 10;
   public static final dgc<dgl> d = dfu.bo;
   public static final dge e = dfu.aT;
   public static final dfv f = dfu.C;
   protected static final eib g = csq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = cxx.b($$1[$$2]);
      }
   });

   public czj(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, dgl.a).a(e, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      gw $$1 = $$0.a();
      eah $$2 = $$0.q().b_($$1);
      return this.n().a(f, Boolean.valueOf($$2.a() == eai.c));
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(f) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (h($$0) != dgl.b) {
         if (h($$0) == dgl.c) {
            $$1.a($$2, $$0.a(d, dgl.a), 3);
            if (!$$0.c(f)) {
               $$1.a(null, $$2, aoz.uu, apa.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bil $$3) {
      if (!$$0.r_() && n($$2) && $$3.ag() != bip.bi && $$0.c_($$1) instanceof ddv $$5 && $$0 instanceof akn $$6 && $$5.gd().a($$6, $$1, djo.P, djo.a.a($$2))) {
         $$5.g().b($$6, djo.P, djo.a.a($$3), $$3.di());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$1.r_() && !$$0.a($$3.b())) {
         if ($$0.c(e) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(e, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dgl.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cpq $$0, gw $$1, dfe $$2) {
      csq $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return !$$0.B ? a($$2, dcs.I, ($$0x, $$1x, $$2x, $$3) -> djx.c.a($$0x, $$3.gc(), $$3.gd())) : null;
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return g;
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(e);
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$3 == hc.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dgl h(dfe $$0) {
      return $$0.c(d);
   }

   public static boolean n(dfe $$0) {
      return h($$0) == dgl.a;
   }

   public static void a(cpq $$0, gw $$1, dfe $$2) {
      $$0.a($$1, $$2.a(d, dgl.c).a(e, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int b() {
      return 30;
   }

   public void a(@Nullable bil $$0, cpq $$1, gw $$2, dfe $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(d, dgl.b).a(e, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.b());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, djo.L, $$2);
      if (!$$3.c(f)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aoz.ut, apa.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bil $$0, cpq $$1, gw $$2, int $$3) {
      for (hc $$4 : hc.values()) {
         gw $$5 = $$2.a($$4);
         dfe $$6 = $$1.a_($$5);
         if ($$6.a(apo.bO)) {
            $$1.a(djx.b($$3), $$5, djo.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aoz.I, apa.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if (h($$0) == dgl.b) {
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
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      if ($$1.c_($$2) instanceof ddv $$4) {
         return h($$0) == dgl.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, cja $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bfv.a(5));
      }
   }
}
