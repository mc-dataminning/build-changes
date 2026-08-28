import com.mojang.serialization.MapCodec;

public class don extends dhy implements doz {
   public static final MapCodec<don> a = b(don::new);
   private static final int f = 1;
   private static final fab g;
   private static final fab h;
   private static final fab i = dhy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fab j = ezy.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dwd c = dvt.aW;
   public static final dvu d = dvt.C;
   public static final dvu e = dvt.b;

   @Override
   public MapCodec<don> a() {
      return a;
   }

   protected don(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return ezy.b();
      }
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2) {
      return ezy.b();
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dvd a(czm $$0) {
      jg $$1 = $$0.a();
      dev $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == erf.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      int $$4 = a($$1, $$2);
      dvd $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            ckp.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if ($$3.a(ezy.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ezy.a();
      }
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(d) ? erf.c.a(false) : super.b_($$0);
   }

   private boolean a(dea $$0, jg $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dea $$0, jg $$1) {
      jg.a $$2 = $$1.k().c(jl.a);
      dvd $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dia.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jl.b)) {
         return 0;
      }

      for (jl $$5 : jl.c.a) {
         dvd $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dia.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fab $$0 = dhy.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fab $$1 = dhy.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fab $$2 = dhy.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fab $$3 = dhy.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fab $$4 = dhy.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ezy.a($$0, $$1, $$2, $$3, $$4);
      fab $$5 = dhy.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fab $$6 = dhy.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fab $$7 = dhy.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fab $$8 = dhy.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ezy.a(don.i, g, $$6, $$5, $$8, $$7);
   }
}
