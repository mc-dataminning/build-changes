import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class djj extends dhy implements bsj {
   public static final MapCodec<djj> a = b(djj::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dwd e = dvt.aL;
   public static final Object2FloatMap<deu> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final fab h = ezy.b();
   private static final fab[] i = ad.a(new fab[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ezy.a(h, dhy.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ezl.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cwb.cx);
      a(0.3F, cwb.cu);
      a(0.3F, cwb.cv);
      a(0.3F, cwb.cA);
      a(0.3F, cwb.cy);
      a(0.3F, cwb.cz);
      a(0.3F, cwb.cw);
      a(0.3F, cwb.cC);
      a(0.3F, cwb.cB);
      a(0.3F, cwb.W);
      a(0.3F, cwb.X);
      a(0.3F, cwb.Y);
      a(0.3F, cwb.Z);
      a(0.3F, cwb.aa);
      a(0.3F, cwb.ab);
      a(0.3F, cwb.ac);
      a(0.3F, cwb.ad);
      a(0.3F, cwb.vn);
      a(0.3F, cwb.rY);
      a(0.3F, cwb.cN);
      a(0.3F, cwb.dK);
      a(0.3F, cwb.sa);
      a(0.3F, cwb.rZ);
      a(0.3F, cwb.cS);
      a(0.3F, cwb.wx);
      a(0.3F, cwb.wy);
      a(0.3F, cwb.pw);
      a(0.3F, cwb.dL);
      a(0.3F, cwb.dM);
      a(0.3F, cwb.dQ);
      a(0.3F, cwb.dO);
      a(0.3F, cwb.bK);
      a(0.3F, cwb.vk);
      a(0.3F, cwb.vl);
      a(0.5F, cwb.qO);
      a(0.5F, cwb.ib);
      a(0.5F, cwb.cD);
      a(0.5F, cwb.eW);
      a(0.5F, cwb.dJ);
      a(0.5F, cwb.fV);
      a(0.5F, cwb.dG);
      a(0.5F, cwb.dH);
      a(0.5F, cwb.dI);
      a(0.5F, cwb.rX);
      a(0.5F, cwb.fW);
      a(0.65F, cwb.cT);
      a(0.65F, cwb.gb);
      a(0.65F, cwb.fk);
      a(0.65F, cwb.fl);
      a(0.65F, cwb.fU);
      a(0.65F, cwb.ov);
      a(0.65F, cwb.vm);
      a(0.65F, cwb.uh);
      a(0.65F, cwb.ri);
      a(0.65F, cwb.ui);
      a(0.65F, cwb.px);
      a(0.65F, cwb.dA);
      a(0.65F, cwb.dB);
      a(0.65F, cwb.fQ);
      a(0.65F, cwb.dC);
      a(0.65F, cwb.dD);
      a(0.65F, cwb.sk);
      a(0.65F, cwb.dE);
      a(0.65F, cwb.dF);
      a(0.65F, cwb.wB);
      a(0.65F, cwb.dk);
      a(0.65F, cwb.dl);
      a(0.65F, cwb.dm);
      a(0.65F, cwb.dn);
      a(0.65F, cwb.do);
      a(0.65F, cwb.dp);
      a(0.65F, cwb.dq);
      a(0.65F, cwb.dr);
      a(0.65F, cwb.ds);
      a(0.65F, cwb.dt);
      a(0.65F, cwb.du);
      a(0.65F, cwb.dv);
      a(0.65F, cwb.dw);
      a(0.65F, cwb.cO);
      a(0.65F, cwb.hX);
      a(0.65F, cwb.hY);
      a(0.65F, cwb.hZ);
      a(0.65F, cwb.ia);
      a(0.65F, cwb.ic);
      a(0.65F, cwb.dz);
      a(0.65F, cwb.cP);
      a(0.65F, cwb.dN);
      a(0.65F, cwb.dP);
      a(0.85F, cwb.hD);
      a(0.85F, cwb.fO);
      a(0.85F, cwb.fP);
      a(0.85F, cwb.iX);
      a(0.85F, cwb.iY);
      a(0.85F, cwb.cQ);
      a(0.85F, cwb.py);
      a(0.85F, cwb.uj);
      a(0.85F, cwb.rT);
      a(0.85F, cwb.dx);
      a(0.85F, cwb.dy);
      a(1.0F, cwb.rC);
      a(1.0F, cwb.uv);
   }

   private static void a(float $$0, deu $$1) {
      f.put($$1.j(), $$0);
   }

   public djj(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   public static void a(dev $$0, jg $$1, boolean $$2) {
      dvd $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? awk.fv : awk.fu, awl.e, 1.0F, 1.0F, false);
      double $$4 = $$3.f($$0, $$1).b(jl.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azr $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            lq.P,
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
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2) {
      return h;
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return i[0];
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.h())) {
         if ($$7 < 7 && !$$2.C) {
            dvd $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awu.c.b($$0.h()));
            $$0.a(1, $$4);
         }

         return bry.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bry.a;
      } else {
         return bry.e;
      }
   }

   public static dvd a(btz $$0, dvd $$1, arm $$2, cvx $$3, jg $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.h())) {
         dvd $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dvd a(btz $$0, dvd $$1, dev $$2, jg $$3) {
      if (!$$2.C) {
         ezh $$4 = ezh.a($$3, 0.5, 1.01, 0.5).a($$2.A, 0.7F);
         ckq $$5 = new ckq($$2, $$4.a(), $$4.b(), $$4.c(), new cvx(cwb.rz));
         $$5.q();
         $$2.b($$5);
      }

      dvd $$6 = a($$0, $$1, (dew)$$2, $$3);
      $$2.a(null, $$3, awk.ft, awl.e, 1.0F, 1.0F);
      return $$6;
   }

   static dvd a(@Nullable btz $$0, dvd $$1, dew $$2, jg $$3) {
      dvd $$4 = $$1.b(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(eaa.c, $$3, eaa.a.a($$0, $$4));
      return $$4;
   }

   static dvd a(@Nullable btz $$0, dvd $$1, dew $$2, jg $$3, cvx $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.h());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dvd $$8 = $$1.b(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(eaa.c, $$3, eaa.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awk.fw, awl.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   public bsi a(dvd $$0, dew $$1, jg $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new djj.c($$0, $$1, $$2, new cvx(cwb.rz));
      } else {
         return (bsi)($$3 < 7 ? new djj.b($$0, $$1, $$2) : new djj.a());
      }
   }

   static class a extends bsf implements bsi {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jl $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cvx $$1, @Nullable jl $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cvx $$1, jl $$2) {
         return false;
      }
   }

   static class b extends bsf implements bsi {
      private final dvd b;
      private final dew c;
      private final jg d;
      private boolean e;

      public b(dvd $$0, dew $$1, jg $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int am_() {
         return 1;
      }

      @Override
      public int[] a(jl $$0) {
         return $$0 == jl.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cvx $$1, @Nullable jl $$2) {
         return !this.e && $$2 == jl.b && djj.f.containsKey($$1.h());
      }

      @Override
      public boolean b(int $$0, cvx $$1, jl $$2) {
         return false;
      }

      @Override
      public void e() {
         cvx $$0 = this.a(0);
         if (!$$0.f()) {
            this.e = true;
            dvd $$1 = djj.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bsf implements bsi {
      private final dvd b;
      private final dew c;
      private final jg d;
      private boolean e;

      public c(dvd $$0, dew $$1, jg $$2, cvx $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int am_() {
         return 1;
      }

      @Override
      public int[] a(jl $$0) {
         return $$0 == jl.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cvx $$1, @Nullable jl $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cvx $$1, jl $$2) {
         return !this.e && $$2 == jl.a && $$1.a(cwb.rz);
      }

      @Override
      public void e() {
         djj.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
