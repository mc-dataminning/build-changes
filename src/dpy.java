import com.mojang.serialization.MapCodec;

public abstract class dpy extends dpw implements dmi {
   public static final ebh e = eax.aA;
   public static final int f = 25;
   private final double c;

   protected dpy(eag.d $$0, ja $$1, ffk $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.C.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dpy> a();

   @Override
   public eah b(azv $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(eah $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iu $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected eah a(eah $$0, azv $$1) {
      return $$0.a(e);
   }

   public eah p(eah $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(eah $$0) {
      return $$0.c(e) == 25;
   }

   protected eah a(eah $$0, eah $$1) {
      return $$1;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == this.a.g()) {
         if (!$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
         } else {
            eah $$8 = $$1.a_($$3.a(this.a));
            if ($$8.a(this) || $$8.a(this.b())) {
               return this.a($$0, this.b().m());
            }
         }
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, ewp.c, ewp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      iu $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azv var1);

   protected abstract boolean h(eah var1);

   @Override
   protected dpy c() {
      return this;
   }
}
