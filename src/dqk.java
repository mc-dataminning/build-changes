import com.mojang.serialization.MapCodec;

public abstract class dqk extends dqi implements dmu {
   public static final ebt e = ebj.aA;
   public static final int f = 25;
   private final double c;

   protected dqk(eas.d $$0, jb $$1, ffw $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.C.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dqk> a();

   @Override
   public eat b(azv $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(eat $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iv $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected eat a(eat $$0, azv $$1) {
      return $$0.a(e);
   }

   public eat p(eat $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(eat $$0) {
      return $$0.c(e) == 25;
   }

   protected eat a(eat $$0, eat $$1) {
      return $$1;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == this.a.g()) {
         if (!$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
         } else {
            eat $$8 = $$1.a_($$3.a(this.a));
            if ($$8.a(this) || $$8.a(this.b())) {
               return this.a($$0, this.b().m());
            }
         }
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, exb.c, exb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
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

   protected abstract boolean h(eat var1);

   @Override
   protected dqk c() {
      return this;
   }
}
