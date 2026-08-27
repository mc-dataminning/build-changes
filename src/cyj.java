import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class cyj extends cwy implements bkp {
   public static final MapCodec<cyj> a = b(cyj::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dkp e = dkf.aL;
   public static final Object2FloatMap<ctw> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final emv h = ems.b();
   private static final emv[] i = ac.a(new emv[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ems.a(h, cwy.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), emg.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<cyj> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cnj.cw);
      a(0.3F, cnj.ct);
      a(0.3F, cnj.cu);
      a(0.3F, cnj.cz);
      a(0.3F, cnj.cx);
      a(0.3F, cnj.cy);
      a(0.3F, cnj.cv);
      a(0.3F, cnj.cB);
      a(0.3F, cnj.cA);
      a(0.3F, cnj.W);
      a(0.3F, cnj.X);
      a(0.3F, cnj.Y);
      a(0.3F, cnj.Z);
      a(0.3F, cnj.aa);
      a(0.3F, cnj.ab);
      a(0.3F, cnj.ac);
      a(0.3F, cnj.ad);
      a(0.3F, cnj.vh);
      a(0.3F, cnj.rW);
      a(0.3F, cnj.cM);
      a(0.3F, cnj.dJ);
      a(0.3F, cnj.rY);
      a(0.3F, cnj.rX);
      a(0.3F, cnj.cR);
      a(0.3F, cnj.wl);
      a(0.3F, cnj.wm);
      a(0.3F, cnj.pu);
      a(0.3F, cnj.dK);
      a(0.3F, cnj.dL);
      a(0.3F, cnj.dP);
      a(0.3F, cnj.dN);
      a(0.3F, cnj.bJ);
      a(0.3F, cnj.ve);
      a(0.3F, cnj.vf);
      a(0.5F, cnj.qM);
      a(0.5F, cnj.ia);
      a(0.5F, cnj.cC);
      a(0.5F, cnj.eV);
      a(0.5F, cnj.dI);
      a(0.5F, cnj.fU);
      a(0.5F, cnj.dF);
      a(0.5F, cnj.dG);
      a(0.5F, cnj.dH);
      a(0.5F, cnj.rV);
      a(0.5F, cnj.fV);
      a(0.65F, cnj.cS);
      a(0.65F, cnj.ga);
      a(0.65F, cnj.fj);
      a(0.65F, cnj.fk);
      a(0.65F, cnj.fT);
      a(0.65F, cnj.os);
      a(0.65F, cnj.vg);
      a(0.65F, cnj.ub);
      a(0.65F, cnj.rg);
      a(0.65F, cnj.uc);
      a(0.65F, cnj.pv);
      a(0.65F, cnj.dz);
      a(0.65F, cnj.dA);
      a(0.65F, cnj.fP);
      a(0.65F, cnj.dB);
      a(0.65F, cnj.dC);
      a(0.65F, cnj.si);
      a(0.65F, cnj.dD);
      a(0.65F, cnj.dE);
      a(0.65F, cnj.wp);
      a(0.65F, cnj.dj);
      a(0.65F, cnj.dk);
      a(0.65F, cnj.dl);
      a(0.65F, cnj.dm);
      a(0.65F, cnj.dn);
      a(0.65F, cnj.do);
      a(0.65F, cnj.dp);
      a(0.65F, cnj.dq);
      a(0.65F, cnj.dr);
      a(0.65F, cnj.ds);
      a(0.65F, cnj.dt);
      a(0.65F, cnj.du);
      a(0.65F, cnj.dv);
      a(0.65F, cnj.cN);
      a(0.65F, cnj.hW);
      a(0.65F, cnj.hX);
      a(0.65F, cnj.hY);
      a(0.65F, cnj.hZ);
      a(0.65F, cnj.ib);
      a(0.65F, cnj.dy);
      a(0.65F, cnj.cO);
      a(0.65F, cnj.dM);
      a(0.65F, cnj.dO);
      a(0.85F, cnj.hC);
      a(0.85F, cnj.fN);
      a(0.85F, cnj.fO);
      a(0.85F, cnj.iW);
      a(0.85F, cnj.iX);
      a(0.85F, cnj.cP);
      a(0.85F, cnj.pw);
      a(0.85F, cnj.ud);
      a(0.85F, cnj.rR);
      a(0.85F, cnj.dw);
      a(0.85F, cnj.dx);
      a(1.0F, cnj.rA);
      a(1.0F, cnj.up);
   }

   private static void a(float $$0, ctw $$1) {
      f.put($$1.j(), $$0);
   }

   public cyj(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(ctx $$0, hx $$1, boolean $$2) {
      djp $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? art.fg : art.ff, aru.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ic.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      auw $$7 = $$0.F_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            jx.N,
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
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return i[$$0.c(e)];
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2) {
      return h;
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return i[0];
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.d())) {
         if ($$7 < 7 && !$$2.B) {
            djp $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(asd.c.b($$0.d()));
            if (!$$4.fT().d) {
               $$0.h(1);
            }
         }

         return bke.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bkc.a($$1.B);
      } else {
         return bkc.d;
      }
   }

   public static djp a(blw $$0, djp $$1, ane $$2, cng $$3, hx $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         djp $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static djp a(blw $$0, djp $$1, ctx $$2, hx $$3) {
      if (!$$2.B) {
         emc $$4 = emc.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         ccb $$5 = new ccb($$2, $$4.a(), $$4.b(), $$4.c(), new cng(cnj.rx));
         $$5.u();
         $$2.b($$5);
      }

      djp $$6 = a($$0, $$1, (cty)$$2, $$3);
      $$2.a(null, $$3, art.fe, aru.e, 1.0F, 1.0F);
      return $$6;
   }

   static djp a(@Nullable blw $$0, djp $$1, cty $$2, hx $$3) {
      djp $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dnz.c, $$3, dnz.a.a($$0, $$4));
      return $$4;
   }

   static djp a(@Nullable blw $$0, djp $$1, cty $$2, hx $$3, cng $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.F_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         djp $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dnz.c, $$3, dnz.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, art.fh, aru.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public bko a(djp $$0, cty $$1, hx $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new cyj.c($$0, $$1, $$2, new cng(cnj.rx));
      } else {
         return (bko)($$3 < 7 ? new cyj.b($$0, $$1, $$2) : new cyj.a());
      }
   }

   static class a extends bkl implements bko {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ic $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cng $$1, @Nullable ic $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cng $$1, ic $$2) {
         return false;
      }
   }

   static class b extends bkl implements bko {
      private final djp c;
      private final cty d;
      private final hx e;
      private boolean f;

      public b(djp $$0, cty $$1, hx $$2) {
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
      public int[] a(ic $$0) {
         return $$0 == ic.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cng $$1, @Nullable ic $$2) {
         return !this.f && $$2 == ic.b && cyj.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cng $$1, ic $$2) {
         return false;
      }

      @Override
      public void e() {
         cng $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            djp $$1 = cyj.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bkl implements bko {
      private final djp c;
      private final cty d;
      private final hx e;
      private boolean f;

      public c(djp $$0, cty $$1, hx $$2, cng $$3) {
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
      public int[] a(ic $$0) {
         return $$0 == ic.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cng $$1, @Nullable ic $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cng $$1, ic $$2) {
         return !this.f && $$2 == ic.a && $$1.a(cnj.rx);
      }

      @Override
      public void e() {
         cyj.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
