public abstract class cwk extends cwi implements csz {
   public static final dgl d = dgb.ax;
   public static final int e = 25;
   private final double f;

   protected cwk(dfk.d $$0, hc $$1, eii $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.f = $$4;
      this.k(this.C.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public dfl a(cpy $$0) {
      return this.n().a(d, Integer.valueOf($$0.D_().a(25)));
   }

   @Override
   public boolean e_(dfl $$0) {
      return $$0.c(d) < 25;
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$0.c(d) < 25 && $$3.j() < this.f) {
         gw $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dfl a(dfl $$0, ase $$1) {
      return $$0.a(d);
   }

   public dfl n(dfl $$0) {
      return $$0.a(d, Integer.valueOf(25));
   }

   public boolean o(dfl $$0) {
      return $$0.c(d) == 25;
   }

   protected dfl a(dfl $$0, dfl $$1) {
      return $$1;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.a())) {
         if (this.b) {
            $$3.a($$4, eap.c, eap.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.a().n());
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      gw $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(d) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(d, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(ase var1);

   protected abstract boolean g(dfl var1);

   @Override
   protected cwk b() {
      return this;
   }
}
