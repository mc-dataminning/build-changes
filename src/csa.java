import javax.annotation.Nullable;

public abstract class csa extends csl {
   protected static final ehw a = csl.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ehw b = csl.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final egy c = new egy(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   private final dfo d;

   protected csa(dey.d $$0, dfo $$1) {
      super($$0.a($$1.d()));
      this.d = $$1;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int a() {
      return 20;
   }

   @Override
   public boolean a(dez $$0) {
      return true;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ha.b);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bii $$0, cpl $$1, gu $$2, dez $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dez $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.i(), aox.e);
         $$1.a($$0, djj.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.j(), aox.e);
         $$1.a($$0, djj.a, $$2);
      }

      if ($$7) {
         $$1.a(new gu($$2), this, this.a());
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cpl $$0, gu $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$3 == ha.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   protected static int a(cpl $$0, egy $$1, Class<? extends bii> $$2) {
      return $$0.a($$2, $$1, bil.f.and($$0x -> !$$0x.d_())).size();
   }

   protected abstract int b(cpl var1, gu var2);

   protected abstract int g(dez var1);

   protected abstract dez a(dez var1, int var2);
}
