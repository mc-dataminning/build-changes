import com.mojang.serialization.MapCodec;

public class czp extends ctc implements dab {
   public static final MapCodec<czp> a = b(czp::new);
   private static final int f = 1;
   private static final eia g;
   private static final eia h;
   private static final eia i = ctc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eia j = ehx.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dgd c = dft.aW;
   public static final dfu d = dft.C;
   public static final dfu e = dft.b;

   @Override
   public MapCodec<czp> a() {
      return a;
   }

   protected czp(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(e) ? h : g;
      } else {
         return ehx.b();
      }
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2) {
      return ehx.b();
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dfd a(clt $$0) {
      gw $$1 = $$0.a();
      cqb $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == eah.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      if (!$$3.w_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      int $$4 = a($$1, $$2);
      dfd $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            bys.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      if ($$3.a(ehx.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ehx.a();
      }
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(d) ? eah.c.a(false) : super.c_($$0);
   }

   private boolean a(cph $$0, gw $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cph $$0, gw $$1) {
      gw.a $$2 = $$1.j().c(ha.a);
      dfd $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cte.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ha.b)) {
         return 0;
      }

      for (ha $$5 : ha.c.a) {
         dfd $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cte.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eia $$0 = ctc.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eia $$1 = ctc.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eia $$2 = ctc.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eia $$3 = ctc.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eia $$4 = ctc.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ehx.a($$0, $$1, $$2, $$3, $$4);
      eia $$5 = ctc.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eia $$6 = ctc.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eia $$7 = ctc.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eia $$8 = ctc.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ehx.a(czp.i, g, $$6, $$5, $$8, $$7);
   }
}
