import javax.annotation.Nullable;

public class end extends enq {
   private final boolean l;
   private float m;
   private float n;

   public end(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dbk $$0, bsq $$1) {
      super.a($$0, $$1);
      $$1.a(enl.j, 0.0F);
      this.m = $$1.a(enl.c);
      $$1.a(enl.c, 6.0F);
      this.n = $$1.a(enl.k);
      $$1.a(enl.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(enl.c, this.m);
      this.b.a(enl.k, this.n);
      super.b();
   }

   @Override
   public eng a() {
      return !this.b.be() ? super.a() : this.c(new io(ayd.a(this.b.cK().a), ayd.a(this.b.cK().b + 0.5), ayd.a(this.b.cK().c)));
   }

   @Override
   public enp a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eng[] $$0, eng $$1) {
      int $$2 = super.a($$0, $$1);
      enl $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      enl $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != enl.w) {
         $$5 = ayd.d(Math.max(1.0F, this.b.dJ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new io($$1.a, $$1.b, $$1.c));
      eng $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, it.b, $$4);
      eng $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, it.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != enl.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eng $$11 = $$0[$$10];
         if ($$11.l == enl.j && this.l && $$11.b < this.b.dP().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eng $$0, eng $$1) {
      return this.a($$0, $$1) && $$0.l == enl.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public enl a(enn $$0, int $$1, int $$2, int $$3) {
      enl $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == enl.j) {
         io.a $$5 = new io.a();

         for (it $$6 : it.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            enl $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == enl.a) {
               return enl.k;
            }
         }

         return enl.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
