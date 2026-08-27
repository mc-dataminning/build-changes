import javax.annotation.Nullable;

public class eap extends eba {
   private final boolean l;
   private float m;
   private float n;

   public eap(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(cqo $$0, bjo $$1) {
      super.a($$0, $$1);
      $$1.a(ear.j, 0.0F);
      this.m = $$1.a(ear.c);
      $$1.a(ear.c, 6.0F);
      this.n = $$1.a(ear.k);
      $$1.a(ear.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(ear.c, this.m);
      this.b.a(ear.k, this.n);
      super.b();
   }

   @Override
   public eat a() {
      return !this.b.aX() ? super.a() : this.c(new gw(asb.a(this.b.cG().a), asb.a(this.b.cG().b + 0.5), asb.a(this.b.cG().c)));
   }

   @Override
   public eaz a(double $$0, double $$1, double $$2) {
      return this.a(this.b(asb.a($$0), asb.a($$1 + 0.5), asb.a($$2)));
   }

   @Override
   public int a(eat[] $$0, eat $$1) {
      int $$2 = super.a($$0, $$1);
      ear $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      ear $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != ear.w) {
         $$5 = asb.d(Math.max(1.0F, this.b.dF()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new gw($$1.a, $$1.b, $$1.c));
      eat $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ha.b, $$4);
      eat $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ha.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != ear.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eat $$11 = $$0[$$10];
         if ($$11.l == ear.j && this.l && $$11.b < this.b.dL().y_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eat $$0, eat $$1) {
      return this.a($$0, $$1) && $$0.l == ear.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public ear a(cph $$0, int $$1, int $$2, int $$3) {
      gw.a $$4 = new gw.a();
      ear $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == ear.j) {
         for (ha $$6 : ha.values()) {
            ear $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == ear.a) {
               return ear.k;
            }
         }

         return ear.j;
      } else {
         return a($$0, $$4);
      }
   }
}
