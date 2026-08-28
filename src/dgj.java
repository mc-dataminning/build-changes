import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dgj extends dey implements brg {
   public static final MapCodec<dgj> a = b(dgj::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dtb e = dsr.aL;
   public static final Object2FloatMap<dbw> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ewj h = ewg.b();
   private static final ewj[] i = ac.a(new ewj[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ewg.a(h, dey.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), evu.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cur.cx);
      a(0.3F, cur.cu);
      a(0.3F, cur.cv);
      a(0.3F, cur.cA);
      a(0.3F, cur.cy);
      a(0.3F, cur.cz);
      a(0.3F, cur.cw);
      a(0.3F, cur.cC);
      a(0.3F, cur.cB);
      a(0.3F, cur.W);
      a(0.3F, cur.X);
      a(0.3F, cur.Y);
      a(0.3F, cur.Z);
      a(0.3F, cur.aa);
      a(0.3F, cur.ab);
      a(0.3F, cur.ac);
      a(0.3F, cur.ad);
      a(0.3F, cur.vl);
      a(0.3F, cur.rX);
      a(0.3F, cur.cN);
      a(0.3F, cur.dK);
      a(0.3F, cur.rZ);
      a(0.3F, cur.rY);
      a(0.3F, cur.cS);
      a(0.3F, cur.wr);
      a(0.3F, cur.ws);
      a(0.3F, cur.pv);
      a(0.3F, cur.dL);
      a(0.3F, cur.dM);
      a(0.3F, cur.dQ);
      a(0.3F, cur.dO);
      a(0.3F, cur.bK);
      a(0.3F, cur.vi);
      a(0.3F, cur.vj);
      a(0.5F, cur.qN);
      a(0.5F, cur.ib);
      a(0.5F, cur.cD);
      a(0.5F, cur.eW);
      a(0.5F, cur.dJ);
      a(0.5F, cur.fV);
      a(0.5F, cur.dG);
      a(0.5F, cur.dH);
      a(0.5F, cur.dI);
      a(0.5F, cur.rW);
      a(0.5F, cur.fW);
      a(0.65F, cur.cT);
      a(0.65F, cur.gb);
      a(0.65F, cur.fk);
      a(0.65F, cur.fl);
      a(0.65F, cur.fU);
      a(0.65F, cur.ot);
      a(0.65F, cur.vk);
      a(0.65F, cur.uf);
      a(0.65F, cur.rh);
      a(0.65F, cur.ug);
      a(0.65F, cur.pw);
      a(0.65F, cur.dA);
      a(0.65F, cur.dB);
      a(0.65F, cur.fQ);
      a(0.65F, cur.dC);
      a(0.65F, cur.dD);
      a(0.65F, cur.sj);
      a(0.65F, cur.dE);
      a(0.65F, cur.dF);
      a(0.65F, cur.wv);
      a(0.65F, cur.dk);
      a(0.65F, cur.dl);
      a(0.65F, cur.dm);
      a(0.65F, cur.dn);
      a(0.65F, cur.do);
      a(0.65F, cur.dp);
      a(0.65F, cur.dq);
      a(0.65F, cur.dr);
      a(0.65F, cur.ds);
      a(0.65F, cur.dt);
      a(0.65F, cur.du);
      a(0.65F, cur.dv);
      a(0.65F, cur.dw);
      a(0.65F, cur.cO);
      a(0.65F, cur.hX);
      a(0.65F, cur.hY);
      a(0.65F, cur.hZ);
      a(0.65F, cur.ia);
      a(0.65F, cur.ic);
      a(0.65F, cur.dz);
      a(0.65F, cur.cP);
      a(0.65F, cur.dN);
      a(0.65F, cur.dP);
      a(0.85F, cur.hD);
      a(0.85F, cur.fO);
      a(0.85F, cur.fP);
      a(0.85F, cur.iX);
      a(0.85F, cur.iY);
      a(0.85F, cur.cQ);
      a(0.85F, cur.px);
      a(0.85F, cur.uh);
      a(0.85F, cur.rS);
      a(0.85F, cur.dx);
      a(0.85F, cur.dy);
      a(1.0F, cur.rB);
      a(1.0F, cur.ut);
   }

   private static void a(float $$0, dbw $$1) {
      f.put($$1.r(), $$0);
   }

   public dgj(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dbx $$0, iz $$1, boolean $$2) {
      dsb $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avz.fu : avz.ft, awa.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(je.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azg $$7 = $$0.E_();

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
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2) {
      return h;
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return i[0];
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            dsb $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awj.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqv.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqt.a($$1.B);
      } else {
         return bqt.e;
      }
   }

   public static dsb a(bst $$0, dsb $$1, are $$2, cuo $$3, iz $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         dsb $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dsb a(bst $$0, dsb $$1, dbx $$2, iz $$3) {
      if (!$$2.B) {
         evq $$4 = evq.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cjg $$5 = new cjg($$2, $$4.a(), $$4.b(), $$4.c(), new cuo(cur.ry));
         $$5.v();
         $$2.b($$5);
      }

      dsb $$6 = a($$0, $$1, (dby)$$2, $$3);
      $$2.a(null, $$3, avz.fs, awa.e, 1.0F, 1.0F);
      return $$6;
   }

   static dsb a(@Nullable bst $$0, dsb $$1, dby $$2, iz $$3) {
      dsb $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dwu.c, $$3, dwu.a.a($$0, $$4));
      return $$4;
   }

   static dsb a(@Nullable bst $$0, dsb $$1, dby $$2, iz $$3, cuo $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dsb $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dwu.c, $$3, dwu.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avz.fv, awa.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   public brf a(dsb $$0, dby $$1, iz $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dgj.c($$0, $$1, $$2, new cuo(cur.ry));
      } else {
         return (brf)($$3 < 7 ? new dgj.b($$0, $$1, $$2) : new dgj.a());
      }
   }

   static class a extends brc implements brf {
      public a() {
         super(0);
      }

      @Override
      public int[] a(je $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cuo $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuo $$1, je $$2) {
         return false;
      }
   }

   static class b extends brc implements brf {
      private final dsb b;
      private final dby c;
      private final iz d;
      private boolean e;

      public b(dsb $$0, dby $$1, iz $$2) {
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
      public boolean a(int $$0, cuo $$1, @Nullable je $$2) {
         return !this.e && $$2 == je.b && dgj.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cuo $$1, je $$2) {
         return false;
      }

      @Override
      public void e() {
         cuo $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            dsb $$1 = dgj.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends brc implements brf {
      private final dsb b;
      private final dby c;
      private final iz d;
      private boolean e;

      public c(dsb $$0, dby $$1, iz $$2, cuo $$3) {
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
      public boolean a(int $$0, cuo $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuo $$1, je $$2) {
         return !this.e && $$2 == je.a && $$1.a(cur.ry);
      }

      @Override
      public void e() {
         dgj.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
