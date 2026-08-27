import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dfl extends dea implements bqj {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final dsd e = drt.aL;
   public static final Object2FloatMap<day> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final evf h = evc.b();
   private static final evf[] i = ac.a(new evf[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = evc.a(h, dea.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), euq.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, ctt.cx);
      a(0.3F, ctt.cu);
      a(0.3F, ctt.cv);
      a(0.3F, ctt.cA);
      a(0.3F, ctt.cy);
      a(0.3F, ctt.cz);
      a(0.3F, ctt.cw);
      a(0.3F, ctt.cC);
      a(0.3F, ctt.cB);
      a(0.3F, ctt.W);
      a(0.3F, ctt.X);
      a(0.3F, ctt.Y);
      a(0.3F, ctt.Z);
      a(0.3F, ctt.aa);
      a(0.3F, ctt.ab);
      a(0.3F, ctt.ac);
      a(0.3F, ctt.ad);
      a(0.3F, ctt.vl);
      a(0.3F, ctt.rX);
      a(0.3F, ctt.cN);
      a(0.3F, ctt.dK);
      a(0.3F, ctt.rZ);
      a(0.3F, ctt.rY);
      a(0.3F, ctt.cS);
      a(0.3F, ctt.wr);
      a(0.3F, ctt.ws);
      a(0.3F, ctt.pv);
      a(0.3F, ctt.dL);
      a(0.3F, ctt.dM);
      a(0.3F, ctt.dQ);
      a(0.3F, ctt.dO);
      a(0.3F, ctt.bK);
      a(0.3F, ctt.vi);
      a(0.3F, ctt.vj);
      a(0.5F, ctt.qN);
      a(0.5F, ctt.ib);
      a(0.5F, ctt.cD);
      a(0.5F, ctt.eW);
      a(0.5F, ctt.dJ);
      a(0.5F, ctt.fV);
      a(0.5F, ctt.dG);
      a(0.5F, ctt.dH);
      a(0.5F, ctt.dI);
      a(0.5F, ctt.rW);
      a(0.5F, ctt.fW);
      a(0.65F, ctt.cT);
      a(0.65F, ctt.gb);
      a(0.65F, ctt.fk);
      a(0.65F, ctt.fl);
      a(0.65F, ctt.fU);
      a(0.65F, ctt.ot);
      a(0.65F, ctt.vk);
      a(0.65F, ctt.uf);
      a(0.65F, ctt.rh);
      a(0.65F, ctt.ug);
      a(0.65F, ctt.pw);
      a(0.65F, ctt.dA);
      a(0.65F, ctt.dB);
      a(0.65F, ctt.fQ);
      a(0.65F, ctt.dC);
      a(0.65F, ctt.dD);
      a(0.65F, ctt.sj);
      a(0.65F, ctt.dE);
      a(0.65F, ctt.dF);
      a(0.65F, ctt.wv);
      a(0.65F, ctt.dk);
      a(0.65F, ctt.dl);
      a(0.65F, ctt.dm);
      a(0.65F, ctt.dn);
      a(0.65F, ctt.do);
      a(0.65F, ctt.dp);
      a(0.65F, ctt.dq);
      a(0.65F, ctt.dr);
      a(0.65F, ctt.ds);
      a(0.65F, ctt.dt);
      a(0.65F, ctt.du);
      a(0.65F, ctt.dv);
      a(0.65F, ctt.dw);
      a(0.65F, ctt.cO);
      a(0.65F, ctt.hX);
      a(0.65F, ctt.hY);
      a(0.65F, ctt.hZ);
      a(0.65F, ctt.ia);
      a(0.65F, ctt.ic);
      a(0.65F, ctt.dz);
      a(0.65F, ctt.cP);
      a(0.65F, ctt.dN);
      a(0.65F, ctt.dP);
      a(0.85F, ctt.hD);
      a(0.85F, ctt.fO);
      a(0.85F, ctt.fP);
      a(0.85F, ctt.iX);
      a(0.85F, ctt.iY);
      a(0.85F, ctt.cQ);
      a(0.85F, ctt.px);
      a(0.85F, ctt.uh);
      a(0.85F, ctt.rS);
      a(0.85F, ctt.dx);
      a(0.85F, ctt.dy);
      a(1.0F, ctt.rB);
      a(1.0F, ctt.ut);
   }

   private static void a(float $$0, day $$1) {
      f.put($$1.r(), $$0);
   }

   public dfl(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(daz $$0, io $$1, boolean $$2) {
      drd $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avi.fu : avi.ft, avj.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(it.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      aym $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            ky.P,
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
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2) {
      return h;
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return i[0];
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.g())) {
         if ($$7 < 7 && !$$2.B) {
            drd $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(avs.c.b($$0.g()));
            $$0.a(1, $$4);
         }

         return bpy.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bpw.a($$1.B);
      } else {
         return bpw.d;
      }
   }

   public static drd a(brw $$0, drd $$1, aqn $$2, ctq $$3, io $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.g())) {
         drd $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static drd a(brw $$0, drd $$1, daz $$2, io $$3) {
      if (!$$2.B) {
         eum $$4 = eum.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         cii $$5 = new cii($$2, $$4.a(), $$4.b(), $$4.c(), new ctq(ctt.ry));
         $$5.v();
         $$2.b($$5);
      }

      drd $$6 = a($$0, $$1, (dba)$$2, $$3);
      $$2.a(null, $$3, avi.fs, avj.e, 1.0F, 1.0F);
      return $$6;
   }

   static drd a(@Nullable brw $$0, drd $$1, dba $$2, io $$3) {
      drd $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dvw.c, $$3, dvw.a.a($$0, $$4));
      return $$4;
   }

   static drd a(@Nullable brw $$0, drd $$1, dba $$2, io $$3, ctq $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.g());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         drd $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dvw.c, $$3, dvw.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avi.fv, avj.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   public bqi a(drd $$0, dba $$1, io $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dfl.c($$0, $$1, $$2, new ctq(ctt.ry));
      } else {
         return (bqi)($$3 < 7 ? new dfl.b($$0, $$1, $$2) : new dfl.a());
      }
   }

   static class a extends bqf implements bqi {
      public a() {
         super(0);
      }

      @Override
      public int[] a(it $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, ctq $$1, @Nullable it $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, ctq $$1, it $$2) {
         return false;
      }
   }

   static class b extends bqf implements bqi {
      private final drd b;
      private final dba c;
      private final io d;
      private boolean e;

      public b(drd $$0, dba $$1, io $$2) {
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
      public int[] a(it $$0) {
         return $$0 == it.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, ctq $$1, @Nullable it $$2) {
         return !this.e && $$2 == it.b && dfl.f.containsKey($$1.g());
      }

      @Override
      public boolean b(int $$0, ctq $$1, it $$2) {
         return false;
      }

      @Override
      public void e() {
         ctq $$0 = this.a(0);
         if (!$$0.e()) {
            this.e = true;
            drd $$1 = dfl.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bqf implements bqi {
      private final drd b;
      private final dba c;
      private final io d;
      private boolean e;

      public c(drd $$0, dba $$1, io $$2, ctq $$3) {
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
      public int[] a(it $$0) {
         return $$0 == it.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, ctq $$1, @Nullable it $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, ctq $$1, it $$2) {
         return !this.e && $$2 == it.a && $$1.a(ctt.ry);
      }

      @Override
      public void e() {
         dfl.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
