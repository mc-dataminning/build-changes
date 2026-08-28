import com.mojang.serialization.MapCodec;

public class dqy extends dke implements drl {
   public static final MapCodec<dqy> a = b(dqy::new);
   private static final int f = 1;
   private static final fcr g = fco.a(dke.b(16.0, 14.0, 16.0), fco.c(dke.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fco.a(), fco::a));
   private static final fcr h = dke.b(16.0, 0.0, 2.0);
   private static final fcr i = fco.a(g, h, fco.c(dke.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fco.a(), fco::a));
   private static final fcr C = fco.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final dyq c = dyg.aZ;
   public static final dyh d = dyg.I;
   public static final dyh e = dyg.d;

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   protected dqy(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      if (!$$3.a($$0.b().i())) {
         return $$0.c(e) ? i : g;
      } else {
         return fco.b();
      }
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2) {
      return fco.b();
   }

   @Override
   protected boolean a(dxq $$0, dax $$1) {
      return $$1.n().a(this.i());
   }

   @Override
   public dxq a(dax $$0) {
      ji $$1 = $$0.a();
      dgz $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == etx.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      if (!$$1.w_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = a($$1, $$2);
      dxq $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
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
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      if ($$3.a(fco.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(C, $$2, true) ? h : fco.a();
      }
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   private boolean a(dgf $$0, ji $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dgf $$0, ji $$1) {
      ji.a $$2 = $$1.k().c(jn.a);
      dxq $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dkg.ou)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jn.b)) {
         return 0;
      }

      for (jn $$5 : jn.c.a) {
         dxq $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dkg.ou)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
