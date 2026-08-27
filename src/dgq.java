import com.mojang.serialization.MapCodec;

public class dgq extends dac implements dhc {
   public static final MapCodec<dgq> a = b(dgq::new);
   private static final int f = 1;
   private static final eqm g;
   private static final eqm h;
   private static final eqm i = dac.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eqm j = eqj.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dob c = dnr.aW;
   public static final dns d = dnr.C;
   public static final dns e = dnr.b;

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   protected dgq(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      if (!$$3.a($$0.b().l())) {
         return $$0.c(e) ? h : g;
      } else {
         return eqj.b();
      }
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2) {
      return eqj.b();
   }

   @Override
   protected boolean a(dnb $$0, csu $$1) {
      return $$1.n().a(this.l());
   }

   @Override
   public dnb a(csu $$0) {
      ib $$1 = $$0.a();
      cxb $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eiq.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      int $$4 = a($$1, $$2);
      dnb $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cfd.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      if ($$3.a(eqj.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : eqj.a();
      }
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(d) ? eiq.c.a(false) : super.c_($$0);
   }

   private boolean a(cwh $$0, ib $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cwh $$0, ib $$1) {
      ib.a $$2 = $$1.j().c(ih.a);
      dnb $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dae.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ih.b)) {
         return 0;
      }

      for (ih $$5 : ih.c.a) {
         dnb $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dae.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eqm $$0 = dac.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eqm $$1 = dac.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eqm $$2 = dac.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eqm $$3 = dac.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eqm $$4 = dac.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = eqj.a($$0, $$1, $$2, $$3, $$4);
      eqm $$5 = dac.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eqm $$6 = dac.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eqm $$7 = dac.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eqm $$8 = dac.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = eqj.a(dgq.i, g, $$6, $$5, $$8, $$7);
   }
}
