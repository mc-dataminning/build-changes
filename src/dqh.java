import com.mojang.serialization.MapCodec;

public class dqh extends djn implements dqt {
   public static final MapCodec<dqh> a = b(dqh::new);
   private static final int f = 1;
   private static final fbv g;
   private static final fbv h;
   private static final fbv i = djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fbv j = fbs.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dxx c = dxo.aZ;
   public static final dxp d = dxo.J;
   public static final dxp e = dxo.e;

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   protected dqh(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fbs.b();
      }
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2) {
      return fbs.b();
   }

   @Override
   protected boolean a(dwy $$0, dah $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dwy a(dah $$0) {
      ji $$1 = $$0.a();
      dgj $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == etb.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      if (!$$1.B_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = a($$1, $$2);
      dwy $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            clc.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if ($$3.a(fbs.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fbs.a();
      }
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(d) ? etb.c.a(false) : super.b_($$0);
   }

   private boolean a(dfo $$0, ji $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dfo $$0, ji $$1) {
      ji.a $$2 = $$1.k().c(jn.a);
      dwy $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(djp.ou)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jn.b)) {
         return 0;
      }

      for (jn $$5 : jn.c.a) {
         dwy $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(djp.ou)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fbv $$0 = djn.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fbv $$1 = djn.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fbv $$2 = djn.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fbv $$3 = djn.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fbv $$4 = djn.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fbs.a($$0, $$1, $$2, $$3, $$4);
      fbv $$5 = djn.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fbv $$6 = djn.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fbv $$7 = djn.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fbv $$8 = djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fbs.a(dqh.i, g, $$6, $$5, $$8, $$7);
   }
}
