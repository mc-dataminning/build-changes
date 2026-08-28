import javax.annotation.Nullable;

public class eof extends eos {
   private final boolean l;
   private float m;
   private float n;

   public eof(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(dcm $$0, bts $$1) {
      super.a($$0, $$1);
      $$1.a(eon.j, 0.0F);
      this.m = $$1.a(eon.c);
      $$1.a(eon.c, 6.0F);
      this.n = $$1.a(eon.k);
      $$1.a(eon.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(eon.c, this.m);
      this.b.a(eon.k, this.n);
      super.b();
   }

   @Override
   public eoi a() {
      return !this.b.be() ? super.a() : this.c(new iz(ayz.a(this.b.cK().a), ayz.a(this.b.cK().b + 0.5), ayz.a(this.b.cK().c)));
   }

   @Override
   public eor a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(eoi[] $$0, eoi $$1) {
      int $$2 = super.a($$0, $$1);
      eon $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      eon $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != eon.w) {
         $$5 = ayz.d(Math.max(1.0F, this.b.dJ()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new iz($$1.a, $$1.b, $$1.c));
      eoi $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, je.b, $$4);
      eoi $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, je.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != eon.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         eoi $$11 = $$0[$$10];
         if ($$11.l == eon.j && this.l && $$11.b < this.b.dP().z_() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable eoi $$0, eoi $$1) {
      return this.a($$0, $$1) && $$0.l == eon.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public eon a(eop $$0, int $$1, int $$2, int $$3) {
      eon $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eon.j) {
         iz.a $$5 = new iz.a();

         for (je $$6 : je.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            eon $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == eon.a) {
               return eon.k;
            }
         }

         return eon.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
