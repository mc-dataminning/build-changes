import javax.annotation.Nullable;

public class dag extends csx {
   public static final int a = 8;
   public static final dgl b = dgb.aF;
   protected static final eii[] c = new eii[]{
      eif.a(),
      csx.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int d = 5;

   protected dag(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return c[$$0.c(b) - 1];
   }

   @Override
   public eii b_(dfl $$0, cpd $$1, gw $$2) {
      return c[$$0.c(b)];
   }

   @Override
   public eii b(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public float b(dfl $$0, cpd $$1, gw $$2) {
      return $$0.c(b) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      dfl $$3 = $$1.a_($$2.d());
      if ($$3.a(apu.cg)) {
         return false;
      } else {
         return $$3.a(apu.ch) ? true : csx.a($$3.k($$1, $$2.d()), hc.b) || $$3.a(this) && $$3.c(b) == 8;
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.a(cqg.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      int $$2 = $$0.c(b);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == hc.b : true;
      }
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(b);
         return $$1.a(b, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }
}
