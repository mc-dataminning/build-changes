import com.mojang.serialization.MapCodec;

public class dnz extends dhj implements dol {
   public static final MapCodec<dnz> a = b(dnz::new);
   private static final int f = 1;
   private static final ezm g;
   private static final ezm h;
   private static final ezm i = dhj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ezm j = ezj.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dvo c = dve.aW;
   public static final dvf d = dve.C;
   public static final dvf e = dve.b;

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   protected dnz(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if (!$$3.a($$0.b().q())) {
         return $$0.c(e) ? h : g;
      } else {
         return ezj.b();
      }
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2) {
      return ezj.b();
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      return $$1.n().a(this.q());
   }

   @Override
   public duo a(czk $$0) {
      je $$1 = $$0.a();
      deg $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().b(d, Boolean.valueOf($$2.b_($$1).a() == eqq.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      if (!$$3.w_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      int $$4 = a($$1, $$2);
      duo $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            ckd.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if ($$3.a(ezj.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ezj.a();
      }
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(d) ? eqq.c.a(false) : super.b_($$0);
   }

   private boolean a(ddl $$0, je $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(ddl $$0, je $$1) {
      je.a $$2 = $$1.k().c(jj.a);
      duo $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dhl.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jj.b)) {
         return 0;
      }

      for (jj $$5 : jj.c.a) {
         duo $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dhl.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ezm $$0 = dhj.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ezm $$1 = dhj.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ezm $$2 = dhj.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ezm $$3 = dhj.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ezm $$4 = dhj.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ezj.a($$0, $$1, $$2, $$3, $$4);
      ezm $$5 = dhj.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ezm $$6 = dhj.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ezm $$7 = dhj.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ezm $$8 = dhj.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ezj.a(dnz.i, g, $$6, $$5, $$8, $$7);
   }
}
