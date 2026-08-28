import com.mojang.serialization.MapCodec;

public abstract class dqf extends dqd implements dmp {
   public static final ebo e = ebe.aA;
   public static final int f = 25;
   private final double c;

   protected dqf(ean.d $$0, jb $$1, ffr $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.C.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dqf> a();

   @Override
   public eao b(azv $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(eao $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iv $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected eao a(eao $$0, azv $$1) {
      return $$0.a(e);
   }

   public eao p(eao $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(eao $$0) {
      return $$0.c(e) == 25;
   }

   protected eao a(eao $$0, eao $$1) {
      return $$1;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == this.a.g()) {
         if (!$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
         } else {
            eao $$8 = $$1.a_($$3.a(this.a));
            if ($$8.a(this) || $$8.a(this.b())) {
               return this.a($$0, this.b().m());
            }
         }
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, eww.c, eww.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      iv $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azv var1);

   protected abstract boolean h(eao var1);

   @Override
   protected dqf c() {
      return this;
   }
}
