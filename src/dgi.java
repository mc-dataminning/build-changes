import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dgi extends dex implements brf {
   public static final MapCodec<dgi> a = b(dgi::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dta e = dsq.aL;
   public static final Object2FloatMap<dbv> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ewi h = ewf.b();
   private static final ewi[] i = ac.a(new ewi[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ewf.a(h, dex.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), evt.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cuq.cx);
      a(0.3F, cuq.cu);
      a(0.3F, cuq.cv);
      a(0.3F, cuq.cA);
      a(0.3F, cuq.cy);
      a(0.3F, cuq.cz);
      a(0.3F, cuq.cw);
      a(0.3F, cuq.cC);
      a(0.3F, cuq.cB);
      a(0.3F, cuq.W);
      a(0.3F, cuq.X);
      a(0.3F, cuq.Y);
      a(0.3F, cuq.Z);
      a(0.3F, cuq.aa);
      a(0.3F, cuq.ab);
      a(0.3F, cuq.ac);
      a(0.3F, cuq.ad);
      a(0.3F, cuq.vl);
      a(0.3F, cuq.rX);
      a(0.3F, cuq.cN);
      a(0.3F, cuq.dK);
      a(0.3F, cuq.rZ);
      a(0.3F, cuq.rY);
      a(0.3F, cuq.cS);
      a(0.3F, cuq.wr);
      a(0.3F, cuq.ws);
      a(0.3F, cuq.pv);
      a(0.3F, cuq.dL);
      a(0.3F, cuq.dM);
      a(0.3F, cuq.dQ);
      a(0.3F, cuq.dO);
      a(0.3F, cuq.bK);
      a(0.3F, cuq.vi);
      a(0.3F, cuq.vj);
      a(0.5F, cuq.qN);
      a(0.5F, cuq.ib);
      a(0.5F, cuq.cD);
      a(0.5F, cuq.eW);
      a(0.5F, cuq.dJ);
      a(0.5F, cuq.fV);
      a(0.5F, cuq.dG);
      a(0.5F, cuq.dH);
      a(0.5F, cuq.dI);
      a(0.5F, cuq.rW);
      a(0.5F, cuq.fW);
      a(0.65F, cuq.cT);
      a(0.65F, cuq.gb);
      a(0.65F, cuq.fk);
      a(0.65F, cuq.fl);
      a(0.65F, cuq.fU);
      a(0.65F, cuq.ot);
      a(0.65F, cuq.vk);
      a(0.65F, cuq.uf);
      a(0.65F, cuq.rh);
      a(0.65F, cuq.ug);
      a(0.65F, cuq.pw);
      a(0.65F, cuq.dA);
      a(0.65F, cuq.dB);
      a(0.65F, cuq.fQ);
      a(0.65F, cuq.dC);
      a(0.65F, cuq.dD);
      a(0.65F, cuq.sj);
      a(0.65F, cuq.dE);
      a(0.65F, cuq.dF);
      a(0.65F, cuq.wv);
      a(0.65F, cuq.dk);
      a(0.65F, cuq.dl);
      a(0.65F, cuq.dm);
      a(0.65F, cuq.dn);
      a(0.65F, cuq.do);
      a(0.65F, cuq.dp);
      a(0.65F, cuq.dq);
      a(0.65F, cuq.dr);
      a(0.65F, cuq.ds);
      a(0.65F, cuq.dt);
      a(0.65F, cuq.du);
      a(0.65F, cuq.dv);
      a(0.65F, cuq.dw);
      a(0.65F, cuq.cO);
      a(0.65F, cuq.hX);
      a(0.65F, cuq.hY);
      a(0.65F, cuq.hZ);
      a(0.65F, cuq.ia);
      a(0.65F, cuq.ic);
      a(0.65F, cuq.dz);
      a(0.65F, cuq.cP);
      a(0.65F, cuq.dN);
      a(0.65F, cuq.dP);
      a(0.85F, cuq.hD);
      a(0.85F, cuq.fO);
      a(0.85F, cuq.fP);
      a(0.85F, cuq.iX);
      a(0.85F, cuq.iY);
      a(0.85F, cuq.cQ);
      a(0.85F, cuq.px);
      a(0.85F, cuq.uh);
      a(0.85F, cuq.rS);
      a(0.85F, cuq.dx);
      a(0.85F, cuq.dy);
      a(1.0F, cuq.rB);
      a(1.0F, cuq.ut);
   }

   private static void a(float $$0, dbv $$1) {
      f.put($$1.r(), $$0);
   }

   public dgi(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dbw $$0, iz $$1, boolean $$2) {
      dsa $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avz.fu : avz.ft, awa.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(je.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azf $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            li.P,
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
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2) {
      return h;
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return i[0];
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            dsa $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awj.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqu.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqs.a($$1.B);
      } else {
         return bqs.e;
      }
   }

   public static dsa a(bss $$0, dsa $$1, are $$2, cun $$3, iz $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         dsa $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dsa a(bss $$0, dsa $$1, dbw $$2, iz $$3) {
      if (!$$2.B) {
         evp $$4 = evp.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cjf $$5 = new cjf($$2, $$4.a(), $$4.b(), $$4.c(), new cun(cuq.ry));
         $$5.v();
         $$2.b($$5);
      }

      dsa $$6 = a($$0, $$1, (dbx)$$2, $$3);
      $$2.a(null, $$3, avz.fs, awa.e, 1.0F, 1.0F);
      return $$6;
   }

   static dsa a(@Nullable bss $$0, dsa $$1, dbx $$2, iz $$3) {
      dsa $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dwt.c, $$3, dwt.a.a($$0, $$4));
      return $$4;
   }

   static dsa a(@Nullable bss $$0, dsa $$1, dbx $$2, iz $$3, cun $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dsa $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dwt.c, $$3, dwt.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avz.fv, awa.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   public bre a(dsa $$0, dbx $$1, iz $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dgi.c($$0, $$1, $$2, new cun(cuq.ry));
      } else {
         return (bre)($$3 < 7 ? new dgi.b($$0, $$1, $$2) : new dgi.a());
      }
   }

   static class a extends brb implements bre {
      public a() {
         super(0);
      }

      @Override
      public int[] a(je $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cun $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cun $$1, je $$2) {
         return false;
      }
   }

   static class b extends brb implements bre {
      private final dsa b;
      private final dbx c;
      private final iz d;
      private boolean e;

      public b(dsa $$0, dbx $$1, iz $$2) {
         super(1);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ai_() {
         return 1;
      }

      @Override
      public int[] a(je $$0) {
         return $$0 == je.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cun $$1, @Nullable je $$2) {
         return !this.e && $$2 == je.b && dgi.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cun $$1, je $$2) {
         return false;
      }

      @Override
      public void e() {
         cun $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            dsa $$1 = dgi.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends brb implements bre {
      private final dsa b;
      private final dbx c;
      private final iz d;
      private boolean e;

      public c(dsa $$0, dbx $$1, iz $$2, cun $$3) {
         super($$3);
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public int ai_() {
         return 1;
      }

      @Override
      public int[] a(je $$0) {
         return $$0 == je.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cun $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cun $$1, je $$2) {
         return !this.e && $$2 == je.a && $$1.a(cuq.ry);
      }

      @Override
      public void e() {
         dgi.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
