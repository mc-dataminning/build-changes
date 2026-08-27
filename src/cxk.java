import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class cxk extends cvz implements bjx {
   public static final MapCodec<cxk> a = b(cxk::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final djp e = djf.aL;
   public static final Object2FloatMap<csx> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final elu h = elr.b();
   private static final elu[] i = ac.a(new elu[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = elr.a(h, cvz.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), elf.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<cxk> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cmk.cw);
      a(0.3F, cmk.ct);
      a(0.3F, cmk.cu);
      a(0.3F, cmk.cz);
      a(0.3F, cmk.cx);
      a(0.3F, cmk.cy);
      a(0.3F, cmk.cv);
      a(0.3F, cmk.cB);
      a(0.3F, cmk.cA);
      a(0.3F, cmk.W);
      a(0.3F, cmk.X);
      a(0.3F, cmk.Y);
      a(0.3F, cmk.Z);
      a(0.3F, cmk.aa);
      a(0.3F, cmk.ab);
      a(0.3F, cmk.ac);
      a(0.3F, cmk.ad);
      a(0.3F, cmk.ve);
      a(0.3F, cmk.rU);
      a(0.3F, cmk.cM);
      a(0.3F, cmk.dJ);
      a(0.3F, cmk.rW);
      a(0.3F, cmk.rV);
      a(0.3F, cmk.cR);
      a(0.3F, cmk.wi);
      a(0.3F, cmk.wj);
      a(0.3F, cmk.ps);
      a(0.3F, cmk.dK);
      a(0.3F, cmk.dL);
      a(0.3F, cmk.dP);
      a(0.3F, cmk.dN);
      a(0.3F, cmk.bJ);
      a(0.3F, cmk.vb);
      a(0.3F, cmk.vc);
      a(0.5F, cmk.qK);
      a(0.5F, cmk.ia);
      a(0.5F, cmk.cC);
      a(0.5F, cmk.eV);
      a(0.5F, cmk.dI);
      a(0.5F, cmk.fU);
      a(0.5F, cmk.dF);
      a(0.5F, cmk.dG);
      a(0.5F, cmk.dH);
      a(0.5F, cmk.rT);
      a(0.5F, cmk.fV);
      a(0.65F, cmk.cS);
      a(0.65F, cmk.ga);
      a(0.65F, cmk.fj);
      a(0.65F, cmk.fk);
      a(0.65F, cmk.fT);
      a(0.65F, cmk.oq);
      a(0.65F, cmk.vd);
      a(0.65F, cmk.tY);
      a(0.65F, cmk.re);
      a(0.65F, cmk.tZ);
      a(0.65F, cmk.pt);
      a(0.65F, cmk.dz);
      a(0.65F, cmk.dA);
      a(0.65F, cmk.fP);
      a(0.65F, cmk.dB);
      a(0.65F, cmk.dC);
      a(0.65F, cmk.sg);
      a(0.65F, cmk.dD);
      a(0.65F, cmk.dE);
      a(0.65F, cmk.wm);
      a(0.65F, cmk.dj);
      a(0.65F, cmk.dk);
      a(0.65F, cmk.dl);
      a(0.65F, cmk.dm);
      a(0.65F, cmk.dn);
      a(0.65F, cmk.do);
      a(0.65F, cmk.dp);
      a(0.65F, cmk.dq);
      a(0.65F, cmk.dr);
      a(0.65F, cmk.ds);
      a(0.65F, cmk.dt);
      a(0.65F, cmk.du);
      a(0.65F, cmk.dv);
      a(0.65F, cmk.cN);
      a(0.65F, cmk.hW);
      a(0.65F, cmk.hX);
      a(0.65F, cmk.hY);
      a(0.65F, cmk.hZ);
      a(0.65F, cmk.ib);
      a(0.65F, cmk.dy);
      a(0.65F, cmk.cO);
      a(0.65F, cmk.dM);
      a(0.65F, cmk.dO);
      a(0.85F, cmk.hC);
      a(0.85F, cmk.fN);
      a(0.85F, cmk.fO);
      a(0.85F, cmk.iW);
      a(0.85F, cmk.iX);
      a(0.85F, cmk.cP);
      a(0.85F, cmk.pu);
      a(0.85F, cmk.ua);
      a(0.85F, cmk.rP);
      a(0.85F, cmk.dw);
      a(0.85F, cmk.dx);
      a(1.0F, cmk.ry);
      a(1.0F, cmk.um);
   }

   private static void a(float $$0, csx $$1) {
      f.put($$1.k(), $$0);
   }

   public cxk(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(csy $$0, hv $$1, boolean $$2) {
      dip $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? arc.eR : arc.eQ, ard.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ia.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      auf $$7 = $$0.F_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            jv.N,
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
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return i[$$0.c(e)];
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2) {
      return h;
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return i[0];
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      int $$6 = $$0.c(e);
      cmh $$7 = $$3.b($$4);
      if ($$6 < 8 && f.containsKey($$7.d())) {
         if ($$6 < 7 && !$$1.B) {
            dip $$8 = a($$3, $$0, $$1, $$2, $$7);
            $$1.c(1500, $$2, $$0 != $$8 ? 1 : 0);
            $$3.b(arm.c.b($$7.d()));
            if (!$$3.fT().d) {
               $$7.h(1);
            }
         }

         return bjl.a($$1.B);
      } else if ($$6 == 8) {
         a($$3, $$0, $$1, $$2);
         return bjl.a($$1.B);
      } else {
         return bjl.d;
      }
   }

   public static dip a(blf $$0, dip $$1, amp $$2, cmh $$3, hv $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         dip $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dip a(blf $$0, dip $$1, csy $$2, hv $$3) {
      if (!$$2.B) {
         elb $$4 = elb.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cbe $$5 = new cbe($$2, $$4.a(), $$4.b(), $$4.c(), new cmh(cmk.rv));
         $$5.u();
         $$2.b($$5);
      }

      dip $$6 = a($$0, $$1, (csz)$$2, $$3);
      $$2.a(null, $$3, arc.eP, ard.e, 1.0F, 1.0F);
      return $$6;
   }

   static dip a(@Nullable blf $$0, dip $$1, csz $$2, hv $$3) {
      dip $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dmz.c, $$3, dmz.a.a($$0, $$4));
      return $$4;
   }

   static dip a(@Nullable blf $$0, dip $$1, csz $$2, hv $$3, cmh $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.F_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dip $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dmz.c, $$3, dmz.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, arc.eS, ard.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public bjw a(dip $$0, csz $$1, hv $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new cxk.c($$0, $$1, $$2, new cmh(cmk.rv));
      } else {
         return (bjw)($$3 < 7 ? new cxk.b($$0, $$1, $$2) : new cxk.a());
      }
   }

   static class a extends bjt implements bjw {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ia $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cmh $$1, @Nullable ia $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cmh $$1, ia $$2) {
         return false;
      }
   }

   static class b extends bjt implements bjw {
      private final dip c;
      private final csz d;
      private final hv e;
      private boolean f;

      public b(dip $$0, csz $$1, hv $$2) {
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
      public int[] a(ia $$0) {
         return $$0 == ia.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cmh $$1, @Nullable ia $$2) {
         return !this.f && $$2 == ia.b && cxk.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, cmh $$1, ia $$2) {
         return false;
      }

      @Override
      public void e() {
         cmh $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dip $$1 = cxk.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bjt implements bjw {
      private final dip c;
      private final csz d;
      private final hv e;
      private boolean f;

      public c(dip $$0, csz $$1, hv $$2, cmh $$3) {
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
      public int[] a(ia $$0) {
         return $$0 == ia.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cmh $$1, @Nullable ia $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cmh $$1, ia $$2) {
         return !this.f && $$2 == ia.a && $$1.a(cmk.rv);
      }

      @Override
      public void e() {
         cxk.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
