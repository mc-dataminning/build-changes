import com.mojang.serialization.MapCodec;

public class dqx extends dkd implements drj {
   public static final MapCodec<dqx> a = b(dqx::new);
   private static final int f = 1;
   private static final fcl g;
   private static final fcl h;
   private static final fcl i = dkd.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fcl j = fci.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dyn c = dye.aZ;
   public static final dyf d = dye.J;
   public static final dyf e = dye.e;

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   protected dqx(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fci.b();
      }
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2) {
      return fci.b();
   }

   @Override
   protected boolean a(dxo $$0, dax $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dxo a(dax $$0) {
      jh $$1 = $$0.a();
      dgz $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == etr.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      if (!$$1.B_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      int $$4 = a($$1, $$2);
      dxo $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            clr.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      if ($$3.a(fci.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fci.a();
      }
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(d) ? etr.c.a(false) : super.b_($$0);
   }

   private boolean a(dge $$0, jh $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dge $$0, jh $$1) {
      jh.a $$2 = $$1.k().c(jm.a);
      dxo $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dkf.ou)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jm.b)) {
         return 0;
      }

      for (jm $$5 : jm.c.a) {
         dxo $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dkf.ou)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fcl $$0 = dkd.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fcl $$1 = dkd.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fcl $$2 = dkd.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fcl $$3 = dkd.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fcl $$4 = dkd.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fci.a($$0, $$1, $$2, $$3, $$4);
      fcl $$5 = dkd.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fcl $$6 = dkd.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fcl $$7 = dkd.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fcl $$8 = dkd.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fci.a(dqx.i, g, $$6, $$5, $$8, $$7);
   }
}
