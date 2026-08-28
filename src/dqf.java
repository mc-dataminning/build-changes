import com.mojang.serialization.MapCodec;

public class dqf extends djl implements dqr {
   public static final MapCodec<dqf> a = b(dqf::new);
   private static final int f = 1;
   private static final fbt g;
   private static final fbt h;
   private static final fbt i = djl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fbt j = fbq.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dxv c = dxm.aZ;
   public static final dxn d = dxm.J;
   public static final dxn e = dxm.e;

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   protected dqf(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fbq.b();
      }
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2) {
      return fbq.b();
   }

   @Override
   protected boolean a(dww $$0, daf $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dww a(daf $$0) {
      ji $$1 = $$0.a();
      dgh $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == esz.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      if (!$$1.B_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = a($$1, $$2);
      dww $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
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
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      if ($$3.a(fbq.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fbq.a();
      }
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(d) ? esz.c.a(false) : super.b_($$0);
   }

   private boolean a(dfm $$0, ji $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dfm $$0, ji $$1) {
      ji.a $$2 = $$1.k().c(jn.a);
      dww $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(djn.ou)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jn.b)) {
         return 0;
      }

      for (jn $$5 : jn.c.a) {
         dww $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(djn.ou)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fbt $$0 = djl.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fbt $$1 = djl.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fbt $$2 = djl.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fbt $$3 = djl.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fbt $$4 = djl.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fbq.a($$0, $$1, $$2, $$3, $$4);
      fbt $$5 = djl.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fbt $$6 = djl.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fbt $$7 = djl.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fbt $$8 = djl.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fbq.a(dqf.i, g, $$6, $$5, $$8, $$7);
   }
}
