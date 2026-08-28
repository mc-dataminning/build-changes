import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dgk extends dez implements brh {
   public static final MapCodec<dgk> a = b(dgk::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dtc e = dss.aL;
   public static final Object2FloatMap<dbx> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ewk h = ewh.b();
   private static final ewk[] i = ac.a(new ewk[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ewh.a(h, dez.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), evv.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cus.cx);
      a(0.3F, cus.cu);
      a(0.3F, cus.cv);
      a(0.3F, cus.cA);
      a(0.3F, cus.cy);
      a(0.3F, cus.cz);
      a(0.3F, cus.cw);
      a(0.3F, cus.cC);
      a(0.3F, cus.cB);
      a(0.3F, cus.W);
      a(0.3F, cus.X);
      a(0.3F, cus.Y);
      a(0.3F, cus.Z);
      a(0.3F, cus.aa);
      a(0.3F, cus.ab);
      a(0.3F, cus.ac);
      a(0.3F, cus.ad);
      a(0.3F, cus.vl);
      a(0.3F, cus.rX);
      a(0.3F, cus.cN);
      a(0.3F, cus.dK);
      a(0.3F, cus.rZ);
      a(0.3F, cus.rY);
      a(0.3F, cus.cS);
      a(0.3F, cus.wr);
      a(0.3F, cus.ws);
      a(0.3F, cus.pv);
      a(0.3F, cus.dL);
      a(0.3F, cus.dM);
      a(0.3F, cus.dQ);
      a(0.3F, cus.dO);
      a(0.3F, cus.bK);
      a(0.3F, cus.vi);
      a(0.3F, cus.vj);
      a(0.5F, cus.qN);
      a(0.5F, cus.ib);
      a(0.5F, cus.cD);
      a(0.5F, cus.eW);
      a(0.5F, cus.dJ);
      a(0.5F, cus.fV);
      a(0.5F, cus.dG);
      a(0.5F, cus.dH);
      a(0.5F, cus.dI);
      a(0.5F, cus.rW);
      a(0.5F, cus.fW);
      a(0.65F, cus.cT);
      a(0.65F, cus.gb);
      a(0.65F, cus.fk);
      a(0.65F, cus.fl);
      a(0.65F, cus.fU);
      a(0.65F, cus.ot);
      a(0.65F, cus.vk);
      a(0.65F, cus.uf);
      a(0.65F, cus.rh);
      a(0.65F, cus.ug);
      a(0.65F, cus.pw);
      a(0.65F, cus.dA);
      a(0.65F, cus.dB);
      a(0.65F, cus.fQ);
      a(0.65F, cus.dC);
      a(0.65F, cus.dD);
      a(0.65F, cus.sj);
      a(0.65F, cus.dE);
      a(0.65F, cus.dF);
      a(0.65F, cus.wv);
      a(0.65F, cus.dk);
      a(0.65F, cus.dl);
      a(0.65F, cus.dm);
      a(0.65F, cus.dn);
      a(0.65F, cus.do);
      a(0.65F, cus.dp);
      a(0.65F, cus.dq);
      a(0.65F, cus.dr);
      a(0.65F, cus.ds);
      a(0.65F, cus.dt);
      a(0.65F, cus.du);
      a(0.65F, cus.dv);
      a(0.65F, cus.dw);
      a(0.65F, cus.cO);
      a(0.65F, cus.hX);
      a(0.65F, cus.hY);
      a(0.65F, cus.hZ);
      a(0.65F, cus.ia);
      a(0.65F, cus.ic);
      a(0.65F, cus.dz);
      a(0.65F, cus.cP);
      a(0.65F, cus.dN);
      a(0.65F, cus.dP);
      a(0.85F, cus.hD);
      a(0.85F, cus.fO);
      a(0.85F, cus.fP);
      a(0.85F, cus.iX);
      a(0.85F, cus.iY);
      a(0.85F, cus.cQ);
      a(0.85F, cus.px);
      a(0.85F, cus.uh);
      a(0.85F, cus.rS);
      a(0.85F, cus.dx);
      a(0.85F, cus.dy);
      a(1.0F, cus.rB);
      a(1.0F, cus.ut);
   }

   private static void a(float $$0, dbx $$1) {
      f.put($$1.r(), $$0);
   }

   public dgk(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dby $$0, iz $$1, boolean $$2) {
      dsc $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? awa.fu : awa.ft, awb.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(je.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azh $$7 = $$0.E_();

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
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2) {
      return h;
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return i[0];
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            dsc $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awk.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqu.a($$1.B);
      } else {
         return bqu.e;
      }
   }

   public static dsc a(bsu $$0, dsc $$1, arf $$2, cup $$3, iz $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         dsc $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dsc a(bsu $$0, dsc $$1, dby $$2, iz $$3) {
      if (!$$2.B) {
         evr $$4 = evr.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cjh $$5 = new cjh($$2, $$4.a(), $$4.b(), $$4.c(), new cup(cus.ry));
         $$5.v();
         $$2.b($$5);
      }

      dsc $$6 = a($$0, $$1, (dbz)$$2, $$3);
      $$2.a(null, $$3, awa.fs, awb.e, 1.0F, 1.0F);
      return $$6;
   }

   static dsc a(@Nullable bsu $$0, dsc $$1, dbz $$2, iz $$3) {
      dsc $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dwv.c, $$3, dwv.a.a($$0, $$4));
      return $$4;
   }

   static dsc a(@Nullable bsu $$0, dsc $$1, dbz $$2, iz $$3, cup $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dsc $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dwv.c, $$3, dwv.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awa.fv, awb.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Override
   public brg a(dsc $$0, dbz $$1, iz $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dgk.c($$0, $$1, $$2, new cup(cus.ry));
      } else {
         return (brg)($$3 < 7 ? new dgk.b($$0, $$1, $$2) : new dgk.a());
      }
   }

   static class a extends brd implements brg {
      public a() {
         super(0);
      }

      @Override
      public int[] a(je $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cup $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cup $$1, je $$2) {
         return false;
      }
   }

   static class b extends brd implements brg {
      private final dsc b;
      private final dbz c;
      private final iz d;
      private boolean e;

      public b(dsc $$0, dbz $$1, iz $$2) {
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
      public int[] a(je $$0) {
         return $$0 == je.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cup $$1, @Nullable je $$2) {
         return !this.e && $$2 == je.b && dgk.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cup $$1, je $$2) {
         return false;
      }

      @Override
      public void e() {
         cup $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            dsc $$1 = dgk.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends brd implements brg {
      private final dsc b;
      private final dbz c;
      private final iz d;
      private boolean e;

      public c(dsc $$0, dbz $$1, iz $$2, cup $$3) {
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
      public int[] a(je $$0) {
         return $$0 == je.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, cup $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cup $$1, je $$2) {
         return !this.e && $$2 == je.a && $$1.a(cus.ry);
      }

      @Override
      public void e() {
         dgk.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
