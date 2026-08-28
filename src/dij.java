import com.mojang.serialization.MapCodec;

public abstract class dij extends dih implements dex {
   public static final dsx e = dsn.ax;
   public static final int f = 25;
   private final double c;

   protected dij(drw.d $$0, je $$1, ewf $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dij> a();

   @Override
   public drx a(dbu $$0) {
      return this.n().a(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean d_(drx $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iz $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected drx a(drx $$0, azc $$1) {
      return $$0.a(e);
   }

   public drx n(drx $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(drx $$0) {
      return $$0.c(e) == 25;
   }

   protected drx a(drx $$0, drx $$1) {
      return $$1;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, enr.c, enr.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().n());
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      iz $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azc var1);

   protected abstract boolean g(drx var1);

   @Override
   protected dij c() {
      return this;
   }
}
