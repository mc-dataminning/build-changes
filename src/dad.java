import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dad extends cys implements bmj {
   public static final MapCodec<dad> a = b(dad::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dmj e = dlz.aL;
   public static final Object2FloatMap<cvq> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final eos h = eop.b();
   private static final eos[] i = ac.a(new eos[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = eop.a(h, cys.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), eod.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dad> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cpg.cw);
      a(0.3F, cpg.ct);
      a(0.3F, cpg.cu);
      a(0.3F, cpg.cz);
      a(0.3F, cpg.cx);
      a(0.3F, cpg.cy);
      a(0.3F, cpg.cv);
      a(0.3F, cpg.cB);
      a(0.3F, cpg.cA);
      a(0.3F, cpg.W);
      a(0.3F, cpg.X);
      a(0.3F, cpg.Y);
      a(0.3F, cpg.Z);
      a(0.3F, cpg.aa);
      a(0.3F, cpg.ab);
      a(0.3F, cpg.ac);
      a(0.3F, cpg.ad);
      a(0.3F, cpg.vh);
      a(0.3F, cpg.rW);
      a(0.3F, cpg.cM);
      a(0.3F, cpg.dJ);
      a(0.3F, cpg.rY);
      a(0.3F, cpg.rX);
      a(0.3F, cpg.cR);
      a(0.3F, cpg.wl);
      a(0.3F, cpg.wm);
      a(0.3F, cpg.pu);
      a(0.3F, cpg.dK);
      a(0.3F, cpg.dL);
      a(0.3F, cpg.dP);
      a(0.3F, cpg.dN);
      a(0.3F, cpg.bJ);
      a(0.3F, cpg.ve);
      a(0.3F, cpg.vf);
      a(0.5F, cpg.qM);
      a(0.5F, cpg.ia);
      a(0.5F, cpg.cC);
      a(0.5F, cpg.eV);
      a(0.5F, cpg.dI);
      a(0.5F, cpg.fU);
      a(0.5F, cpg.dF);
      a(0.5F, cpg.dG);
      a(0.5F, cpg.dH);
      a(0.5F, cpg.rV);
      a(0.5F, cpg.fV);
      a(0.65F, cpg.cS);
      a(0.65F, cpg.ga);
      a(0.65F, cpg.fj);
      a(0.65F, cpg.fk);
      a(0.65F, cpg.fT);
      a(0.65F, cpg.os);
      a(0.65F, cpg.vg);
      a(0.65F, cpg.ub);
      a(0.65F, cpg.rg);
      a(0.65F, cpg.uc);
      a(0.65F, cpg.pv);
      a(0.65F, cpg.dz);
      a(0.65F, cpg.dA);
      a(0.65F, cpg.fP);
      a(0.65F, cpg.dB);
      a(0.65F, cpg.dC);
      a(0.65F, cpg.si);
      a(0.65F, cpg.dD);
      a(0.65F, cpg.dE);
      a(0.65F, cpg.wp);
      a(0.65F, cpg.dj);
      a(0.65F, cpg.dk);
      a(0.65F, cpg.dl);
      a(0.65F, cpg.dm);
      a(0.65F, cpg.dn);
      a(0.65F, cpg.do);
      a(0.65F, cpg.dp);
      a(0.65F, cpg.dq);
      a(0.65F, cpg.dr);
      a(0.65F, cpg.ds);
      a(0.65F, cpg.dt);
      a(0.65F, cpg.du);
      a(0.65F, cpg.dv);
      a(0.65F, cpg.cN);
      a(0.65F, cpg.hW);
      a(0.65F, cpg.hX);
      a(0.65F, cpg.hY);
      a(0.65F, cpg.hZ);
      a(0.65F, cpg.ib);
      a(0.65F, cpg.dy);
      a(0.65F, cpg.cO);
      a(0.65F, cpg.dM);
      a(0.65F, cpg.dO);
      a(0.85F, cpg.hC);
      a(0.85F, cpg.fN);
      a(0.85F, cpg.fO);
      a(0.85F, cpg.iW);
      a(0.85F, cpg.iX);
      a(0.85F, cpg.cP);
      a(0.85F, cpg.pw);
      a(0.85F, cpg.ud);
      a(0.85F, cpg.rR);
      a(0.85F, cpg.dw);
      a(0.85F, cpg.dx);
      a(1.0F, cpg.rA);
      a(1.0F, cpg.up);
   }

   private static void a(float $$0, cvq $$1) {
      f.put($$1.j(), $$0);
   }

   public dad(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(cvr $$0, hz $$1, boolean $$2) {
      dlj $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? atl.fh : atl.fg, atm.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ie.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      awp $$7 = $$0.F_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            jz.N,
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
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2) {
      return h;
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return i[0];
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.d())) {
         if ($$7 < 7 && !$$2.B) {
            dlj $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(atv.c.b($$0.d()));
            if (!$$4.fU().d) {
               $$0.h(1);
            }
         }

         return bly.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return blw.a($$1.B);
      } else {
         return blw.d;
      }
   }

   public static dlj a(bnq $$0, dlj $$1, aow $$2, cpd $$3, hz $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         dlj $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dlj a(bnq $$0, dlj $$1, cvr $$2, hz $$3) {
      if (!$$2.B) {
         enz $$4 = enz.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cdw $$5 = new cdw($$2, $$4.a(), $$4.b(), $$4.c(), new cpd(cpg.rx));
         $$5.u();
         $$2.b($$5);
      }

      dlj $$6 = a($$0, $$1, (cvs)$$2, $$3);
      $$2.a(null, $$3, atl.ff, atm.e, 1.0F, 1.0F);
      return $$6;
   }

   static dlj a(@Nullable bnq $$0, dlj $$1, cvs $$2, hz $$3) {
      dlj $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dpw.c, $$3, dpw.a.a($$0, $$4));
      return $$4;
   }

   static dlj a(@Nullable bnq $$0, dlj $$1, cvs $$2, hz $$3, cpd $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.F_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dlj $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dpw.c, $$3, dpw.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, atl.fi, atm.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   public bmi a(dlj $$0, cvs $$1, hz $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dad.c($$0, $$1, $$2, new cpd(cpg.rx));
      } else {
         return (bmi)($$3 < 7 ? new dad.b($$0, $$1, $$2) : new dad.a());
      }
   }

   static class a extends bmf implements bmi {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ie $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cpd $$1, @Nullable ie $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cpd $$1, ie $$2) {
         return false;
      }
   }

   static class b extends bmf implements bmi {
      private final dlj c;
      private final cvs d;
      private final hz e;
      private boolean f;

      public b(dlj $$0, cvs $$1, hz $$2) {
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
      public int[] a(ie $$0) {
         return $$0 == ie.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cpd $$1, @Nullable ie $$2) {
         return !this.f && $$2 == ie.b && dad.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cpd $$1, ie $$2) {
         return false;
      }

      @Override
      public void e() {
         cpd $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dlj $$1 = dad.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bmf implements bmi {
      private final dlj c;
      private final cvs d;
      private final hz e;
      private boolean f;

      public c(dlj $$0, cvs $$1, hz $$2, cpd $$3) {
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
      public int[] a(ie $$0) {
         return $$0 == ie.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cpd $$1, @Nullable ie $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cpd $$1, ie $$2) {
         return !this.f && $$2 == ie.a && $$1.a(cpg.rx);
      }

      @Override
      public void e() {
         dad.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
