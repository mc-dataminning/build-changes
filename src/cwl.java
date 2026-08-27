import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class cwl extends cva implements bji {
   public static final MapCodec<cwl> a = b(cwl::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dii e = dhy.aL;
   public static final Object2FloatMap<crz> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ekn h = ekk.b();
   private static final ekn[] i = ac.a(new ekn[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ekk.a(h, cva.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ejy.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<cwl> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, clm.cw);
      a(0.3F, clm.ct);
      a(0.3F, clm.cu);
      a(0.3F, clm.cz);
      a(0.3F, clm.cx);
      a(0.3F, clm.cy);
      a(0.3F, clm.cv);
      a(0.3F, clm.cB);
      a(0.3F, clm.cA);
      a(0.3F, clm.W);
      a(0.3F, clm.X);
      a(0.3F, clm.Y);
      a(0.3F, clm.Z);
      a(0.3F, clm.aa);
      a(0.3F, clm.ab);
      a(0.3F, clm.ac);
      a(0.3F, clm.ad);
      a(0.3F, clm.vd);
      a(0.3F, clm.rU);
      a(0.3F, clm.cM);
      a(0.3F, clm.dJ);
      a(0.3F, clm.rW);
      a(0.3F, clm.rV);
      a(0.3F, clm.cR);
      a(0.3F, clm.wh);
      a(0.3F, clm.wi);
      a(0.3F, clm.ps);
      a(0.3F, clm.dK);
      a(0.3F, clm.dL);
      a(0.3F, clm.dP);
      a(0.3F, clm.dN);
      a(0.3F, clm.bJ);
      a(0.3F, clm.va);
      a(0.3F, clm.vb);
      a(0.5F, clm.qK);
      a(0.5F, clm.ia);
      a(0.5F, clm.cC);
      a(0.5F, clm.eV);
      a(0.5F, clm.dI);
      a(0.5F, clm.fU);
      a(0.5F, clm.dF);
      a(0.5F, clm.dG);
      a(0.5F, clm.dH);
      a(0.5F, clm.rT);
      a(0.5F, clm.fV);
      a(0.65F, clm.cS);
      a(0.65F, clm.ga);
      a(0.65F, clm.fj);
      a(0.65F, clm.fk);
      a(0.65F, clm.fT);
      a(0.65F, clm.oq);
      a(0.65F, clm.vc);
      a(0.65F, clm.tX);
      a(0.65F, clm.re);
      a(0.65F, clm.tY);
      a(0.65F, clm.pt);
      a(0.65F, clm.dz);
      a(0.65F, clm.dA);
      a(0.65F, clm.fP);
      a(0.65F, clm.dB);
      a(0.65F, clm.dC);
      a(0.65F, clm.sg);
      a(0.65F, clm.dD);
      a(0.65F, clm.dE);
      a(0.65F, clm.wl);
      a(0.65F, clm.dj);
      a(0.65F, clm.dk);
      a(0.65F, clm.dl);
      a(0.65F, clm.dm);
      a(0.65F, clm.dn);
      a(0.65F, clm.do);
      a(0.65F, clm.dp);
      a(0.65F, clm.dq);
      a(0.65F, clm.dr);
      a(0.65F, clm.ds);
      a(0.65F, clm.dt);
      a(0.65F, clm.du);
      a(0.65F, clm.dv);
      a(0.65F, clm.cN);
      a(0.65F, clm.hW);
      a(0.65F, clm.hX);
      a(0.65F, clm.hY);
      a(0.65F, clm.hZ);
      a(0.65F, clm.ib);
      a(0.65F, clm.dy);
      a(0.65F, clm.cO);
      a(0.65F, clm.dM);
      a(0.65F, clm.dO);
      a(0.85F, clm.hC);
      a(0.85F, clm.fN);
      a(0.85F, clm.fO);
      a(0.85F, clm.iW);
      a(0.85F, clm.iX);
      a(0.85F, clm.cP);
      a(0.85F, clm.pu);
      a(0.85F, clm.tZ);
      a(0.85F, clm.rP);
      a(0.85F, clm.dw);
      a(0.85F, clm.dx);
      a(1.0F, clm.ry);
      a(1.0F, clm.ul);
   }

   private static void a(float $$0, crz $$1) {
      f.put($$1.k(), $$0);
   }

   public cwl(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(csa $$0, ht $$1, boolean $$2) {
      dhi $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? aqr.eI : aqr.eH, aqs.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(hx.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      ats $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            js.L,
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
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return i[$$0.c(e)];
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2) {
      return h;
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return i[0];
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      int $$6 = $$0.c(e);
      clj $$7 = $$3.b($$4);
      if ($$6 < 8 && f.containsKey($$7.d())) {
         if ($$6 < 7 && !$$1.B) {
            dhi $$8 = a($$3, $$0, $$1, $$2, $$7);
            $$1.c(1500, $$2, $$0 != $$8 ? 1 : 0);
            $$3.b(arb.c.b($$7.d()));
            if (!$$3.fU().d) {
               $$7.h(1);
            }
         }

         return bix.a($$1.B);
      } else if ($$6 == 8) {
         a($$3, $$0, $$1, $$2);
         return bix.a($$1.B);
      } else {
         return bix.d;
      }
   }

   public static dhi a(bkq $$0, dhi $$1, ame $$2, clj $$3, ht $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.d())) {
         dhi $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dhi a(bkq $$0, dhi $$1, csa $$2, ht $$3) {
      if (!$$2.B) {
         eju $$4 = eju.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         can $$5 = new can($$2, $$4.a(), $$4.b(), $$4.c(), new clj(clm.rv));
         $$5.u();
         $$2.b($$5);
      }

      dhi $$6 = a($$0, $$1, (csb)$$2, $$3);
      $$2.a(null, $$3, aqr.eG, aqs.e, 1.0F, 1.0F);
      return $$6;
   }

   static dhi a(@Nullable bkq $$0, dhi $$1, csb $$2, ht $$3) {
      dhi $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dls.c, $$3, dls.a.a($$0, $$4));
      return $$4;
   }

   static dhi a(@Nullable bkq $$0, dhi $$1, csb $$2, ht $$3, clj $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.d());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dhi $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dls.c, $$3, dls.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, aqr.eJ, aqs.e, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public bjh a(dhi $$0, csb $$1, ht $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new cwl.c($$0, $$1, $$2, new clj(clm.rv));
      } else {
         return (bjh)($$3 < 7 ? new cwl.b($$0, $$1, $$2) : new cwl.a());
      }
   }

   static class a extends bje implements bjh {
      public a() {
         super(0);
      }

      @Override
      public int[] a(hx $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, clj $$1, @Nullable hx $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, clj $$1, hx $$2) {
         return false;
      }
   }

   static class b extends bje implements bjh {
      private final dhi c;
      private final csb d;
      private final ht e;
      private boolean f;

      public b(dhi $$0, csb $$1, ht $$2) {
         super(1);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public int[] a(hx $$0) {
         return $$0 == hx.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, clj $$1, @Nullable hx $$2) {
         return !this.f && $$2 == hx.b && cwl.f.containsKey($$1.d());
      }

      @Override
      public boolean b(int $$0, clj $$1, hx $$2) {
         return false;
      }

      @Override
      public void e() {
         clj $$0 = this.a(0);
         if (!$$0.b()) {
            this.f = true;
            dhi $$1 = cwl.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bje implements bjh {
      private final dhi c;
      private final csb d;
      private final ht e;
      private boolean f;

      public c(dhi $$0, csb $$1, ht $$2, clj $$3) {
         super($$3);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int aj_() {
         return 1;
      }

      @Override
      public int[] a(hx $$0) {
         return $$0 == hx.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, clj $$1, @Nullable hx $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, clj $$1, hx $$2) {
         return !this.f && $$2 == hx.a && $$1.a(clm.rv);
      }

      @Override
      public void e() {
         cwl.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
