import javax.annotation.Nullable;

public class eet extends efe {
   private final boolean l;
   private float m;
   private float n;

   public eet(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(ctv $$0, bmh $$1) {
      super.a($$0, $$1);
      $$1.a(eev.j, 0.0F);
      this.m = $$1.a(eev.c);
      $$1.a(eev.c, 6.0F);
      this.n = $$1.a(eev.k);
      $$1.a(eev.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eev.c, this.m);
      this.b.a(eev.k, this.n);
      super.b();
   }

   @Override
   public eex a() {
      return !this.b.aZ() ? super.a() : this.c(new hx(aui.a(this.b.cH().a), aui.a(this.b.cH().b + 0.5), aui.a(this.b.cH().c)));
   }

   @Override
   public efd a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aui.a($$0), aui.a($$1 + 0.5), aui.a($$2)));
   }

   @Override
   public int a(eex[] $$0, eex $$1) {
      int $$2 = super.a($$0, $$1);
      eev $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eev $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eev.w) {
         $$5 = aui.d(Math.max(1.0F, this.b.dG()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new hx($$1.a, $$1.b, $$1.c));
      eex $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ic.b, $$4);
      eex $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ic.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eev.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eex $$11 = $$0[$$10];
         if ($$11.l == eev.j && this.l && $$11.b < this.b.dM().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eex $$0, eex $$1) {
      return this.a($$0, $$1) && $$0.l == eev.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eev a(cso $$0, int $$1, int $$2, int $$3) {
      hx.a $$4 = new hx.a();
      eev $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eev.j) {
         for (ic $$6 : ic.values()) {
            eev $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == eev.a) {
               return eev.k;
            }
         }

         return eev.j;
      } else {
         return a($$0, $$4);
      }
   }
}
