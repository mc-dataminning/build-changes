import com.mojang.serialization.MapCodec;

public class dbo extends cva implements dca {
   public static final MapCodec<dbo> a = b(dbo::new);
   private static final int f = 1;
   private static final ekn g;
   private static final ekn h;
   private static final ekn i = cva.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ekn j = ekk.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dii c = dhy.aW;
   public static final dhz d = dhy.C;
   public static final dhz e = dhy.b;

   @Override
   public MapCodec<dbo> a() {
      return a;
   }

   protected dbo(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(e) ? h : g;
      } else {
         return ekk.b();
      }
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2) {
      return ekk.b();
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dhi a(cnr $$0) {
      ht $$1 = $$0.a();
      csa $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == ect.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      int $$4 = a($$1, $$2);
      dhi $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cam.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      if ($$3.a(ekk.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ekk.a();
      }
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(d) ? ect.c.a(false) : super.c_($$0);
   }

   private boolean a(crg $$0, ht $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(crg $$0, ht $$1) {
      ht.a $$2 = $$1.j().c(hx.a);
      dhi $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cvc.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, hx.b)) {
         return 0;
      }

      for (hx $$5 : hx.c.a) {
         dhi $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cvc.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ekn $$0 = cva.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ekn $$1 = cva.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ekn $$2 = cva.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ekn $$3 = cva.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ekn $$4 = cva.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ekk.a($$0, $$1, $$2, $$3, $$4);
      ekn $$5 = cva.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ekn $$6 = cva.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ekn $$7 = cva.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ekn $$8 = cva.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ekk.a(dbo.i, g, $$6, $$5, $$8, $$7);
   }
}
