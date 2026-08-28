import com.mojang.serialization.MapCodec;

public class doy extends dij implements dpk {
   public static final MapCodec<doy> a = b(doy::new);
   private static final int f = 1;
   private static final fal g;
   private static final fal h;
   private static final fal i = dij.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final fal j = fai.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dwn c = dwe.aW;
   public static final dwf d = dwe.C;
   public static final dwf e = dwe.b;

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   protected doy(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      if (!$$3.a($$0.b().j())) {
         return $$0.c(e) ? h : g;
      } else {
         return fai.b();
      }
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2) {
      return fai.b();
   }

   @Override
   protected boolean a(dvo $$0, czw $$1) {
      return $$1.n().a(this.j());
   }

   @Override
   public dvo a(czw $$0) {
      jh $$1 = $$0.a();
      dff $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.m().b(d, Boolean.valueOf($$2.b_($$1).a() == erp.c)).b(c, Integer.valueOf($$3)).b(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$1.C) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      if (!$$1.y_()) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      int $$4 = a($$1, $$2);
      dvo $$5 = $$0.b(c, Integer.valueOf($$4)).b(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cky.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      if ($$3.a(fai.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : fai.a();
      }
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(d) ? erp.c.a(false) : super.b_($$0);
   }

   private boolean a(dek $$0, jh $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.e()).a(this);
   }

   public static int a(dek $$0, jh $$1) {
      jh.a $$2 = $$1.k().c(jm.a);
      dvo $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(dil.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.c($$0, $$2, jm.b)) {
         return 0;
      }

      for (jm $$5 : jm.c.a) {
         dvo $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(dil.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      fal $$0 = dij.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      fal $$1 = dij.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      fal $$2 = dij.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      fal $$3 = dij.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      fal $$4 = dij.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = fai.a($$0, $$1, $$2, $$3, $$4);
      fal $$5 = dij.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      fal $$6 = dij.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      fal $$7 = dij.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      fal $$8 = dij.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = fai.a(doy.i, g, $$6, $$5, $$8, $$7);
   }
}
