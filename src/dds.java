import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dds extends dch implements bos {
   public static final MapCodec<dds> a = b(dds::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dqi e = dpy.aL;
   public static final Object2FloatMap<czf> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final etc h = esz.b();
   private static final etc[] i = ac.a(new etc[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = esz.a(h, dch.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), esn.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dds> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, crv.cw);
      a(0.3F, crv.ct);
      a(0.3F, crv.cu);
      a(0.3F, crv.cz);
      a(0.3F, crv.cx);
      a(0.3F, crv.cy);
      a(0.3F, crv.cv);
      a(0.3F, crv.cB);
      a(0.3F, crv.cA);
      a(0.3F, crv.W);
      a(0.3F, crv.X);
      a(0.3F, crv.Y);
      a(0.3F, crv.Z);
      a(0.3F, crv.aa);
      a(0.3F, crv.ab);
      a(0.3F, crv.ac);
      a(0.3F, crv.ad);
      a(0.3F, crv.vj);
      a(0.3F, crv.rW);
      a(0.3F, crv.cM);
      a(0.3F, crv.dJ);
      a(0.3F, crv.rY);
      a(0.3F, crv.rX);
      a(0.3F, crv.cR);
      a(0.3F, crv.wn);
      a(0.3F, crv.wo);
      a(0.3F, crv.pu);
      a(0.3F, crv.dK);
      a(0.3F, crv.dL);
      a(0.3F, crv.dP);
      a(0.3F, crv.dN);
      a(0.3F, crv.bJ);
      a(0.3F, crv.vg);
      a(0.3F, crv.vh);
      a(0.5F, crv.qM);
      a(0.5F, crv.ia);
      a(0.5F, crv.cC);
      a(0.5F, crv.eV);
      a(0.5F, crv.dI);
      a(0.5F, crv.fU);
      a(0.5F, crv.dF);
      a(0.5F, crv.dG);
      a(0.5F, crv.dH);
      a(0.5F, crv.rV);
      a(0.5F, crv.fV);
      a(0.65F, crv.cS);
      a(0.65F, crv.ga);
      a(0.65F, crv.fj);
      a(0.65F, crv.fk);
      a(0.65F, crv.fT);
      a(0.65F, crv.os);
      a(0.65F, crv.vi);
      a(0.65F, crv.ud);
      a(0.65F, crv.rg);
      a(0.65F, crv.ue);
      a(0.65F, crv.pv);
      a(0.65F, crv.dz);
      a(0.65F, crv.dA);
      a(0.65F, crv.fP);
      a(0.65F, crv.dB);
      a(0.65F, crv.dC);
      a(0.65F, crv.si);
      a(0.65F, crv.dD);
      a(0.65F, crv.dE);
      a(0.65F, crv.wr);
      a(0.65F, crv.dj);
      a(0.65F, crv.dk);
      a(0.65F, crv.dl);
      a(0.65F, crv.dm);
      a(0.65F, crv.dn);
      a(0.65F, crv.do);
      a(0.65F, crv.dp);
      a(0.65F, crv.dq);
      a(0.65F, crv.dr);
      a(0.65F, crv.ds);
      a(0.65F, crv.dt);
      a(0.65F, crv.du);
      a(0.65F, crv.dv);
      a(0.65F, crv.cN);
      a(0.65F, crv.hW);
      a(0.65F, crv.hX);
      a(0.65F, crv.hY);
      a(0.65F, crv.hZ);
      a(0.65F, crv.ib);
      a(0.65F, crv.dy);
      a(0.65F, crv.cO);
      a(0.65F, crv.dM);
      a(0.65F, crv.dO);
      a(0.85F, crv.hC);
      a(0.85F, crv.fN);
      a(0.85F, crv.fO);
      a(0.85F, crv.iW);
      a(0.85F, crv.iX);
      a(0.85F, crv.cP);
      a(0.85F, crv.pw);
      a(0.85F, crv.uf);
      a(0.85F, crv.rR);
      a(0.85F, crv.dw);
      a(0.85F, crv.dx);
      a(1.0F, crv.rA);
      a(1.0F, crv.ur);
   }

   private static void a(float $$0, czf $$1) {
      f.put($$1.p(), $$0);
   }

   public dds(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(czg $$0, id $$1, boolean $$2) {
      dpi $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? auo.fp : auo.fo, aup.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(ij.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      axt $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            kn.O,
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
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2) {
      return h;
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return i[0];
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.f())) {
         if ($$7 < 7 && !$$2.B) {
            dpi $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(auz.c.b($$0.f()));
            $$0.a(1, $$4);
         }

         return boh.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bof.a($$1.B);
      } else {
         return bof.d;
      }
   }

   public static dpi a(bqa $$0, dpi $$1, apu $$2, crs $$3, id $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.f())) {
         dpi $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.g(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dpi a(bqa $$0, dpi $$1, czg $$2, id $$3) {
      if (!$$2.B) {
         esj $$4 = esj.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cgk $$5 = new cgk($$2, $$4.a(), $$4.b(), $$4.c(), new crs(crv.rx));
         $$5.v();
         $$2.b($$5);
      }

      dpi $$6 = a($$0, $$1, (czh)$$2, $$3);
      $$2.a(null, $$3, auo.fn, aup.e, 1.0F, 1.0F);
      return $$6;
   }

   static dpi a(@Nullable bqa $$0, dpi $$1, czh $$2, id $$3) {
      dpi $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dub.c, $$3, dub.a.a($$0, $$4));
      return $$4;
   }

   static dpi a(@Nullable bqa $$0, dpi $$1, czh $$2, id $$3, crs $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.f());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dpi $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dub.c, $$3, dub.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, auo.fq, aup.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   public bor a(dpi $$0, czh $$1, id $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dds.c($$0, $$1, $$2, new crs(crv.rx));
      } else {
         return (bor)($$3 < 7 ? new dds.b($$0, $$1, $$2) : new dds.a());
      }
   }

   static class a extends boo implements bor {
      public a() {
         super(0);
      }

      @Override
      public int[] a(ij $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, crs $$1, @Nullable ij $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, crs $$1, ij $$2) {
         return false;
      }
   }

   static class b extends boo implements bor {
      private final dpi c;
      private final czh d;
      private final id e;
      private boolean f;

      public b(dpi $$0, czh $$1, id $$2) {
         super(1);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public int[] a(ij $$0) {
         return $$0 == ij.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, crs $$1, @Nullable ij $$2) {
         return !this.f && $$2 == ij.b && dds.f.containsKey($$1.f());
      }

      @Override
      public boolean b(int $$0, crs $$1, ij $$2) {
         return false;
      }

      @Override
      public void e() {
         crs $$0 = this.a(0);
         if (!$$0.d()) {
            this.f = true;
            dpi $$1 = dds.a(null, this.c, this.d, this.e, $$0);
            this.d.c(1500, this.e, $$1 != this.c ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends boo implements bor {
      private final dpi c;
      private final czh d;
      private final id e;
      private boolean f;

      public c(dpi $$0, czh $$1, id $$2, crs $$3) {
         super($$3);
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public int ah_() {
         return 1;
      }

      @Override
      public int[] a(ij $$0) {
         return $$0 == ij.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, crs $$1, @Nullable ij $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, crs $$1, ij $$2) {
         return !this.f && $$2 == ij.a && $$1.a(crv.rx);
      }

      @Override
      public void e() {
         dds.a(null, this.c, this.d, this.e);
         this.f = true;
      }
   }
}
