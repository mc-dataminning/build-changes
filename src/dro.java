import com.mojang.serialization.MapCodec;

public class dro extends dku implements dsb {
   public static final MapCodec<dro> a = b(dro::new);
   private static final int f = 1;
   private static final fdo g = fdl.a(dku.b(16.0, 14.0, 16.0), fdl.c(dku.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(fdl.a(), fdl::a));
   private static final fdo h = dku.b(16.0, 0.0, 2.0);
   private static final fdo i = fdl.a(g, h, fdl.c(dku.a(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(fdl.a(), fdl::a));
   private static final fdo C = fdl.b().a(0.0, -1.0, 0.0).d();
   public static final int b = 7;
   public static final dzm c = dzc.aZ;
   public static final dzd d = dzc.I;
   public static final dzd e = dzc.d;

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   protected dro(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      if (!$$3.a($$0.b().i())) {
         return $$0.c(e) ? i : g;
      } else {
         return fdl.b();
      }
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2) {
      return fdl.b();
   }

   @Override
   protected boolean a(dym $$0, dbn $$1) {
      return $$1.n().a(this.i());
   }

   @Override
   public dym a(dbn $$0) {
      jj $$1 = $$0.a();
      dhp $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == euu.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      if (!$$1.w_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      int $$4 = a($$1, $$2);
      dym $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cmm.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      if ($$3.a(fdl.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(C, $$2, true) ? h : fdl.a();
      }
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(d) ? euu.c.a(false) : super.b_($$0);
   }

   private boolean a(dgv $$0, jj $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dgv $$0, jj $$1) {
      jj.a $$2 = $$1.k().c(jo.a);
      dym $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dkw.ou)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jo.b)) {
         return 0;
      }

      for (jo $$5 : jo.c.a) {
         dym $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dkw.ou)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }
}
