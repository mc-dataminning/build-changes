import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class ddj extends dby implements bon {
   public static final MapCodec<ddj> a = b(ddj::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dpz e = dpp.aL;
   public static final Object2FloatMap<cyw> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final est h = esq.b();
   private static final est[] i = ac.a(new est[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = esq.a(h, dby.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ese.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, crm.cw);
      a(0.3F, crm.ct);
      a(0.3F, crm.cu);
      a(0.3F, crm.cz);
      a(0.3F, crm.cx);
      a(0.3F, crm.cy);
      a(0.3F, crm.cv);
      a(0.3F, crm.cB);
      a(0.3F, crm.cA);
      a(0.3F, crm.W);
      a(0.3F, crm.X);
      a(0.3F, crm.Y);
      a(0.3F, crm.Z);
      a(0.3F, crm.aa);
      a(0.3F, crm.ab);
      a(0.3F, crm.ac);
      a(0.3F, crm.ad);
      a(0.3F, crm.vj);
      a(0.3F, crm.rW);
      a(0.3F, crm.cM);
      a(0.3F, crm.dJ);
      a(0.3F, crm.rY);
      a(0.3F, crm.rX);
      a(0.3F, crm.cR);
      a(0.3F, crm.wn);
      a(0.3F, crm.wo);
      a(0.3F, crm.pu);
      a(0.3F, crm.dK);
      a(0.3F, crm.dL);
      a(0.3F, crm.dP);
      a(0.3F, crm.dN);
      a(0.3F, crm.bJ);
      a(0.3F, crm.vg);
      a(0.3F, crm.vh);
      a(0.5F, crm.qM);
      a(0.5F, crm.ia);
      a(0.5F, crm.cC);
      a(0.5F, crm.eV);
      a(0.5F, crm.dI);
      a(0.5F, crm.fU);
      a(0.5F, crm.dF);
      a(0.5F, crm.dG);
      a(0.5F, crm.dH);
      a(0.5F, crm.rV);
      a(0.5F, crm.fV);
      a(0.65F, crm.cS);
      a(0.65F, crm.ga);
      a(0.65F, crm.fj);
      a(0.65F, crm.fk);
      a(0.65F, crm.fT);
      a(0.65F, crm.os);
      a(0.65F, crm.vi);
      a(0.65F, crm.ud);
      a(0.65F, crm.rg);
      a(0.65F, crm.ue);
      a(0.65F, crm.pv);
      a(0.65F, crm.dz);
      a(0.65F, crm.dA);
      a(0.65F, crm.fP);
      a(0.65F, crm.dB);
      a(0.65F, crm.dC);
      a(0.65F, crm.si);
      a(0.65F, crm.dD);
      a(0.65F, crm.dE);
      a(0.65F, crm.wr);
      a(0.65F, crm.dj);
      a(0.65F, crm.dk);
      a(0.65F, crm.dl);
      a(0.65F, crm.dm);
      a(0.65F, crm.dn);
      a(0.65F, crm.do);
      a(0.65F, crm.dp);
      a(0.65F, crm.dq);
      a(0.65F, crm.dr);
      a(0.65F, crm.ds);
      a(0.65F, crm.dt);
      a(0.65F, crm.du);
      a(0.65F, crm.dv);
      a(0.65F, crm.cN);
      a(0.65F, crm.hW);
      a(0.65F, crm.hX);
      a(0.65F, crm.hY);
      a(0.65F, crm.hZ);
      a(0.65F, crm.ib);
      a(0.65F, crm.dy);
      a(0.65F, crm.cO);
      a(0.65F, crm.dM);
      a(0.65F, crm.dO);
      a(0.85F, crm.hC);
      a(0.85F, crm.fN);
      a(0.85F, crm.fO);
      a(0.85F, crm.iW);
      a(0.85F, crm.iX);
      a(0.85F, crm.cP);
      a(0.85F, crm.pw);
      a(0.85F, crm.uf);
      a(0.85F, crm.rR);
      a(0.85F, crm.dw);
      a(0.85F, crm.dx);
      a(1.0F, crm.rA);
      a(1.0F, crm.ur);
   }

   private static void a(float $$0, cyw $$1) {
      f.put($$1.p(), $$0);
   }

   public ddj(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(cyx $$0, ib $$1, boolean $$2) {
      doz $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? aum.fp : aum.fo, aun.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ih.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      axr $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            kl.O,
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
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2) {
      return h;
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return i[0];
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.f())) {
         if ($$7 < 7 && !$$2.B) {
            doz $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(auw.c.b($$0.f()));
            $$0.a(1, $$4);
         }

         return boc.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return boa.a($$1.B);
      } else {
         return boa.d;
      }
   }

   public static doz a(bpv $$0, doz $$1, aps $$2, crj $$3, ib $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.f())) {
         doz $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.g(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static doz a(bpv $$0, doz $$1, cyx $$2, ib $$3) {
      if (!$$2.B) {
         esa $$4 = esa.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cgd $$5 = new cgd($$2, $$4.a(), $$4.b(), $$4.c(), new crj(crm.rx));
         $$5.v();
         $$2.b($$5);
      }

      doz $$6 = a($$0, $$1, (cyy)$$2, $$3);
      $$2.a(null, $$3, aum.fn, aun.e, 1.0F, 1.0F);
      return $$6;
   }

   static doz a(@Nullable bpv $$0, doz $$1, cyy $$2, ib $$3) {
      doz $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dts.c, $$3, dts.a.a($$0, $$4));
      return $$4;
   }

   static doz a(@Nullable bpv $$0, doz $$1, cyy $$2, ib $$3, crj $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.f());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         doz $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dts.c, $$3, dts.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, aum.fq, aun.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   public bom a(doz $$0, cyy $$1, ib $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new ddj.c($$0, $$1, $$2, new crj(crm.rx));
      } else {
         return (bom)($$3 < 7 ? new ddj.b($$0, $$1, $$2) : new ddj.a());
      }
   }

   static class a extends boj implements bom {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ih $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, crj $$1, @Nullable ih $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, crj $$1, ih $$2) {
         return false;
      }
   }

   static class b extends boj implements bom {
      private final doz c;
      private final cyy d;
      private final ib e;
      private boolean f;

      public b(doz $$0, cyy $$1, ib $$2) {
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
      public int[] a(ih $$0) {
         return $$0 == ih.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, crj $$1, @Nullable ih $$2) {
         return !this.f && $$2 == ih.b && ddj.f.containsKey($$1.f());
      }

      @Override
      public boolean b(int $$0, crj $$1, ih $$2) {
         return false;
      }

      @Override
      public void e() {
         crj $$0 = this.a(0);
         if (!$$0.d()) {
            this.f = true;
            doz $$1 = ddj.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends boj implements bom {
      private final doz c;
      private final cyy d;
      private final ib e;
      private boolean f;

      public c(doz $$0, cyy $$1, ib $$2, crj $$3) {
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
      public int[] a(ih $$0) {
         return $$0 == ih.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, crj $$1, @Nullable ih $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, crj $$1, ih $$2) {
         return !this.f && $$2 == ih.a && $$1.a(crm.rx);
      }

      @Override
      public void e() {
         ddj.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
