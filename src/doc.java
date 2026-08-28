import com.mojang.serialization.MapCodec;

public class doc extends dhm implements doo {
   public static final MapCodec<doc> a = b(doc::new);
   private static final int f = 1;
   private static final ezq g;
   private static final ezq h;
   private static final ezq i = dhm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ezq j = ezn.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dvs c = dvi.aW;
   public static final dvj d = dvi.C;
   public static final dvj e = dvi.b;

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   protected doc(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if (!$$3.a($$0.b().q())) {
         return $$0.c(e) ? h : g;
      } else {
         return ezn.b();
      }
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2) {
      return ezn.b();
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      return $$1.n().a(this.q());
   }

   @Override
   public dus a(czn $$0) {
      jf $$1 = $$0.a();
      dej $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().b(d, Boolean.valueOf($$2.b_($$1).a() == equ.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      int $$4 = a($$1, $$2);
      dus $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            ckg.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if ($$3.a(ezn.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ezn.a();
      }
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(d) ? equ.c.a(false) : super.b_($$0);
   }

   private boolean a(ddo $$0, jf $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(ddo $$0, jf $$1) {
      jf.a $$2 = $$1.k().c(jk.a);
      dus $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dho.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jk.b)) {
         return 0;
      }

      for (jk $$5 : jk.c.a) {
         dus $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dho.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ezq $$0 = dhm.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ezq $$1 = dhm.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ezq $$2 = dhm.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ezq $$3 = dhm.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ezq $$4 = dhm.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ezn.a($$0, $$1, $$2, $$3, $$4);
      ezq $$5 = dhm.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ezq $$6 = dhm.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ezq $$7 = dhm.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ezq $$8 = dhm.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ezn.a(doc.i, g, $$6, $$5, $$8, $$7);
   }
}
