import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dbn extends dac implements bnq {
   public static final MapCodec<dbn> a = b(dbn::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dob e = dnr.aL;
   public static final Object2FloatMap<cxa> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final eqm h = eqj.b();
   private static final eqm[] i = ac.a(new eqm[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = eqj.a(h, dac.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), epx.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dbn> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cqp.cw);
      a(0.3F, cqp.ct);
      a(0.3F, cqp.cu);
      a(0.3F, cqp.cz);
      a(0.3F, cqp.cx);
      a(0.3F, cqp.cy);
      a(0.3F, cqp.cv);
      a(0.3F, cqp.cB);
      a(0.3F, cqp.cA);
      a(0.3F, cqp.W);
      a(0.3F, cqp.X);
      a(0.3F, cqp.Y);
      a(0.3F, cqp.Z);
      a(0.3F, cqp.aa);
      a(0.3F, cqp.ab);
      a(0.3F, cqp.ac);
      a(0.3F, cqp.ad);
      a(0.3F, cqp.vj);
      a(0.3F, cqp.rW);
      a(0.3F, cqp.cM);
      a(0.3F, cqp.dJ);
      a(0.3F, cqp.rY);
      a(0.3F, cqp.rX);
      a(0.3F, cqp.cR);
      a(0.3F, cqp.wn);
      a(0.3F, cqp.wo);
      a(0.3F, cqp.pu);
      a(0.3F, cqp.dK);
      a(0.3F, cqp.dL);
      a(0.3F, cqp.dP);
      a(0.3F, cqp.dN);
      a(0.3F, cqp.bJ);
      a(0.3F, cqp.vg);
      a(0.3F, cqp.vh);
      a(0.5F, cqp.qM);
      a(0.5F, cqp.ia);
      a(0.5F, cqp.cC);
      a(0.5F, cqp.eV);
      a(0.5F, cqp.dI);
      a(0.5F, cqp.fU);
      a(0.5F, cqp.dF);
      a(0.5F, cqp.dG);
      a(0.5F, cqp.dH);
      a(0.5F, cqp.rV);
      a(0.5F, cqp.fV);
      a(0.65F, cqp.cS);
      a(0.65F, cqp.ga);
      a(0.65F, cqp.fj);
      a(0.65F, cqp.fk);
      a(0.65F, cqp.fT);
      a(0.65F, cqp.os);
      a(0.65F, cqp.vi);
      a(0.65F, cqp.ud);
      a(0.65F, cqp.rg);
      a(0.65F, cqp.ue);
      a(0.65F, cqp.pv);
      a(0.65F, cqp.dz);
      a(0.65F, cqp.dA);
      a(0.65F, cqp.fP);
      a(0.65F, cqp.dB);
      a(0.65F, cqp.dC);
      a(0.65F, cqp.si);
      a(0.65F, cqp.dD);
      a(0.65F, cqp.dE);
      a(0.65F, cqp.wr);
      a(0.65F, cqp.dj);
      a(0.65F, cqp.dk);
      a(0.65F, cqp.dl);
      a(0.65F, cqp.dm);
      a(0.65F, cqp.dn);
      a(0.65F, cqp.do);
      a(0.65F, cqp.dp);
      a(0.65F, cqp.dq);
      a(0.65F, cqp.dr);
      a(0.65F, cqp.ds);
      a(0.65F, cqp.dt);
      a(0.65F, cqp.du);
      a(0.65F, cqp.dv);
      a(0.65F, cqp.cN);
      a(0.65F, cqp.hW);
      a(0.65F, cqp.hX);
      a(0.65F, cqp.hY);
      a(0.65F, cqp.hZ);
      a(0.65F, cqp.ib);
      a(0.65F, cqp.dy);
      a(0.65F, cqp.cO);
      a(0.65F, cqp.dM);
      a(0.65F, cqp.dO);
      a(0.85F, cqp.hC);
      a(0.85F, cqp.fN);
      a(0.85F, cqp.fO);
      a(0.85F, cqp.iW);
      a(0.85F, cqp.iX);
      a(0.85F, cqp.cP);
      a(0.85F, cqp.pw);
      a(0.85F, cqp.uf);
      a(0.85F, cqp.rR);
      a(0.85F, cqp.dw);
      a(0.85F, cqp.dx);
      a(1.0F, cqp.rA);
      a(1.0F, cqp.ur);
   }

   private static void a(float $$0, cxa $$1) {
      f.put($$1.l(), $$0);
   }

   public dbn(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(cxb $$0, ib $$1, boolean $$2) {
      dnb $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? aty.fo : aty.fn, atz.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ih.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      axd $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            kc.O,
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
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2) {
      return h;
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return i[0];
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.d())) {
         if ($$7 < 7 && !$$2.B) {
            dnb $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(aui.c.b($$0.d()));
            $$0.a(1, $$4);
         }

         return bnf.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bnd.a($$1.B);
      } else {
         return bnd.d;
      }
   }

   public static dnb a(box $$0, dnb $$1, apf $$2, cqm $$3, ib $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         dnb $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dnb a(box $$0, dnb $$1, cxb $$2, ib $$3) {
      if (!$$2.B) {
         ept $$4 = ept.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cfe $$5 = new cfe($$2, $$4.a(), $$4.b(), $$4.c(), new cqm(cqp.rx));
         $$5.s();
         $$2.b($$5);
      }

      dnb $$6 = a($$0, $$1, (cxc)$$2, $$3);
      $$2.a(null, $$3, aty.fm, atz.e, 1.0F, 1.0F);
      return $$6;
   }

   static dnb a(@Nullable box $$0, dnb $$1, cxc $$2, ib $$3) {
      dnb $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(drp.c, $$3, drp.a.a($$0, $$4));
      return $$4;
   }

   static dnb a(@Nullable box $$0, dnb $$1, cxc $$2, ib $$3, cqm $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dnb $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(drp.c, $$3, drp.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, aty.fp, atz.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   public bnp a(dnb $$0, cxc $$1, ib $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dbn.c($$0, $$1, $$2, new cqm(cqp.rx));
      } else {
         return (bnp)($$3 < 7 ? new dbn.b($$0, $$1, $$2) : new dbn.a());
      }
   }

   static class a extends bnm implements bnp {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ih $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cqm $$1, @Nullable ih $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cqm $$1, ih $$2) {
         return false;
      }
   }

   static class b extends bnm implements bnp {
      private final dnb c;
      private final cxc d;
      private final ib e;
      private boolean f;

      public b(dnb $$0, cxc $$1, ib $$2) {
         super(1);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(ih $$0) {
         return $$0 == ih.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cqm $$1, @Nullable ih $$2) {
         return !this.f && $$2 == ih.b && dbn.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cqm $$1, ih $$2) {
         return false;
      }

      @Override
      public void e() {
         cqm $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dnb $$1 = dbn.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bnm implements bnp {
      private final dnb c;
      private final cxc d;
      private final ib e;
      private boolean f;

      public c(dnb $$0, cxc $$1, ib $$2, cqm $$3) {
         super($$3);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(ih $$0) {
         return $$0 == ih.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cqm $$1, @Nullable ih $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cqm $$1, ih $$2) {
         return !this.f && $$2 == ih.a && $$1.a(cqp.rx);
      }

      @Override
      public void e() {
         dbn.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
