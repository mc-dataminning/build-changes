import com.mojang.serialization.MapCodec;

public class dqw extends dke implements dri {
   public static final MapCodec<dqw> a = b(dqw::new);
   private static final int f = 1;
   private static final fcm g;
   private static final fcm h;
   private static final fcm i = dke.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fcm j = fcj.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dym c = dyd.aX;
   public static final dye d = dyd.D;
   public static final dye e = dyd.b;

   @Override
   public MapCodec<dqw> a() {
      return a;
   }

   protected dqw(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fcj.b();
      }
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2) {
      return fcj.b();
   }

   @Override
   protected boolean a(dxn $$0, dbb $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dxn a(dbb $$0) {
      jh $$1 = $$0.a();
      dha $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == etq.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      if (!$$1.B_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      int $$4 = a($$1, $$2);
      dxn $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            clv.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      if ($$3.a(fcj.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fcj.a();
      }
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(d) ? etq.c.a(false) : super.b_($$0);
   }

   private boolean a(dgf $$0, jh $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dgf $$0, jh $$1) {
      jh.a $$2 = $$1.k().c(jm.a);
      dxn $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dkg.on)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jm.b)) {
         return 0;
      }

      for (jm $$5 : jm.c.a) {
         dxn $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dkg.on)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fcm $$0 = dke.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fcm $$1 = dke.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fcm $$2 = dke.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fcm $$3 = dke.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fcm $$4 = dke.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fcj.a($$0, $$1, $$2, $$3, $$4);
      fcm $$5 = dke.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fcm $$6 = dke.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fcm $$7 = dke.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fcm $$8 = dke.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fcj.a(dqw.i, g, $$6, $$5, $$8, $$7);
   }
}
