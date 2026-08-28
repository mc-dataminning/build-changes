import com.mojang.serialization.MapCodec;

public class dlo extends dez implements dma {
   public static final MapCodec<dlo> a = b(dlo::new);
   private static final int f = 1;
   private static final ewk g;
   private static final ewk h;
   private static final ewk i = dez.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ewk j = ewh.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dtc c = dss.aW;
   public static final dst d = dss.C;
   public static final dst e = dss.b;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      if (!$$3.a($$0.b().r())) {
         return $$0.c(e) ? h : g;
      } else {
         return ewh.b();
      }
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2) {
      return ewh.b();
   }

   @Override
   protected boolean a(dsc $$0, cya $$1) {
      return $$1.n().a(this.r());
   }

   @Override
   public dsc a(cya $$0) {
      iz $$1 = $$0.a();
      dby $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == enw.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = a($$1, $$2);
      dsc $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cjg.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      if ($$3.a(ewh.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ewh.a();
      }
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(d) ? enw.c.a(false) : super.b_($$0);
   }

   private boolean a(dbe $$0, iz $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(dbe $$0, iz $$1) {
      iz.a $$2 = $$1.j().c(je.a);
      dsc $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dfb.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, je.b)) {
         return 0;
      }

      for (je $$5 : je.c.a) {
         dsc $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dfb.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ewk $$0 = dez.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ewk $$1 = dez.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ewk $$2 = dez.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ewk $$3 = dez.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ewk $$4 = dez.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ewh.a($$0, $$1, $$2, $$3, $$4);
      ewk $$5 = dez.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ewk $$6 = dez.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ewk $$7 = dez.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ewk $$8 = dez.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ewh.a(dlo.i, g, $$6, $$5, $$8, $$7);
   }
}
