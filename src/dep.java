import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import javax.annotation.Nullable;

public class dep extends dde implements bpz {
   public static final MapCodec<dep> a = b(dep::new);
   public static final int b = 8;
   public static final int c = 0;
   public static final int d = 7;
   public static final drh e = dqx.aL;
   public static final Object2FloatMap<dac> f = new Object2FloatOpenHashMap();
   private static final int g = 2;
   private static final eui h = euf.b();
   private static final eui[] i = ac.a(new eui[9], $$0 -> {
      for (int $$1 = 0; $$1 < 8; $$1++) {
         $$0[$$1] = euf.a(h, dde.a(2.0, (double)Math.max(2, 1 + $$1 * 2), 2.0, 14.0, 16.0, 14.0), ett.e);
      }

      $$0[8] = $$0[7];
   });

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public static void b() {
      f.defaultReturnValue(-1.0F);
      float $$0 = 0.3F;
      float $$1 = 0.5F;
      float $$2 = 0.65F;
      float $$3 = 0.85F;
      float $$4 = 1.0F;
      a(0.3F, ctc.cx);
      a(0.3F, ctc.cu);
      a(0.3F, ctc.cv);
      a(0.3F, ctc.cA);
      a(0.3F, ctc.cy);
      a(0.3F, ctc.cz);
      a(0.3F, ctc.cw);
      a(0.3F, ctc.cC);
      a(0.3F, ctc.cB);
      a(0.3F, ctc.W);
      a(0.3F, ctc.X);
      a(0.3F, ctc.Y);
      a(0.3F, ctc.Z);
      a(0.3F, ctc.aa);
      a(0.3F, ctc.ab);
      a(0.3F, ctc.ac);
      a(0.3F, ctc.ad);
      a(0.3F, ctc.vl);
      a(0.3F, ctc.rX);
      a(0.3F, ctc.cN);
      a(0.3F, ctc.dK);
      a(0.3F, ctc.rZ);
      a(0.3F, ctc.rY);
      a(0.3F, ctc.cS);
      a(0.3F, ctc.wr);
      a(0.3F, ctc.ws);
      a(0.3F, ctc.pv);
      a(0.3F, ctc.dL);
      a(0.3F, ctc.dM);
      a(0.3F, ctc.dQ);
      a(0.3F, ctc.dO);
      a(0.3F, ctc.bK);
      a(0.3F, ctc.vi);
      a(0.3F, ctc.vj);
      a(0.5F, ctc.qN);
      a(0.5F, ctc.ib);
      a(0.5F, ctc.cD);
      a(0.5F, ctc.eW);
      a(0.5F, ctc.dJ);
      a(0.5F, ctc.fV);
      a(0.5F, ctc.dG);
      a(0.5F, ctc.dH);
      a(0.5F, ctc.dI);
      a(0.5F, ctc.rW);
      a(0.5F, ctc.fW);
      a(0.65F, ctc.cT);
      a(0.65F, ctc.gb);
      a(0.65F, ctc.fk);
      a(0.65F, ctc.fl);
      a(0.65F, ctc.fU);
      a(0.65F, ctc.ot);
      a(0.65F, ctc.vk);
      a(0.65F, ctc.uf);
      a(0.65F, ctc.rh);
      a(0.65F, ctc.ug);
      a(0.65F, ctc.pw);
      a(0.65F, ctc.dA);
      a(0.65F, ctc.dB);
      a(0.65F, ctc.fQ);
      a(0.65F, ctc.dC);
      a(0.65F, ctc.dD);
      a(0.65F, ctc.sj);
      a(0.65F, ctc.dE);
      a(0.65F, ctc.dF);
      a(0.65F, ctc.wv);
      a(0.65F, ctc.dk);
      a(0.65F, ctc.dl);
      a(0.65F, ctc.dm);
      a(0.65F, ctc.dn);
      a(0.65F, ctc.do);
      a(0.65F, ctc.dp);
      a(0.65F, ctc.dq);
      a(0.65F, ctc.dr);
      a(0.65F, ctc.ds);
      a(0.65F, ctc.dt);
      a(0.65F, ctc.du);
      a(0.65F, ctc.dv);
      a(0.65F, ctc.dw);
      a(0.65F, ctc.cO);
      a(0.65F, ctc.hX);
      a(0.65F, ctc.hY);
      a(0.65F, ctc.hZ);
      a(0.65F, ctc.ia);
      a(0.65F, ctc.ic);
      a(0.65F, ctc.dz);
      a(0.65F, ctc.cP);
      a(0.65F, ctc.dN);
      a(0.65F, ctc.dP);
      a(0.85F, ctc.hD);
      a(0.85F, ctc.fO);
      a(0.85F, ctc.fP);
      a(0.85F, ctc.iX);
      a(0.85F, ctc.iY);
      a(0.85F, ctc.cQ);
      a(0.85F, ctc.px);
      a(0.85F, ctc.uh);
      a(0.85F, ctc.rS);
      a(0.85F, ctc.dx);
      a(0.85F, ctc.dy);
      a(1.0F, ctc.rB);
      a(1.0F, ctc.ut);
   }

   private static void a(float $$0, dac $$1) {
      f.put($$1.q(), $$0);
   }

   public dep(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   public static void a(dad $$0, in $$1, boolean $$2) {
      dqh $$3 = $$0.a_($$1);
      $$0.a($$1, $$2 ? avc.fp : avc.fo, avd.e, 1.0F, 1.0F, false);
      double $$4 = $$3.j($$0, $$1).b(is.a.b, 0.5, 0.5) + 0.03125;
      double $$5 = 0.13125F;
      double $$6 = 0.7375F;
      ayg $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         $$0.a(
            kx.N,
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
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return i[$$0.c(e)];
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2) {
      return h;
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return i[0];
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.b(), 20);
      }
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      int $$7 = $$1.c(e);
      if ($$7 < 8 && f.containsKey($$0.f())) {
         if ($$7 < 7 && !$$2.B) {
            dqh $$8 = a($$4, $$1, $$2, $$3, $$0);
            $$2.c(1500, $$3, $$1 != $$8 ? 1 : 0);
            $$4.b(avm.c.b($$0.f()));
            $$0.a(1, $$4);
         }

         return bpo.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      int $$5 = $$0.c(e);
      if ($$5 == 8) {
         a($$3, $$0, $$1, $$2);
         return bpm.a($$1.B);
      } else {
         return bpm.d;
      }
   }

   public static dqh a(brh $$0, dqh $$1, aqh $$2, csz $$3, in $$4) {
      int $$5 = $$1.c(e);
      if ($$5 < 7 && f.containsKey($$3.f())) {
         dqh $$6 = a($$0, $$1, $$2, $$4, $$3);
         $$3.h(1);
         return $$6;
      } else {
         return $$1;
      }
   }

   public static dqh a(brh $$0, dqh $$1, dad $$2, in $$3) {
      if (!$$2.B) {
         etp $$4 = etp.a($$3, 0.5, 1.01, 0.5).a($$2.z, 0.7F);
         chr $$5 = new chr($$2, $$4.a(), $$4.b(), $$4.c(), new csz(ctc.ry));
         $$5.v();
         $$2.b($$5);
      }

      dqh $$6 = a($$0, $$1, (dae)$$2, $$3);
      $$2.a(null, $$3, avc.fn, avd.e, 1.0F, 1.0F);
      return $$6;
   }

   static dqh a(@Nullable brh $$0, dqh $$1, dae $$2, in $$3) {
      dqh $$4 = $$1.a(e, Integer.valueOf(0));
      $$2.a($$3, $$4, 3);
      $$2.a(dva.c, $$3, dva.a.a($$0, $$4));
      return $$4;
   }

   static dqh a(@Nullable brh $$0, dqh $$1, dae $$2, in $$3, csz $$4) {
      int $$5 = $$1.c(e);
      float $$6 = f.getFloat($$4.f());
      if (($$5 != 0 || !($$6 > 0.0F)) && !($$2.E_().j() < (double)$$6)) {
         return $$1;
      } else {
         int $$7 = $$5 + 1;
         dqh $$8 = $$1.a(e, Integer.valueOf($$7));
         $$2.a($$3, $$8, 3);
         $$2.a(dva.c, $$3, dva.a.a($$0, $$8));
         if ($$7 == 7) {
            $$2.a($$3, $$1.b(), 20);
         }

         return $$8;
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(e) == 7) {
         $$1.a($$2, $$0.a(e), 3);
         $$1.a(null, $$2, avc.fq, avd.e, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return $$0.c(e);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(e);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   public bpy a(dqh $$0, dae $$1, in $$2) {
      int $$3 = $$0.c(e);
      if ($$3 == 8) {
         return new dep.c($$0, $$1, $$2, new csz(ctc.ry));
      } else {
         return (bpy)($$3 < 7 ? new dep.b($$0, $$1, $$2) : new dep.a());
      }
   }

   static class a extends bpv implements bpy {
      public a() {
         super(0);
      }

      @Override
      public int[] a(is $$0) {
         return new int[0];
      }

      @Override
      public boolean a(int $$0, csz $$1, @Nullable is $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, csz $$1, is $$2) {
         return false;
      }
   }

   static class b extends bpv implements bpy {
      private final dqh b;
      private final dae c;
      private final in d;
      private boolean e;

      public b(dqh $$0, dae $$1, in $$2) {
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
      public int[] a(is $$0) {
         return $$0 == is.b ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, csz $$1, @Nullable is $$2) {
         return !this.e && $$2 == is.b && dep.f.containsKey($$1.f());
      }

      @Override
      public boolean b(int $$0, csz $$1, is $$2) {
         return false;
      }

      @Override
      public void e() {
         csz $$0 = this.a(0);
         if (!$$0.d()) {
            this.e = true;
            dqh $$1 = dep.a(null, this.b, this.c, this.d, $$0);
            this.c.c(1500, this.d, $$1 != this.b ? 1 : 0);
            this.b(0);
         }
      }
   }

   static class c extends bpv implements bpy {
      private final dqh b;
      private final dae c;
      private final in d;
      private boolean e;

      public c(dqh $$0, dae $$1, in $$2, csz $$3) {
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
      public int[] a(is $$0) {
         return $$0 == is.a ? new int[]{0} : new int[0];
      }

      @Override
      public boolean a(int $$0, csz $$1, @Nullable is $$2) {
         return false;
      }

      @Override
      public boolean b(int $$0, csz $$1, is $$2) {
         return !this.e && $$2 == is.a && $$1.a(ctc.ry);
      }

      @Override
      public void e() {
         dep.a(null, this.b, this.c, this.d);
         this.e = true;
      }
   }
}
