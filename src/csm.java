import javax.annotation.Nullable;

public abstract class csm extends csx {
   protected static final eii a = csx.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eii b = csx.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ehk c = new ehk(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   private final dga d;

   protected csm(dfk.d $$0, dga $$1) {
      super($$0.a($$1.d()));
      this.d = $$1;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int a() {
      return 20;
   }

   @Override
   public boolean a(dfl $$0) {
      return true;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, hc.b);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bis $$0, cpx $$1, gw $$2, dfl $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dfl $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.i(), apg.e);
         $$1.a($$0, djv.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.j(), apg.e);
         $$1.a($$0, djv.a, $$2);
      }

      if ($$7) {
         $$1.a(new gw($$2), this, this.a());
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cpx $$0, gw $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$3 == hc.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   protected static int a(cpx $$0, ehk $$1, Class<? extends bis> $$2) {
      return $$0.a($$2, $$1, biv.f.and($$0x -> !$$0x.p_())).size();
   }

   protected abstract int b(cpx var1, gw var2);

   protected abstract int g(dfl var1);

   protected abstract dfl a(dfl var1, int var2);
}
