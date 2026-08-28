import com.mojang.serialization.MapCodec;

public abstract class dme extends dmc implements dit {
   public static final dwu e = dwl.ax;
   public static final int f = 25;
   private final double c;

   protected dme(dvu.d $$0, jm $$1, fas $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dme> a();

   @Override
   public dvv b(azu $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(dvv $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jh $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dvv a(dvv $$0, azu $$1) {
      return $$0.a(e);
   }

   public dvv p(dvv $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dvv $$0) {
      return $$0.c(e) == 25;
   }

   protected dvv a(dvv $$0, dvv $$1) {
      return $$1;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, erw.c, erw.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      jh $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azu var1);

   protected abstract boolean h(dvv var1);

   @Override
   protected dme c() {
      return this;
   }
}
