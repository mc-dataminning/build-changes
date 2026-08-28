import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dgf extends deu implements brc {
   public static final MapCodec<dgf> a = b(dgf::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dsx e = dsn.aL;
   public static final Object2FloatMap<dbs> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final ewf h = ewc.b();
   private static final ewf[] i = ac.a(new ewf[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = ewc.a(h, deu.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), evq.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, cun.cx);
      a(0.3F, cun.cu);
      a(0.3F, cun.cv);
      a(0.3F, cun.cA);
      a(0.3F, cun.cy);
      a(0.3F, cun.cz);
      a(0.3F, cun.cw);
      a(0.3F, cun.cC);
      a(0.3F, cun.cB);
      a(0.3F, cun.W);
      a(0.3F, cun.X);
      a(0.3F, cun.Y);
      a(0.3F, cun.Z);
      a(0.3F, cun.aa);
      a(0.3F, cun.ab);
      a(0.3F, cun.ac);
      a(0.3F, cun.ad);
      a(0.3F, cun.vl);
      a(0.3F, cun.rX);
      a(0.3F, cun.cN);
      a(0.3F, cun.dK);
      a(0.3F, cun.rZ);
      a(0.3F, cun.rY);
      a(0.3F, cun.cS);
      a(0.3F, cun.wr);
      a(0.3F, cun.ws);
      a(0.3F, cun.pv);
      a(0.3F, cun.dL);
      a(0.3F, cun.dM);
      a(0.3F, cun.dQ);
      a(0.3F, cun.dO);
      a(0.3F, cun.bK);
      a(0.3F, cun.vi);
      a(0.3F, cun.vj);
      a(0.5F, cun.qN);
      a(0.5F, cun.ib);
      a(0.5F, cun.cD);
      a(0.5F, cun.eW);
      a(0.5F, cun.dJ);
      a(0.5F, cun.fV);
      a(0.5F, cun.dG);
      a(0.5F, cun.dH);
      a(0.5F, cun.dI);
      a(0.5F, cun.rW);
      a(0.5F, cun.fW);
      a(0.65F, cun.cT);
      a(0.65F, cun.gb);
      a(0.65F, cun.fk);
      a(0.65F, cun.fl);
      a(0.65F, cun.fU);
      a(0.65F, cun.ot);
      a(0.65F, cun.vk);
      a(0.65F, cun.uf);
      a(0.65F, cun.rh);
      a(0.65F, cun.ug);
      a(0.65F, cun.pw);
      a(0.65F, cun.dA);
      a(0.65F, cun.dB);
      a(0.65F, cun.fQ);
      a(0.65F, cun.dC);
      a(0.65F, cun.dD);
      a(0.65F, cun.sj);
      a(0.65F, cun.dE);
      a(0.65F, cun.dF);
      a(0.65F, cun.wv);
      a(0.65F, cun.dk);
      a(0.65F, cun.dl);
      a(0.65F, cun.dm);
      a(0.65F, cun.dn);
      a(0.65F, cun.do);
      a(0.65F, cun.dp);
      a(0.65F, cun.dq);
      a(0.65F, cun.dr);
      a(0.65F, cun.ds);
      a(0.65F, cun.dt);
      a(0.65F, cun.du);
      a(0.65F, cun.dv);
      a(0.65F, cun.dw);
      a(0.65F, cun.cO);
      a(0.65F, cun.hX);
      a(0.65F, cun.hY);
      a(0.65F, cun.hZ);
      a(0.65F, cun.ia);
      a(0.65F, cun.ic);
      a(0.65F, cun.dz);
      a(0.65F, cun.cP);
      a(0.65F, cun.dN);
      a(0.65F, cun.dP);
      a(0.85F, cun.hD);
      a(0.85F, cun.fO);
      a(0.85F, cun.fP);
      a(0.85F, cun.iX);
      a(0.85F, cun.iY);
      a(0.85F, cun.cQ);
      a(0.85F, cun.px);
      a(0.85F, cun.uh);
      a(0.85F, cun.rS);
      a(0.85F, cun.dx);
      a(0.85F, cun.dy);
      a(1.0F, cun.rB);
      a(1.0F, cun.ut);
   }

   private static void a(float $$0, dbs $$1) {
      f.put($$1.r(), $$0);
   }

   public dgf(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dbt $$0, iz $$1, boolean $$2) {
      drx $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avw.fu : avw.ft, avx.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(je.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      azc $$7 = $$0.E_();

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
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2) {
      return h;
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return i[0];
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            drx $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(awg.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bqr.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bqp.a($$1.B);
      } else {
         return bqp.e;
      }
   }

   public static drx a(bsp $$0, drx $$1, arb $$2, cuk $$3, iz $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         drx $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static drx a(bsp $$0, drx $$1, dbt $$2, iz $$3) {
      if (!$$2.B) {
         evm $$4 = evm.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cjc $$5 = new cjc($$2, $$4.a(), $$4.b(), $$4.c(), new cuk(cun.ry));
         $$5.v();
         $$2.b($$5);
      }

      drx $$6 = a($$0, $$1, (dbu)$$2, $$3);
      $$2.a(null, $$3, avw.fs, avx.e, 1.0F, 1.0F);
      return $$6;
   }

   static drx a(@Nullable bsp $$0, drx $$1, dbu $$2, iz $$3) {
      drx $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dwq.c, $$3, dwq.a.a($$0, $$4));
      return $$4;
   }

   static drx a(@Nullable bsp $$0, drx $$1, dbu $$2, iz $$3, cuk $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         drx $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dwq.c, $$3, dwq.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avw.fv, avx.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   public brb a(drx $$0, dbu $$1, iz $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dgf.c($$0, $$1, $$2, new cuk(cun.ry));
      } else {
         return (brb)($$3 < 7 ? new dgf.b($$0, $$1, $$2) : new dgf.a());
      }
   }

   static class a extends bqy implements brb {
      public a() {
         super(0);
      }

      @Override
      public int[] a(je $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, cuk $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuk $$1, je $$2) {
         return false;
      }
   }

   static class b extends bqy implements brb {
      private final drx b;
      private final dbu c;
      private final iz d;
      private boolean e;

      public b(drx $$0, dbu $$1, iz $$2) {
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
      public boolean a(int $$0, cuk $$1, @Nullable je $$2) {
         return !this.e && $$2 == je.b && dgf.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, cuk $$1, je $$2) {
         return false;
      }

      @Override
      public void e() {
         cuk $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            drx $$1 = dgf.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bqy implements brb {
      private final drx b;
      private final dbu c;
      private final iz d;
      private boolean e;

      public c(drx $$0, dbu $$1, iz $$2, cuk $$3) {
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
      public boolean a(int $$0, cuk $$1, @Nullable je $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, cuk $$1, je $$2) {
         return !this.e && $$2 == je.a && $$1.a(cun.ry);
      }

      @Override
      public void e() {
         dgf.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
