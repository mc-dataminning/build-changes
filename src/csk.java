import javax.annotation.Nullable;

public abstract class csk extends csv {
   protected static final eig a = csv.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eig b = csv.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ehi c = new ehi(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   private final dfy d;

   protected csk(dfi.d $$0, dfy $$1) {
      super($$0.a($$1.d()));
      this.d = $$1;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int a() {
      return 20;
   }

   @Override
   public boolean a(dfj $$0) {
      return true;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ha.b);
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable biq $$0, cpv $$1, gw $$2, dfj $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dfj $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.i(), ape.e);
         $$1.a($$0, djt.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.j(), ape.e);
         $$1.a($$0, djt.a, $$2);
      }

      if ($$7) {
         $$1.a(new gw($$2), this, this.a());
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cpv $$0, gw $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return $$3 == ha.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }

   protected static int a(cpv $$0, ehi $$1, Class<? extends biq> $$2) {
      return $$0.a($$2, $$1, bit.f.and($$0x -> !$$0x.p_())).size();
   }

   protected abstract int b(cpv var1, gw var2);

   protected abstract int g(dfj var1);

   protected abstract dfj a(dfj var1, int var2);
}
