import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dgq extends dff implements bqq {
   public static final MapCodec<dgq> a = b(dgq::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dth e = dsx.aL;
   public static final Object2FloatMap<dcc> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ews h = ewp.b();
   private static final ews[] i = ac.a(new ews[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ewp.a(h, dff.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ewd.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cud.cx);
      a(0.3F, cud.cu);
      a(0.3F, cud.cv);
      a(0.3F, cud.cA);
      a(0.3F, cud.cy);
      a(0.3F, cud.cz);
      a(0.3F, cud.cw);
      a(0.3F, cud.cC);
      a(0.3F, cud.cB);
      a(0.3F, cud.W);
      a(0.3F, cud.X);
      a(0.3F, cud.Y);
      a(0.3F, cud.Z);
      a(0.3F, cud.aa);
      a(0.3F, cud.ab);
      a(0.3F, cud.ac);
      a(0.3F, cud.ad);
      a(0.3F, cud.vl);
      a(0.3F, cud.rX);
      a(0.3F, cud.cN);
      a(0.3F, cud.dK);
      a(0.3F, cud.rZ);
      a(0.3F, cud.rY);
      a(0.3F, cud.cS);
      a(0.3F, cud.wu);
      a(0.3F, cud.wv);
      a(0.3F, cud.pv);
      a(0.3F, cud.dL);
      a(0.3F, cud.dM);
      a(0.3F, cud.dQ);
      a(0.3F, cud.dO);
      a(0.3F, cud.bK);
      a(0.3F, cud.vi);
      a(0.3F, cud.vj);
      a(0.5F, cud.qN);
      a(0.5F, cud.ib);
      a(0.5F, cud.cD);
      a(0.5F, cud.eW);
      a(0.5F, cud.dJ);
      a(0.5F, cud.fV);
      a(0.5F, cud.dG);
      a(0.5F, cud.dH);
      a(0.5F, cud.dI);
      a(0.5F, cud.rW);
      a(0.5F, cud.fW);
      a(0.65F, cud.cT);
      a(0.65F, cud.gb);
      a(0.65F, cud.fk);
      a(0.65F, cud.fl);
      a(0.65F, cud.fU);
      a(0.65F, cud.ot);
      a(0.65F, cud.vk);
      a(0.65F, cud.uf);
      a(0.65F, cud.rh);
      a(0.65F, cud.ug);
      a(0.65F, cud.pw);
      a(0.65F, cud.dA);
      a(0.65F, cud.dB);
      a(0.65F, cud.fQ);
      a(0.65F, cud.dC);
      a(0.65F, cud.dD);
      a(0.65F, cud.sj);
      a(0.65F, cud.dE);
      a(0.65F, cud.dF);
      a(0.65F, cud.wy);
      a(0.65F, cud.dk);
      a(0.65F, cud.dl);
      a(0.65F, cud.dm);
      a(0.65F, cud.dn);
      a(0.65F, cud.do);
      a(0.65F, cud.dp);
      a(0.65F, cud.dq);
      a(0.65F, cud.dr);
      a(0.65F, cud.ds);
      a(0.65F, cud.dt);
      a(0.65F, cud.du);
      a(0.65F, cud.dv);
      a(0.65F, cud.dw);
      a(0.65F, cud.cO);
      a(0.65F, cud.hX);
      a(0.65F, cud.hY);
      a(0.65F, cud.hZ);
      a(0.65F, cud.ia);
      a(0.65F, cud.ic);
      a(0.65F, cud.dz);
      a(0.65F, cud.cP);
      a(0.65F, cud.dN);
      a(0.65F, cud.dP);
      a(0.85F, cud.hD);
      a(0.85F, cud.fO);
      a(0.85F, cud.fP);
      a(0.85F, cud.iX);
      a(0.85F, cud.iY);
      a(0.85F, cud.cQ);
      a(0.85F, cud.px);
      a(0.85F, cud.uh);
      a(0.85F, cud.rS);
      a(0.85F, cud.dx);
      a(0.85F, cud.dy);
      a(1.0F, cud.rB);
      a(1.0F, cud.ut);
   }

   private static void a(float $$0, dcc $$1) {
      f.put($$1.r(), $$0);
   }

   public dgq(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dcd $$0, ja $$1, boolean $$2) {
      dsh $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avf.fu : avf.ft, avg.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(jf.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      aym $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            lj.P,
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
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2) {
      return h;
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return i[0];
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            dsh $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(avp.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqf.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqd.a($$1.B);
      } else {
         return bqd.e;
      }
   }

   public static dsh a(bsd $$0, dsh $$1, aqk $$2, cua $$3, ja $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         dsh $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dsh a(bsd $$0, dsh $$1, dcd $$2, ja $$3) {
      if (!$$2.B) {
         evz $$4 = evz.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cir $$5 = new cir($$2, $$4.a(), $$4.b(), $$4.c(), new cua(cud.ry));
         $$5.v();
         $$2.b($$5);
      }

      dsh $$6 = a($$0, $$1, (dce)$$2, $$3);
      $$2.a(null, $$3, avf.fs, avg.e, 1.0F, 1.0F);
      return $$6;
   }

   static dsh a(@Nullable bsd $$0, dsh $$1, dce $$2, ja $$3) {
      dsh $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dxa.c, $$3, dxa.a.a($$0, $$4));
      return $$4;
   }

   static dsh a(@Nullable bsd $$0, dsh $$1, dce $$2, ja $$3, cua $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dsh $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dxa.c, $$3, dxa.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avf.fv, avg.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   public bqp a(dsh $$0, dce $$1, ja $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dgq.c($$0, $$1, $$2, new cua(cud.ry));
      } else {
         return (bqp)($$3 < 7 ? new dgq.b($$0, $$1, $$2) : new dgq.a());
      }
   }

   static class a extends bqm implements bqp {
      public a() {
         super(0);
      }

      @Override
      public int[] a(jf $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cua $$1, @Nullable jf $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cua $$1, jf $$2) {
         return false;
      }
   }

   static class b extends bqm implements bqp {
      private final dsh b;
      private final dce c;
      private final ja d;
      private boolean e;

      public b(dsh $$0, dce $$1, ja $$2) {
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
      public int[] a(jf $$0) {
         return $$0 == jf.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cua $$1, @Nullable jf $$2) {
         return !this.e && $$2 == jf.b && dgq.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cua $$1, jf $$2) {
         return false;
      }

      @Override
      public void e() {
         cua $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            dsh $$1 = dgq.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bqm implements bqp {
      private final dsh b;
      private final dce c;
      private final ja d;
      private boolean e;

      public c(dsh $$0, dce $$1, ja $$2, cua $$3) {
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
      public int[] a(jf $$0) {
         return $$0 == jf.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cua $$1, @Nullable jf $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cua $$1, jf $$2) {
         return !this.e && $$2 == jf.a && $$1.a(cud.ry);
      }

      @Override
      public void e() {
         dgq.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
