import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dig extends dgv implements brv {
   public static final MapCodec<dig> a = b(dig::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dva e = duq.aL;
   public static final Object2FloatMap<ddr> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final eyx h = eyu.b();
   private static final eyx[] i = ad.a(new eyx[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = eyu.a(h, dgv.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), eyi.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dig> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cvo.cx);
      a(0.3F, cvo.cu);
      a(0.3F, cvo.cv);
      a(0.3F, cvo.cA);
      a(0.3F, cvo.cy);
      a(0.3F, cvo.cz);
      a(0.3F, cvo.cw);
      a(0.3F, cvo.cC);
      a(0.3F, cvo.cB);
      a(0.3F, cvo.W);
      a(0.3F, cvo.X);
      a(0.3F, cvo.Y);
      a(0.3F, cvo.Z);
      a(0.3F, cvo.aa);
      a(0.3F, cvo.ab);
      a(0.3F, cvo.ac);
      a(0.3F, cvo.ad);
      a(0.3F, cvo.vn);
      a(0.3F, cvo.rY);
      a(0.3F, cvo.cN);
      a(0.3F, cvo.dK);
      a(0.3F, cvo.sa);
      a(0.3F, cvo.rZ);
      a(0.3F, cvo.cS);
      a(0.3F, cvo.wx);
      a(0.3F, cvo.wy);
      a(0.3F, cvo.pw);
      a(0.3F, cvo.dL);
      a(0.3F, cvo.dM);
      a(0.3F, cvo.dQ);
      a(0.3F, cvo.dO);
      a(0.3F, cvo.bK);
      a(0.3F, cvo.vk);
      a(0.3F, cvo.vl);
      a(0.5F, cvo.qO);
      a(0.5F, cvo.ib);
      a(0.5F, cvo.cD);
      a(0.5F, cvo.eW);
      a(0.5F, cvo.dJ);
      a(0.5F, cvo.fV);
      a(0.5F, cvo.dG);
      a(0.5F, cvo.dH);
      a(0.5F, cvo.dI);
      a(0.5F, cvo.rX);
      a(0.5F, cvo.fW);
      a(0.65F, cvo.cT);
      a(0.65F, cvo.gb);
      a(0.65F, cvo.fk);
      a(0.65F, cvo.fl);
      a(0.65F, cvo.fU);
      a(0.65F, cvo.ov);
      a(0.65F, cvo.vm);
      a(0.65F, cvo.uh);
      a(0.65F, cvo.ri);
      a(0.65F, cvo.ui);
      a(0.65F, cvo.px);
      a(0.65F, cvo.dA);
      a(0.65F, cvo.dB);
      a(0.65F, cvo.fQ);
      a(0.65F, cvo.dC);
      a(0.65F, cvo.dD);
      a(0.65F, cvo.sk);
      a(0.65F, cvo.dE);
      a(0.65F, cvo.dF);
      a(0.65F, cvo.wB);
      a(0.65F, cvo.dk);
      a(0.65F, cvo.dl);
      a(0.65F, cvo.dm);
      a(0.65F, cvo.dn);
      a(0.65F, cvo.do);
      a(0.65F, cvo.dp);
      a(0.65F, cvo.dq);
      a(0.65F, cvo.dr);
      a(0.65F, cvo.ds);
      a(0.65F, cvo.dt);
      a(0.65F, cvo.du);
      a(0.65F, cvo.dv);
      a(0.65F, cvo.dw);
      a(0.65F, cvo.cO);
      a(0.65F, cvo.hX);
      a(0.65F, cvo.hY);
      a(0.65F, cvo.hZ);
      a(0.65F, cvo.ia);
      a(0.65F, cvo.ic);
      a(0.65F, cvo.dz);
      a(0.65F, cvo.cP);
      a(0.65F, cvo.dN);
      a(0.65F, cvo.dP);
      a(0.85F, cvo.hD);
      a(0.85F, cvo.fO);
      a(0.85F, cvo.fP);
      a(0.85F, cvo.iX);
      a(0.85F, cvo.iY);
      a(0.85F, cvo.cQ);
      a(0.85F, cvo.py);
      a(0.85F, cvo.uj);
      a(0.85F, cvo.rT);
      a(0.85F, cvo.dx);
      a(0.85F, cvo.dy);
      a(1.0F, cvo.rC);
      a(1.0F, cvo.uv);
   }

   private static void a(float $$0, ddr $$1) {
      f.put($$1.r(), $$0);
   }

   public dig(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(e, Integer.valueOf(0)));
   }

   public static void a(dds $$0, je $$1, boolean $$2) {
      dua $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? awd.fv : awd.fu, awe.e, 1.0F, 1.0F, false);
      double $$4 = $$3.f($$0, $$1).b(jj.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azk $$7 = $$0.C_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            ln.P,
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
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2) {
      return h;
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return i[0];
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.h())) {
         if ($$7 < 7 && !$$2.B) {
            dua $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awn.c.b($$0.h()));
            $$0.a(1, $$4);
         }

         return brk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return brk.a;
      } else {
         return brk.e;
      }
   }

   public static dua a(btj $$0, dua $$1, arg $$2, cvl $$3, je $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.h())) {
         dua $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dua a(btj $$0, dua $$1, dds $$2, je $$3) {
      if (!$$2.B) {
         eye $$4 = eye.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cjz $$5 = new cjz($$2, $$4.a(), $$4.b(), $$4.c(), new cvl(cvo.rz));
         $$5.q();
         $$2.b($$5);
      }

      dua $$6 = a($$0, $$1, (ddt)$$2, $$3);
      $$2.a(null, $$3, awd.ft, awe.e, 1.0F, 1.0F);
      return $$6;
   }

   static dua a(@Nullable btj $$0, dua $$1, ddt $$2, je $$3) {
      dua $$4 = $$1.b(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dyx.c, $$3, dyx.a.a($$0, $$4));
      return $$4;
   }

   static dua a(@Nullable btj $$0, dua $$1, ddt $$2, je $$3, cvl $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.h());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.C_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dua $$8 = $$1.b(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dyx.c, $$3, dyx.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awd.fw, awe.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   public bru a(dua $$0, ddt $$1, je $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dig.c($$0, $$1, $$2, new cvl(cvo.rz));
      } else {
         return (bru)($$3 < 7 ? new dig.b($$0, $$1, $$2) : new dig.a());
      }
   }

   static class a extends brr implements bru {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jj $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cvl $$1, @Nullable jj $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cvl $$1, jj $$2) {
         return false;
      }
   }

   static class b extends brr implements bru {
      private final dua b;
      private final ddt c;
      private final je d;
      private boolean e;

      public b(dua $$0, ddt $$1, je $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(jj $$0) {
         return $$0 == jj.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cvl $$1, @Nullable jj $$2) {
         return !this.e && $$2 == jj.b && dig.f.containsKey($$1.h());
      }

      @Override
      public boolean b(int $$0, cvl $$1, jj $$2) {
         return false;
      }

      @Override
      public void e() {
         cvl $$0 = this.a(0);
         if (!$$0.f()) {
            this.e = true;
            dua $$1 = dig.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends brr implements bru {
      private final dua b;
      private final ddt c;
      private final je d;
      private boolean e;

      public c(dua $$0, ddt $$1, je $$2, cvl $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ak_() {
         return 1;
      }

      @Override
      public int[] a(jj $$0) {
         return $$0 == jj.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cvl $$1, @Nullable jj $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cvl $$1, jj $$2) {
         return !this.e && $$2 == jj.a && $$1.a(cvo.rz);
      }

      @Override
      public void e() {
         dig.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
