import javax.annotation.Nullable;

public abstract class csf extends csq {
   protected static final eib a = csq.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eib b = csq.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ehd c = new ehd(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   private final dft d;

   protected csf(dfd.d $$0, dft $$1) {
      super($$0.a($$1.d()));
      this.d = $$1;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int a() {
      return 20;
   }

   @Override
   public boolean a(dfe $$0) {
      return true;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, hc.b);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bil $$0, cpq $$1, gw $$2, dfe $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dfe $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.i(), apa.e);
         $$1.a($$0, djo.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.j(), apa.e);
         $$1.a($$0, djo.a, $$2);
      }

      if ($$7) {
         $$1.a(new gw($$2), this, this.a());
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cpq $$0, gw $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$3 == hc.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   protected static int a(cpq $$0, ehd $$1, Class<? extends bil> $$2) {
      return $$0.a($$2, $$1, bio.f.and($$0x -> !$$0x.d_())).size();
   }

   protected abstract int b(cpq var1, gw var2);

   protected abstract int g(dfe var1);

   protected abstract dfe a(dfe var1, int var2);
}
