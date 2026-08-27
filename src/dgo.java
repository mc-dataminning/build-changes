import com.mojang.serialization.MapCodec;

public class dgo extends daa implements dha {
   public static final MapCodec<dgo> a = b(dgo::new);
   private static final int f = 1;
   private static final eqk g;
   private static final eqk h;
   private static final eqk i = daa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eqk j = eqh.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dnz c = dnp.aW;
   public static final dnq d = dnp.C;
   public static final dnq e = dnp.b;

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   protected dgo(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      if (!$$3.a($$0.b().l())) {
         return $$0.c(e) ? h : g;
      } else {
         return eqh.b();
      }
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2) {
      return eqh.b();
   }

   @Override
   protected boolean a(dmz $$0, css $$1) {
      return $$1.n().a(this.l());
   }

   @Override
   public dmz a(css $$0) {
      ib $$1 = $$0.a();
      cwz $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eio.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      int $$4 = a($$1, $$2);
      dmz $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cfc.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      if ($$3.a(eqh.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : eqh.a();
      }
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(d) ? eio.c.a(false) : super.c_($$0);
   }

   private boolean a(cwf $$0, ib $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cwf $$0, ib $$1) {
      ib.a $$2 = $$1.j().c(ih.a);
      dmz $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dac.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ih.b)) {
         return 0;
      }

      for (ih $$5 : ih.c.a) {
         dmz $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dac.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eqk $$0 = daa.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eqk $$1 = daa.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eqk $$2 = daa.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eqk $$3 = daa.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eqk $$4 = daa.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = eqh.a($$0, $$1, $$2, $$3, $$4);
      eqk $$5 = daa.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eqk $$6 = daa.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eqk $$7 = daa.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eqk $$8 = daa.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = eqh.a(dgo.i, g, $$6, $$5, $$8, $$7);
   }
}
