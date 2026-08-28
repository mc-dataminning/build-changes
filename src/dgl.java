import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dgl extends dfa implements bri {
   public static final MapCodec<dgl> a = b(dgl::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dtd e = dst.aL;
   public static final Object2FloatMap<dby> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ewl h = ewi.b();
   private static final ewl[] i = ac.a(new ewl[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ewi.a(h, dfa.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), evw.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cut.cx);
      a(0.3F, cut.cu);
      a(0.3F, cut.cv);
      a(0.3F, cut.cA);
      a(0.3F, cut.cy);
      a(0.3F, cut.cz);
      a(0.3F, cut.cw);
      a(0.3F, cut.cC);
      a(0.3F, cut.cB);
      a(0.3F, cut.W);
      a(0.3F, cut.X);
      a(0.3F, cut.Y);
      a(0.3F, cut.Z);
      a(0.3F, cut.aa);
      a(0.3F, cut.ab);
      a(0.3F, cut.ac);
      a(0.3F, cut.ad);
      a(0.3F, cut.vl);
      a(0.3F, cut.rX);
      a(0.3F, cut.cN);
      a(0.3F, cut.dK);
      a(0.3F, cut.rZ);
      a(0.3F, cut.rY);
      a(0.3F, cut.cS);
      a(0.3F, cut.wr);
      a(0.3F, cut.ws);
      a(0.3F, cut.pv);
      a(0.3F, cut.dL);
      a(0.3F, cut.dM);
      a(0.3F, cut.dQ);
      a(0.3F, cut.dO);
      a(0.3F, cut.bK);
      a(0.3F, cut.vi);
      a(0.3F, cut.vj);
      a(0.5F, cut.qN);
      a(0.5F, cut.ib);
      a(0.5F, cut.cD);
      a(0.5F, cut.eW);
      a(0.5F, cut.dJ);
      a(0.5F, cut.fV);
      a(0.5F, cut.dG);
      a(0.5F, cut.dH);
      a(0.5F, cut.dI);
      a(0.5F, cut.rW);
      a(0.5F, cut.fW);
      a(0.65F, cut.cT);
      a(0.65F, cut.gb);
      a(0.65F, cut.fk);
      a(0.65F, cut.fl);
      a(0.65F, cut.fU);
      a(0.65F, cut.ot);
      a(0.65F, cut.vk);
      a(0.65F, cut.uf);
      a(0.65F, cut.rh);
      a(0.65F, cut.ug);
      a(0.65F, cut.pw);
      a(0.65F, cut.dA);
      a(0.65F, cut.dB);
      a(0.65F, cut.fQ);
      a(0.65F, cut.dC);
      a(0.65F, cut.dD);
      a(0.65F, cut.sj);
      a(0.65F, cut.dE);
      a(0.65F, cut.dF);
      a(0.65F, cut.wv);
      a(0.65F, cut.dk);
      a(0.65F, cut.dl);
      a(0.65F, cut.dm);
      a(0.65F, cut.dn);
      a(0.65F, cut.do);
      a(0.65F, cut.dp);
      a(0.65F, cut.dq);
      a(0.65F, cut.dr);
      a(0.65F, cut.ds);
      a(0.65F, cut.dt);
      a(0.65F, cut.du);
      a(0.65F, cut.dv);
      a(0.65F, cut.dw);
      a(0.65F, cut.cO);
      a(0.65F, cut.hX);
      a(0.65F, cut.hY);
      a(0.65F, cut.hZ);
      a(0.65F, cut.ia);
      a(0.65F, cut.ic);
      a(0.65F, cut.dz);
      a(0.65F, cut.cP);
      a(0.65F, cut.dN);
      a(0.65F, cut.dP);
      a(0.85F, cut.hD);
      a(0.85F, cut.fO);
      a(0.85F, cut.fP);
      a(0.85F, cut.iX);
      a(0.85F, cut.iY);
      a(0.85F, cut.cQ);
      a(0.85F, cut.px);
      a(0.85F, cut.uh);
      a(0.85F, cut.rS);
      a(0.85F, cut.dx);
      a(0.85F, cut.dy);
      a(1.0F, cut.rB);
      a(1.0F, cut.ut);
   }

   private static void a(float $$0, dby $$1) {
      f.put($$1.r(), $$0);
   }

   public dgl(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dbz $$0, iz $$1, boolean $$2) {
      dsd $$3 = $$0.a_($$1);
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
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2) {
      return h;
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return i[0];
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            dsd $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awk.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqx.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqv.a($$1.B);
      } else {
         return bqv.e;
      }
   }

   public static dsd a(bsv $$0, dsd $$1, arf $$2, cuq $$3, iz $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         dsd $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dsd a(bsv $$0, dsd $$1, dbz $$2, iz $$3) {
      if (!$$2.B) {
         evs $$4 = evs.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cji $$5 = new cji($$2, $$4.a(), $$4.b(), $$4.c(), new cuq(cut.ry));
         $$5.v();
         $$2.b($$5);
      }

      dsd $$6 = a($$0, $$1, (dca)$$2, $$3);
      $$2.a(null, $$3, awa.fs, awb.e, 1.0F, 1.0F);
      return $$6;
   }

   static dsd a(@Nullable bsv $$0, dsd $$1, dca $$2, iz $$3) {
      dsd $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dww.c, $$3, dww.a.a($$0, $$4));
      return $$4;
   }

   static dsd a(@Nullable bsv $$0, dsd $$1, dca $$2, iz $$3, cuq $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dsd $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dww.c, $$3, dww.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, awa.fv, awb.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   public brh a(dsd $$0, dca $$1, iz $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dgl.c($$0, $$1, $$2, new cuq(cut.ry));
      } else {
         return (brh)($$3 < 7 ? new dgl.b($$0, $$1, $$2) : new dgl.a());
      }
   }

   static class a extends bre implements brh {
      public a() {
         super(0);
      }

      @Override
      public int[] a(je $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cuq $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuq $$1, je $$2) {
         return false;
      }
   }

   static class b extends bre implements brh {
      private final dsd b;
      private final dca c;
      private final iz d;
      private boolean e;

      public b(dsd $$0, dca $$1, iz $$2) {
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
      public boolean a(int $$0, cuq $$1, @Nullable je $$2) {
         return !this.e && $$2 == je.b && dgl.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cuq $$1, je $$2) {
         return false;
      }

      @Override
      public void e() {
         cuq $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            dsd $$1 = dgl.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bre implements brh {
      private final dsd b;
      private final dca c;
      private final iz d;
      private boolean e;

      public c(dsd $$0, dca $$1, iz $$2, cuq $$3) {
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
      public boolean a(int $$0, cuq $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuq $$1, je $$2) {
         return !this.e && $$2 == je.a && $$1.a(cut.ry);
      }

      @Override
      public void e() {
         dgl.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
