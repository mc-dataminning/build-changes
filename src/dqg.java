import com.mojang.serialization.MapCodec;

public class dqg extends djm implements dqs {
   public static final MapCodec<dqg> a = b(dqg::new);
   private static final int f = 1;
   private static final fbu g;
   private static final fbu h;
   private static final fbu i = djm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fbu j = fbr.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dxw c = dxn.aZ;
   public static final dxo d = dxn.J;
   public static final dxo e = dxn.e;

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   protected dqg(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fbr.b();
      }
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2) {
      return fbr.b();
   }

   @Override
   protected boolean a(dwx $$0, dag $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dwx a(dag $$0) {
      ji $$1 = $$0.a();
      dgi $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == eta.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      if (!$$1.B_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      int $$4 = a($$1, $$2);
      dwx $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cla.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      if ($$3.a(fbr.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fbr.a();
      }
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(d) ? eta.c.a(false) : super.b_($$0);
   }

   private boolean a(dfn $$0, ji $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dfn $$0, ji $$1) {
      ji.a $$2 = $$1.k().c(jn.a);
      dwx $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(djo.ou)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jn.b)) {
         return 0;
      }

      for (jn $$5 : jn.c.a) {
         dwx $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(djo.ou)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fbu $$0 = djm.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fbu $$1 = djm.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fbu $$2 = djm.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fbu $$3 = djm.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fbu $$4 = djm.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fbr.a($$0, $$1, $$2, $$3, $$4);
      fbu $$5 = djm.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fbu $$6 = djm.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fbu $$7 = djm.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fbu $$8 = djm.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fbr.a(dqg.i, g, $$6, $$5, $$8, $$7);
   }
}
