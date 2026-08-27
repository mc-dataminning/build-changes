import com.mojang.serialization.MapCodec;

public class dbh extends cut implements dbt {
   public static final MapCodec<dbh> a = b(dbh::new);
   private static final int f = 1;
   private static final ekb g;
   private static final ekb h;
   private static final ekb i = cut.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ekb j = ejy.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final dhw c = dhm.aW;
   public static final dhn d = dhm.C;
   public static final dhn e = dhm.b;

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   protected dbh(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(e) ? h : g;
      } else {
         return ejy.b();
      }
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2) {
      return ejy.b();
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dgw a(cnj $$0) {
      ht $$1 = $$0.a();
      crs $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == ech.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      if (!$$3.x_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      int $$4 = a($$1, $$2);
      dgw $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            cae.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if ($$3.a(ejy.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ejy.a();
      }
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(d) ? ech.c.a(false) : super.c_($$0);
   }

   private boolean a(cqy $$0, ht $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cqy $$0, ht $$1) {
      ht.a $$2 = $$1.j().c(hx.a);
      dgw $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cuv.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, hx.b)) {
         return 0;
      }

      for (hx $$5 : hx.c.a) {
         dgw $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cuv.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ekb $$0 = cut.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ekb $$1 = cut.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ekb $$2 = cut.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ekb $$3 = cut.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ekb $$4 = cut.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ejy.a($$0, $$1, $$2, $$3, $$4);
      ekb $$5 = cut.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ekb $$6 = cut.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ekb $$7 = cut.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ekb $$8 = cut.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ejy.a(dbh.i, g, $$6, $$5, $$8, $$7);
   }
}
