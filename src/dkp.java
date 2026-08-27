import com.mojang.serialization.MapCodec;

public class dkp extends dea implements dlb {
   public static final MapCodec<dkp> a = b(dkp::new);
   private static final int f = 1;
   private static final evf g;
   private static final evf h;
   private static final evf i = dea.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final evf j = evc.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dsd c = drt.aW;
   public static final dru d = drt.C;
   public static final dru e = drt.b;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   protected dkp(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return evc.b();
      }
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2) {
      return evc.b();
   }

   @Override
   protected boolean a(drd $$0, cxb $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public drd a(cxb $$0) {
      io $$1 = $$0.a();
      daz $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(d, Boolean.valueOf($$2.b_($$1).a() == emx.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      int $$4 = a($$1, $$2);
      drd $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cih.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      if ($$3.a(evc.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : evc.a();
      }
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(d) ? emx.c.a(false) : super.b_($$0);
   }

   private boolean a(daf $$0, io $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(daf $$0, io $$1) {
      io.a $$2 = $$1.j().c(it.a);
      drd $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dec.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, it.b)) {
         return 0;
      }

      for (it $$5 : it.c.a) {
         drd $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dec.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      evf $$0 = dea.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      evf $$1 = dea.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      evf $$2 = dea.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      evf $$3 = dea.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      evf $$4 = dea.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = evc.a($$0, $$1, $$2, $$3, $$4);
      evf $$5 = dea.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      evf $$6 = dea.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      evf $$7 = dea.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      evf $$8 = dea.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = evc.a(dkp.i, g, $$6, $$5, $$8, $$7);
   }
}
