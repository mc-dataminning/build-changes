import com.mojang.serialization.MapCodec;

public class dqe extends djk implements dqq {
   public static final MapCodec<dqe> a = b(dqe::new);
   private static final int f = 1;
   private static final fbs g;
   private static final fbs h;
   private static final fbs i = djk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fbs j = fbp.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dxu c = dxl.aZ;
   public static final dxm d = dxl.J;
   public static final dxm e = dxl.e;

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   protected dqe(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fbp.b();
      }
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2) {
      return fbp.b();
   }

   @Override
   protected boolean a(dwv $$0, dae $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dwv a(dae $$0) {
      ji $$1 = $$0.a();
      dgg $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == esy.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      if (!$$1.B_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      int $$4 = a($$1, $$2);
      dwv $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            ckz.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      if ($$3.a(fbp.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fbp.a();
      }
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(d) ? esy.c.a(false) : super.b_($$0);
   }

   private boolean a(dfl $$0, ji $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dfl $$0, ji $$1) {
      ji.a $$2 = $$1.k().c(jn.a);
      dwv $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(djm.ou)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jn.b)) {
         return 0;
      }

      for (jn $$5 : jn.c.a) {
         dwv $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(djm.ou)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fbs $$0 = djk.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fbs $$1 = djk.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fbs $$2 = djk.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fbs $$3 = djk.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fbs $$4 = djk.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fbp.a($$0, $$1, $$2, $$3, $$4);
      fbs $$5 = djk.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fbs $$6 = djk.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fbs $$7 = djk.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fbs $$8 = djk.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fbp.a(dqe.i, g, $$6, $$5, $$8, $$7);
   }
}
