import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class czz extends cyo implements bmh {
   public static final MapCodec<czz> a = b(czz::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dmf e = dlv.aL;
   public static final Object2FloatMap<cvm> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final eol h = eoi.b();
   private static final eol[] i = ac.a(new eol[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = eoi.a(h, cyo.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), enw.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<czz> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cpc.cw);
      a(0.3F, cpc.ct);
      a(0.3F, cpc.cu);
      a(0.3F, cpc.cz);
      a(0.3F, cpc.cx);
      a(0.3F, cpc.cy);
      a(0.3F, cpc.cv);
      a(0.3F, cpc.cB);
      a(0.3F, cpc.cA);
      a(0.3F, cpc.W);
      a(0.3F, cpc.X);
      a(0.3F, cpc.Y);
      a(0.3F, cpc.Z);
      a(0.3F, cpc.aa);
      a(0.3F, cpc.ab);
      a(0.3F, cpc.ac);
      a(0.3F, cpc.ad);
      a(0.3F, cpc.vh);
      a(0.3F, cpc.rW);
      a(0.3F, cpc.cM);
      a(0.3F, cpc.dJ);
      a(0.3F, cpc.rY);
      a(0.3F, cpc.rX);
      a(0.3F, cpc.cR);
      a(0.3F, cpc.wl);
      a(0.3F, cpc.wm);
      a(0.3F, cpc.pu);
      a(0.3F, cpc.dK);
      a(0.3F, cpc.dL);
      a(0.3F, cpc.dP);
      a(0.3F, cpc.dN);
      a(0.3F, cpc.bJ);
      a(0.3F, cpc.ve);
      a(0.3F, cpc.vf);
      a(0.5F, cpc.qM);
      a(0.5F, cpc.ia);
      a(0.5F, cpc.cC);
      a(0.5F, cpc.eV);
      a(0.5F, cpc.dI);
      a(0.5F, cpc.fU);
      a(0.5F, cpc.dF);
      a(0.5F, cpc.dG);
      a(0.5F, cpc.dH);
      a(0.5F, cpc.rV);
      a(0.5F, cpc.fV);
      a(0.65F, cpc.cS);
      a(0.65F, cpc.ga);
      a(0.65F, cpc.fj);
      a(0.65F, cpc.fk);
      a(0.65F, cpc.fT);
      a(0.65F, cpc.os);
      a(0.65F, cpc.vg);
      a(0.65F, cpc.ub);
      a(0.65F, cpc.rg);
      a(0.65F, cpc.uc);
      a(0.65F, cpc.pv);
      a(0.65F, cpc.dz);
      a(0.65F, cpc.dA);
      a(0.65F, cpc.fP);
      a(0.65F, cpc.dB);
      a(0.65F, cpc.dC);
      a(0.65F, cpc.si);
      a(0.65F, cpc.dD);
      a(0.65F, cpc.dE);
      a(0.65F, cpc.wp);
      a(0.65F, cpc.dj);
      a(0.65F, cpc.dk);
      a(0.65F, cpc.dl);
      a(0.65F, cpc.dm);
      a(0.65F, cpc.dn);
      a(0.65F, cpc.do);
      a(0.65F, cpc.dp);
      a(0.65F, cpc.dq);
      a(0.65F, cpc.dr);
      a(0.65F, cpc.ds);
      a(0.65F, cpc.dt);
      a(0.65F, cpc.du);
      a(0.65F, cpc.dv);
      a(0.65F, cpc.cN);
      a(0.65F, cpc.hW);
      a(0.65F, cpc.hX);
      a(0.65F, cpc.hY);
      a(0.65F, cpc.hZ);
      a(0.65F, cpc.ib);
      a(0.65F, cpc.dy);
      a(0.65F, cpc.cO);
      a(0.65F, cpc.dM);
      a(0.65F, cpc.dO);
      a(0.85F, cpc.hC);
      a(0.85F, cpc.fN);
      a(0.85F, cpc.fO);
      a(0.85F, cpc.iW);
      a(0.85F, cpc.iX);
      a(0.85F, cpc.cP);
      a(0.85F, cpc.pw);
      a(0.85F, cpc.ud);
      a(0.85F, cpc.rR);
      a(0.85F, cpc.dw);
      a(0.85F, cpc.dx);
      a(1.0F, cpc.rA);
      a(1.0F, cpc.up);
   }

   private static void a(float $$0, cvm $$1) {
      f.put($$1.j(), $$0);
   }

   public czz(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(cvn $$0, hz $$1, boolean $$2) {
      dlf $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? atk.fg : atk.ff, atl.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ie.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      awo $$7 = $$0.F_();

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
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2) {
      return h;
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return i[0];
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.d())) {
         if ($$7 < 7 && !$$2.B) {
            dlf $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(atu.c.b($$0.d()));
            if (!$$4.fU().d) {
               $$0.h(1);
            }
         }

         return blw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return blu.a($$1.B);
      } else {
         return blu.d;
      }
   }

   public static dlf a(bno $$0, dlf $$1, aov $$2, coz $$3, hz $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         dlf $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dlf a(bno $$0, dlf $$1, cvn $$2, hz $$3) {
      if (!$$2.B) {
         ens $$4 = ens.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cds $$5 = new cds($$2, $$4.a(), $$4.b(), $$4.c(), new coz(cpc.rx));
         $$5.u();
         $$2.b($$5);
      }

      dlf $$6 = a($$0, $$1, (cvo)$$2, $$3);
      $$2.a(null, $$3, atk.fe, atl.e, 1.0F, 1.0F);
      return $$6;
   }

   static dlf a(@Nullable bno $$0, dlf $$1, cvo $$2, hz $$3) {
      dlf $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dpp.c, $$3, dpp.a.a($$0, $$4));
      return $$4;
   }

   static dlf a(@Nullable bno $$0, dlf $$1, cvo $$2, hz $$3, coz $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.F_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dlf $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dpp.c, $$3, dpp.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, atk.fh, atl.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   public bmg a(dlf $$0, cvo $$1, hz $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new czz.c($$0, $$1, $$2, new coz(cpc.rx));
      } else {
         return (bmg)($$3 < 7 ? new czz.b($$0, $$1, $$2) : new czz.a());
      }
   }

   static class a extends bmd implements bmg {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ie $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, coz $$1, @Nullable ie $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, coz $$1, ie $$2) {
         return false;
      }
   }

   static class b extends bmd implements bmg {
      private final dlf c;
      private final cvo d;
      private final hz e;
      private boolean f;

      public b(dlf $$0, cvo $$1, hz $$2) {
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
      public boolean a(int $$0, coz $$1, @Nullable ie $$2) {
         return !this.f && $$2 == ie.b && czz.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, coz $$1, ie $$2) {
         return false;
      }

      @Override
      public void e() {
         coz $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dlf $$1 = czz.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bmd implements bmg {
      private final dlf c;
      private final cvo d;
      private final hz e;
      private boolean f;

      public c(dlf $$0, cvo $$1, hz $$2, coz $$3) {
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
      public boolean a(int $$0, coz $$1, @Nullable ie $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, coz $$1, ie $$2) {
         return !this.f && $$2 == ie.a && $$1.a(cpc.rx);
      }

      @Override
      public void e() {
         czz.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
