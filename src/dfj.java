import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dfj extends ddy implements bqh {
   public static final MapCodec<dfj> a = b(dfj::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dsb e = drr.aL;
   public static final Object2FloatMap<daw> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final evd h = eva.b();
   private static final evd[] i = ac.a(new evd[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = eva.a(h, ddy.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), euo.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, ctr.cx);
      a(0.3F, ctr.cu);
      a(0.3F, ctr.cv);
      a(0.3F, ctr.cA);
      a(0.3F, ctr.cy);
      a(0.3F, ctr.cz);
      a(0.3F, ctr.cw);
      a(0.3F, ctr.cC);
      a(0.3F, ctr.cB);
      a(0.3F, ctr.W);
      a(0.3F, ctr.X);
      a(0.3F, ctr.Y);
      a(0.3F, ctr.Z);
      a(0.3F, ctr.aa);
      a(0.3F, ctr.ab);
      a(0.3F, ctr.ac);
      a(0.3F, ctr.ad);
      a(0.3F, ctr.vl);
      a(0.3F, ctr.rX);
      a(0.3F, ctr.cN);
      a(0.3F, ctr.dK);
      a(0.3F, ctr.rZ);
      a(0.3F, ctr.rY);
      a(0.3F, ctr.cS);
      a(0.3F, ctr.wr);
      a(0.3F, ctr.ws);
      a(0.3F, ctr.pv);
      a(0.3F, ctr.dL);
      a(0.3F, ctr.dM);
      a(0.3F, ctr.dQ);
      a(0.3F, ctr.dO);
      a(0.3F, ctr.bK);
      a(0.3F, ctr.vi);
      a(0.3F, ctr.vj);
      a(0.5F, ctr.qN);
      a(0.5F, ctr.ib);
      a(0.5F, ctr.cD);
      a(0.5F, ctr.eW);
      a(0.5F, ctr.dJ);
      a(0.5F, ctr.fV);
      a(0.5F, ctr.dG);
      a(0.5F, ctr.dH);
      a(0.5F, ctr.dI);
      a(0.5F, ctr.rW);
      a(0.5F, ctr.fW);
      a(0.65F, ctr.cT);
      a(0.65F, ctr.gb);
      a(0.65F, ctr.fk);
      a(0.65F, ctr.fl);
      a(0.65F, ctr.fU);
      a(0.65F, ctr.ot);
      a(0.65F, ctr.vk);
      a(0.65F, ctr.uf);
      a(0.65F, ctr.rh);
      a(0.65F, ctr.ug);
      a(0.65F, ctr.pw);
      a(0.65F, ctr.dA);
      a(0.65F, ctr.dB);
      a(0.65F, ctr.fQ);
      a(0.65F, ctr.dC);
      a(0.65F, ctr.dD);
      a(0.65F, ctr.sj);
      a(0.65F, ctr.dE);
      a(0.65F, ctr.dF);
      a(0.65F, ctr.wv);
      a(0.65F, ctr.dk);
      a(0.65F, ctr.dl);
      a(0.65F, ctr.dm);
      a(0.65F, ctr.dn);
      a(0.65F, ctr.do);
      a(0.65F, ctr.dp);
      a(0.65F, ctr.dq);
      a(0.65F, ctr.dr);
      a(0.65F, ctr.ds);
      a(0.65F, ctr.dt);
      a(0.65F, ctr.du);
      a(0.65F, ctr.dv);
      a(0.65F, ctr.dw);
      a(0.65F, ctr.cO);
      a(0.65F, ctr.hX);
      a(0.65F, ctr.hY);
      a(0.65F, ctr.hZ);
      a(0.65F, ctr.ia);
      a(0.65F, ctr.ic);
      a(0.65F, ctr.dz);
      a(0.65F, ctr.cP);
      a(0.65F, ctr.dN);
      a(0.65F, ctr.dP);
      a(0.85F, ctr.hD);
      a(0.85F, ctr.fO);
      a(0.85F, ctr.fP);
      a(0.85F, ctr.iX);
      a(0.85F, ctr.iY);
      a(0.85F, ctr.cQ);
      a(0.85F, ctr.px);
      a(0.85F, ctr.uh);
      a(0.85F, ctr.rS);
      a(0.85F, ctr.dx);
      a(0.85F, ctr.dy);
      a(1.0F, ctr.rB);
      a(1.0F, ctr.ut);
   }

   private static void a(float $$0, daw $$1) {
      f.put($$1.q(), $$0);
   }

   public dfj(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dax $$0, io $$1, boolean $$2) {
      drb $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avh.fu : avh.ft, avi.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(it.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      ayk $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            ky.P,
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
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2) {
      return h;
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return i[0];
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            drb $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(avr.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bpw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bpu.a($$1.B);
      } else {
         return bpu.d;
      }
   }

   public static drb a(bru $$0, drb $$1, aqm $$2, cto $$3, io $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         drb $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static drb a(bru $$0, drb $$1, dax $$2, io $$3) {
      if (!$$2.B) {
         euk $$4 = euk.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cig $$5 = new cig($$2, $$4.a(), $$4.b(), $$4.c(), new cto(ctr.ry));
         $$5.v();
         $$2.b($$5);
      }

      drb $$6 = a($$0, $$1, (day)$$2, $$3);
      $$2.a(null, $$3, avh.fs, avi.e, 1.0F, 1.0F);
      return $$6;
   }

   static drb a(@Nullable bru $$0, drb $$1, day $$2, io $$3) {
      drb $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dvu.c, $$3, dvu.a.a($$0, $$4));
      return $$4;
   }

   static drb a(@Nullable bru $$0, drb $$1, day $$2, io $$3, cto $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         drb $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dvu.c, $$3, dvu.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avh.fv, avi.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   public bqg a(drb $$0, day $$1, io $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dfj.c($$0, $$1, $$2, new cto(ctr.ry));
      } else {
         return (bqg)($$3 < 7 ? new dfj.b($$0, $$1, $$2) : new dfj.a());
      }
   }

   static class a extends bqd implements bqg {
      public a() {
         super(0);
      }

      @Override
      public int[] a(it $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cto $$1, @Nullable it $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cto $$1, it $$2) {
         return false;
      }
   }

   static class b extends bqd implements bqg {
      private final drb b;
      private final day c;
      private final io d;
      private boolean e;

      public b(drb $$0, day $$1, io $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public int[] a(it $$0) {
         return $$0 == it.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cto $$1, @Nullable it $$2) {
         return !this.e && $$2 == it.b && dfj.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cto $$1, it $$2) {
         return false;
      }

      @Override
      public void e() {
         cto $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            drb $$1 = dfj.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bqd implements bqg {
      private final drb b;
      private final day c;
      private final io d;
      private boolean e;

      public c(drb $$0, day $$1, io $$2, cto $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public int[] a(it $$0) {
         return $$0 == it.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cto $$1, @Nullable it $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cto $$1, it $$2) {
         return !this.e && $$2 == it.a && $$1.a(ctr.ry);
      }

      @Override
      public void e() {
         dfj.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
