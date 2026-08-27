import com.mojang.serialization.MapCodec;

public abstract class dcd extends dcb implements cyr {
   public static final dmf e = dlv.ax;
   public static final int f = 25;
   private final double c;

   protected dcd(dle.d $$0, ie $$1, eol $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.k(this.E.b().a(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dcd> a();

   @Override
   public dlf a(cvo $$0) {
      return this.o().a(e, Integer.valueOf($$0.F_().a(25)));
   }

   @Override
   protected boolean e_(dlf $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         hz $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dlf a(dlf $$0, awo $$1) {
      return $$0.a(e);
   }

   public dlf n(dlf $$0) {
      return $$0.a(e, Integer.valueOf(25));
   }

   public boolean o(dlf $$0) {
      return $$0.c(e) == 25;
   }

   protected dlf a(dlf $$0, dlf $$1) {
      return $$1;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, egq.c, egq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      hz $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.a(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(awo var1);

   protected abstract boolean g(dlf var1);

   @Override
   protected dcd c() {
      return this;
   }
}
