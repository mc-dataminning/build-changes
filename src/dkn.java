import com.mojang.serialization.MapCodec;

public class dkn extends ddy implements dkz {
   public static final MapCodec<dkn> a = b(dkn::new);
   private static final int f = 1;
   private static final evd g;
   private static final evd h;
   private static final evd i = ddy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final evd j = eva.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dsb c = drr.aW;
   public static final drs d = drr.C;
   public static final drs e = drr.b;

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   protected dkn(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      if (!$$3.a($$0.b().q())) {
         return $$0.c(e) ? h : g;
      } else {
         return eva.b();
      }
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2) {
      return eva.b();
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      return $$1.n().a(this.q());
   }

   @Override
   public drb a(cwz $$0) {
      io $$1 = $$0.a();
      dax $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(d, Boolean.valueOf($$2.b_($$1).a() == emv.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      int $$4 = a($$1, $$2);
      drb $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cif.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      if ($$3.a(eva.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : eva.a();
      }
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(d) ? emv.c.a(false) : super.b_($$0);
   }

   private boolean a(dad $$0, io $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dad $$0, io $$1) {
      io.a $$2 = $$1.j().c(it.a);
      drb $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dea.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, it.b)) {
         return 0;
      }

      for (it $$5 : it.c.a) {
         drb $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dea.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      evd $$0 = ddy.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      evd $$1 = ddy.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      evd $$2 = ddy.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      evd $$3 = ddy.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      evd $$4 = ddy.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = eva.a($$0, $$1, $$2, $$3, $$4);
      evd $$5 = ddy.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      evd $$6 = ddy.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      evd $$7 = ddy.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      evd $$8 = ddy.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = eva.a(dkn.i, g, $$6, $$5, $$8, $$7);
   }
}
