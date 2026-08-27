import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class daq extends czf implements bmy {
   public static final MapCodec<daq> a = b(daq::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dne e = dmu.aL;
   public static final Object2FloatMap<cwd> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final epo h = epl.b();
   private static final epo[] i = ac.a(new epo[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = epl.a(h, czf.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), eoz.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cpt.cw);
      a(0.3F, cpt.ct);
      a(0.3F, cpt.cu);
      a(0.3F, cpt.cz);
      a(0.3F, cpt.cx);
      a(0.3F, cpt.cy);
      a(0.3F, cpt.cv);
      a(0.3F, cpt.cB);
      a(0.3F, cpt.cA);
      a(0.3F, cpt.W);
      a(0.3F, cpt.X);
      a(0.3F, cpt.Y);
      a(0.3F, cpt.Z);
      a(0.3F, cpt.aa);
      a(0.3F, cpt.ab);
      a(0.3F, cpt.ac);
      a(0.3F, cpt.ad);
      a(0.3F, cpt.vh);
      a(0.3F, cpt.rW);
      a(0.3F, cpt.cM);
      a(0.3F, cpt.dJ);
      a(0.3F, cpt.rY);
      a(0.3F, cpt.rX);
      a(0.3F, cpt.cR);
      a(0.3F, cpt.wl);
      a(0.3F, cpt.wm);
      a(0.3F, cpt.pu);
      a(0.3F, cpt.dK);
      a(0.3F, cpt.dL);
      a(0.3F, cpt.dP);
      a(0.3F, cpt.dN);
      a(0.3F, cpt.bJ);
      a(0.3F, cpt.ve);
      a(0.3F, cpt.vf);
      a(0.5F, cpt.qM);
      a(0.5F, cpt.ia);
      a(0.5F, cpt.cC);
      a(0.5F, cpt.eV);
      a(0.5F, cpt.dI);
      a(0.5F, cpt.fU);
      a(0.5F, cpt.dF);
      a(0.5F, cpt.dG);
      a(0.5F, cpt.dH);
      a(0.5F, cpt.rV);
      a(0.5F, cpt.fV);
      a(0.65F, cpt.cS);
      a(0.65F, cpt.ga);
      a(0.65F, cpt.fj);
      a(0.65F, cpt.fk);
      a(0.65F, cpt.fT);
      a(0.65F, cpt.os);
      a(0.65F, cpt.vg);
      a(0.65F, cpt.ub);
      a(0.65F, cpt.rg);
      a(0.65F, cpt.uc);
      a(0.65F, cpt.pv);
      a(0.65F, cpt.dz);
      a(0.65F, cpt.dA);
      a(0.65F, cpt.fP);
      a(0.65F, cpt.dB);
      a(0.65F, cpt.dC);
      a(0.65F, cpt.si);
      a(0.65F, cpt.dD);
      a(0.65F, cpt.dE);
      a(0.65F, cpt.wp);
      a(0.65F, cpt.dj);
      a(0.65F, cpt.dk);
      a(0.65F, cpt.dl);
      a(0.65F, cpt.dm);
      a(0.65F, cpt.dn);
      a(0.65F, cpt.do);
      a(0.65F, cpt.dp);
      a(0.65F, cpt.dq);
      a(0.65F, cpt.dr);
      a(0.65F, cpt.ds);
      a(0.65F, cpt.dt);
      a(0.65F, cpt.du);
      a(0.65F, cpt.dv);
      a(0.65F, cpt.cN);
      a(0.65F, cpt.hW);
      a(0.65F, cpt.hX);
      a(0.65F, cpt.hY);
      a(0.65F, cpt.hZ);
      a(0.65F, cpt.ib);
      a(0.65F, cpt.dy);
      a(0.65F, cpt.cO);
      a(0.65F, cpt.dM);
      a(0.65F, cpt.dO);
      a(0.85F, cpt.hC);
      a(0.85F, cpt.fN);
      a(0.85F, cpt.fO);
      a(0.85F, cpt.iW);
      a(0.85F, cpt.iX);
      a(0.85F, cpt.cP);
      a(0.85F, cpt.pw);
      a(0.85F, cpt.ud);
      a(0.85F, cpt.rR);
      a(0.85F, cpt.dw);
      a(0.85F, cpt.dx);
      a(1.0F, cpt.rA);
      a(1.0F, cpt.up);
   }

   private static void a(float $$0, cwd $$1) {
      f.put($$1.l(), $$0);
   }

   public daq(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(cwe $$0, ib $$1, boolean $$2) {
      dme $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? atp.fh : atp.fg, atq.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ih.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      awt $$7 = $$0.F_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            kb.N,
            (double)$$1.u() + 0.13125F + 0.7375F * (double)$$7.i(),
            (double)$$1.v() + $$4 + (double)$$7.i() * (1.0 - $$4),
            (double)$$1.w() + 0.13125F + 0.7375F * (double)$$7.i(),
            $$9,
            $$10,
            $$11
         );
      }
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2) {
      return h;
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return i[0];
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.d())) {
         if ($$7 < 7 && !$$2.B) {
            dme $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(atz.c.b($$0.d()));
            if (!$$4.fW().d) {
               $$0.h(1);
            }
         }

         return bmn.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bml.a($$1.B);
      } else {
         return bml.d;
      }
   }

   public static dme a(bof $$0, dme $$1, apa $$2, cpq $$3, ib $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         dme $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dme a(bof $$0, dme $$1, cwe $$2, ib $$3) {
      if (!$$2.B) {
         eov $$4 = eov.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cel $$5 = new cel($$2, $$4.a(), $$4.b(), $$4.c(), new cpq(cpt.rx));
         $$5.u();
         $$2.b($$5);
      }

      dme $$6 = a($$0, $$1, (cwf)$$2, $$3);
      $$2.a(null, $$3, atp.ff, atq.e, 1.0F, 1.0F);
      return $$6;
   }

   static dme a(@Nullable bof $$0, dme $$1, cwf $$2, ib $$3) {
      dme $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dqr.c, $$3, dqr.a.a($$0, $$4));
      return $$4;
   }

   static dme a(@Nullable bof $$0, dme $$1, cwf $$2, ib $$3, cpq $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.F_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dme $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dqr.c, $$3, dqr.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, atp.fi, atq.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   public bmx a(dme $$0, cwf $$1, ib $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new daq.c($$0, $$1, $$2, new cpq(cpt.rx));
      } else {
         return (bmx)($$3 < 7 ? new daq.b($$0, $$1, $$2) : new daq.a());
      }
   }

   static class a extends bmu implements bmx {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ih $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cpq $$1, @Nullable ih $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cpq $$1, ih $$2) {
         return false;
      }
   }

   static class b extends bmu implements bmx {
      private final dme c;
      private final cwf d;
      private final ib e;
      private boolean f;

      public b(dme $$0, cwf $$1, ib $$2) {
         super(1);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public int[] a(ih $$0) {
         return $$0 == ih.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cpq $$1, @Nullable ih $$2) {
         return !this.f && $$2 == ih.b && daq.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cpq $$1, ih $$2) {
         return false;
      }

      @Override
      public void e() {
         cpq $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dme $$1 = daq.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bmu implements bmx {
      private final dme c;
      private final cwf d;
      private final ib e;
      private boolean f;

      public c(dme $$0, cwf $$1, ib $$2, cpq $$3) {
         super($$3);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int al_() {
         return 1;
      }

      @Override
      public int[] a(ih $$0) {
         return $$0 == ih.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cpq $$1, @Nullable ih $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cpq $$1, ih $$2) {
         return !this.f && $$2 == ih.a && $$1.a(cpt.rx);
      }

      @Override
      public void e() {
         daq.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
