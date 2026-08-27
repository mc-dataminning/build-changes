import javax.annotation.Nullable;

public class cyk extends cvb implements csz {
   public static final dgl b = dgb.at;
   public static final int c = 4;
   private static final int d = 3;
   private static final int e = 1;
   private static final eii f = csx.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eii g = csx.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eii h = csx.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eii i = csx.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eii[] j = new eii[]{csx.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), f};
   private static final eii[] k = new eii[]{h, csx.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), g, g, g};

   public cyk(dfk.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      return this.n();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return $$0.c(a) == dgh.a ? j[Math.min(Math.abs(4 - ($$0.c(b) + 1)), j.length - 1)] : k[$$0.c(b)];
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      if ($$0.c(b) == 0) {
         return h;
      } else {
         return $$0.c(a) == dgh.b ? i : super.c($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if (b($$0.c(b))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : csy.a.n();
      }
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.a(csy.cC);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
      super.a($$0);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if ($$3 instanceof bzp && $$1.X().b(cpt.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      return false;
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
   }

   @Override
   public boolean e_(dfl $$0) {
      return $$0.c(a) == dgh.b && !this.n($$0);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      float $$4 = cuo.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aks $$0, dfl $$1, gw $$2, int $$3) {
      int $$4 = Math.min($$1.c(b) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dfl $$5 = $$1.a(b, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(a, dgh.a), 3);
         }
      }
   }

   private static boolean a(cqa $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(csy.kB);
   }

   private static boolean b(cqa $$0, gw $$1) {
      return cuo.a($$0, $$1);
   }

   private static boolean h(dfl $$0) {
      return $$0.a(csy.kB) && $$0.c(a) == dgh.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cqa $$0, gw $$1, dfl $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dfl $$0) {
      return $$0.c(b) >= 4;
   }

   @Nullable
   private cyk.a c(cqa $$0, gw $$1, dfl $$2) {
      if (h($$2)) {
         return new cyk.a($$1, $$2);
      } else {
         gw $$3 = $$1.d();
         dfl $$4 = $$0.a_($$3);
         return h($$4) ? new cyk.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      cyk.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(b) + 1);
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      cyk.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(gw a, dfl b) {
   }
}
