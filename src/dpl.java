import com.mojang.serialization.MapCodec;

public abstract class dpl extends dpj implements dlx {
   public static final eao e = eae.aA;
   public static final int f = 25;
   private final double c;

   protected dpl(dzn.d $$0, ja $$1, feq $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.B.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dpl> a();

   @Override
   public dzo b(azt $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(dzo $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iu $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dzo a(dzo $$0, azt $$1) {
      return $$0.a(e);
   }

   public dzo p(dzo $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dzo $$0) {
      return $$0.c(e) == 25;
   }

   protected dzo a(dzo $$0, dzo $$1) {
      return $$1;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, evw.c, evw.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      iu $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azt var1);

   protected abstract boolean h(dzo var1);

   @Override
   protected dpl c() {
      return this;
   }
}
