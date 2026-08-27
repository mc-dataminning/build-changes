import javax.annotation.Nullable;

public class edg extends edr {
   private final boolean l;
   private float m;
   private float n;

   public edg(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(css $$0, bln $$1) {
      super.a($$0, $$1);
      $$1.a(edi.j, 0.0F);
      this.m = $$1.a(edi.c);
      $$1.a(edi.c, 6.0F);
      this.n = $$1.a(edi.k);
      $$1.a(edi.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(edi.c, this.m);
      this.b.a(edi.k, this.n);
      super.b();
   }

   @Override
   public edk a() {
      return !this.b.aZ() ? super.a() : this.c(new hx(atq.a(this.b.cH().a), atq.a(this.b.cH().b + 0.5), atq.a(this.b.cH().c)));
   }

   @Override
   public edq a(double $$0, double $$1, double $$2) {
      return this.a(this.b(atq.a($$0), atq.a($$1 + 0.5), atq.a($$2)));
   }

   @Override
   public int a(edk[] $$0, edk $$1) {
      int $$2 = super.a($$0, $$1);
      edi $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      edi $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != edi.w) {
         $$5 = atq.d(Math.max(1.0F, this.b.dH()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new hx($$1.a, $$1.b, $$1.c));
      edk $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, ib.b, $$4);
      edk $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, ib.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != edi.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         edk $$11 = $$0[$$10];
         if ($$11.l == edi.j && this.l && $$11.b < this.b.dN().A_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable edk $$0, edk $$1) {
      return this.a($$0, $$1) && $$0.l == edi.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public edi a(crl $$0, int $$1, int $$2, int $$3) {
      hx.a $$4 = new hx.a();
      edi $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == edi.j) {
         for (ib $$6 : ib.values()) {
            edi $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == edi.a) {
               return edi.k;
            }
         }

         return edi.j;
      } else {
         return a($$0, $$4);
      }
   }
}
